package personnages;

public class Romain { 
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0;
		int forceDebut = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne !");
		}
		assert isInvariantVerified();
		assert force != forceDebut;
	}
	
	private boolean isInvariantVerified() {
		return this.force > 0;
	}
	
	public static void main(String [] args) {
		Romain romain2 = new Romain("romain2", 6);
		romain2.recevoirCoup(5);
		romain2.parler("Je teste la méthode parler");
	}
}