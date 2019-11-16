package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		Cercle cerc= new Cercle(5);
		Rectangle rect= new Rectangle(2,5);
		Carre carre= new Carre(5);
		
		AffichageForme.afficher(cerc);
		AffichageForme.afficher(rect);
		AffichageForme.afficher(carre);

	}

}
