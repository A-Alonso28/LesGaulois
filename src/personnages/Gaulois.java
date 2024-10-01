package personnages;

public class Gaulois {

	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un tr�s grand coup dans la m�choir de " + romain.getNom());
		romain.recevoirCoup(force / 3 * effetPotion);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois d�cupl�e");
	}

	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		System.out.println(asterix.nom);
		System.out.println(asterix);
		asterix.parler("Je teste la m�thode parler");
		Romain romain1 = new Romain("romain", 10);
		asterix.boirePotion(5);
		asterix.frapper(romain1);
		
	}
}