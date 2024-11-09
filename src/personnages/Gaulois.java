package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int nbTrophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un très grand coup dans la mâchoir de " + romain.getNom());
//		romain.recevoirCoup(force / 3 * effetPotion);
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] tropheesBataille = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; tropheesBataille != null && i < tropheesBataille.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = tropheesBataille[i];
		}
	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée");
	}
 
	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.nom);
		System.out.println(asterix);
		asterix.parler("Je teste la méthode parler");
		Romain romain1 = new Romain("romain", 10);
		asterix.boirePotion(5);
		asterix.frapper(romain1);
		
		System.out.println(asterix);
		
	}
}