package villagegaulois;

import personnages.Chef;
import personnages.Gaulois;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villagois;
	private int nbVillagois;

	public Village(String nom, int nbVillagoisMaximum) {
		this.nom = nom;
		this.villagois = new Gaulois[nbVillagoisMaximum];
		this.nbVillagois = 0;
	}

	public String getNom() {
		return nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	private void ajouterHabitant(Gaulois gaulois) {
		this.villagois[nbVillagois] = gaulois;
		nbVillagois = nbVillagois + 1;	
	}
	
	private Gaulois trouverHabitant(int numero) {
		return(villagois[numero]);
	}
	
	private void afficherVillagois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires Gaulois :");
		for (int i=0;i<nbVillagois;i++) {
			System.out.println("- " + villagois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		
		/*
		Gaulois gaulois = village.trouverHabitant(30);
		On obtient l'exception suivante : java.lang.ArrayIndexOutOfBoundsException
		Cela est du au fait que l'on essaie d'accéder à un indice trop grand du tableau villagois (Les indices vont de 0 à 29)
		 */
		
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraracourcix);
		
		/*
		Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois);
		Le sysout renvoie "null"
		Cela est du au fait que le tableau villagois est initialisé à l'indice 1, mais vide, parce que abraracourcix est à l'indice 0
		*/
		
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		village.trouverHabitant(0);
		village.afficherVillagois();

	}
}