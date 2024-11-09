package villagegaulois;

import personnages.Equipement;
import personnages.Gaulois;

public class Trophee {
	private Gaulois gaulois;
	private Equipement equipement;
	
	public Trophee(Gaulois gaulois, Equipement equipement) {
		this.gaulois = gaulois;
		this.equipement = equipement;
	}

	public Gaulois getGaulois() {
		return gaulois;
	}

	public Equipement getEquipement() {
		return equipement;
	}
	
	public String donnerNom() {
		return gaulois.getNom();
	}
	
	public static void main(String args[]) {
		Gaulois gaulois1 = new Gaulois("testix", 69);
		Equipement casque1 = Equipement.BOUCLIER;
		Trophee trophee1 = new Trophee(gaulois1,casque1);
		System.out.println(trophee1.getEquipement());
		System.out.println(trophee1.getGaulois());
		System.out.println(trophee1.donnerNom());
	}
}

