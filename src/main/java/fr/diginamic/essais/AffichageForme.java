package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme{
	
	public static void afficher(Forme forme){
		System.out.println("\nForme "+forme.getClass().getSimpleName()+
				"\npérimètre: "+forme.calculerPerimetre()+
				"\nsurface: "+forme.calculerSurface());
	}
	
}
