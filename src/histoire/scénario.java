package histoire;

import personnages.Gaulois;
import personnages.Druide;
import personnages.Romain;

public class sc�nario {

	public static void main(String[] args) {
		System.out.println("\n");
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		Gaulois obelix = new Gaulois("Ob�lix", 25);
		
		panoramix.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);

	}

}
