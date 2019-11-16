package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme{
	
	public static void afficher(Forme forme){
		System.out.println("\nForme "+forme.getClass().getSimpleName()+
				"\np�rim�tre: "+forme.calculerPerimetre()+
				"\nsurface: "+forme.calculerSurface());
	}
	
}
