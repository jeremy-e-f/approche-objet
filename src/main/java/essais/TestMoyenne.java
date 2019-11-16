package essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne cm1= new CalculMoyenne();
		cm1.ajout(5);
		cm1.ajout(7);
		cm1.ajout(8);
		cm1.ajout(1.5);
		System.out.println("La moyenne cm1 est de : "+cm1.calcul());
		System.out.println("Moyenne calculée : "+((5+7+8+1.5)/4));
		cm1.ajout(3.5);
		cm1.ajout(5);
		cm1.ajout(5);
		cm1.ajout(5);
		cm1.ajout(5);
		cm1.ajout(5);
		cm1.ajout(5);
		cm1.ajout(5);
		cm1.ajout(5);
		cm1.ajout(5);
		cm1.ajout(5);
		System.out.println("\nLa moyenne cm1 est de : "+cm1.calcul());
		System.out.println("Moyenne calculée : "+((5+7+8+1.5+3.5+5+5+5+5+5+5+5+5+5+5)/15));
	}

}
