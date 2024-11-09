package villagegaulois;

import personnages.Equipement;
import personnages.Gaulois;

public class Musee {
	private Trophee[] trophees = new Trophee[100];
	private int nbTrophee = 0;


	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		trophees[nbTrophee] = new Trophee(gaulois, equipement);
		nbTrophee += 1;
	}
	
	public String extraireInstructionsOCaml() {
		String texte = "let musee = [\n";
		for (int i = 0; i < nbTrophee; i++) {
			texte += "	\"";
			texte += trophees[i].donnerNom();
			texte += "\", \"";
			texte += trophees[i].getEquipement().toString();
			texte += "\"";
			if (i == nbTrophee - 1)
				texte += ";";
			texte += "\n";
		}
		texte += "]";
		return texte;
		
	}
}