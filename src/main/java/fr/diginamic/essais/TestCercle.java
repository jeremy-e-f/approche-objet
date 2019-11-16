package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// Exercice cercle
		Cercle c1= new Cercle(5);
		Cercle c2= new Cercle(10);
		
		System.out.println("\nCercle c1:"+
			"\npérimètre= "+Math.round(c1.perimetre())+
			"\nsurface= "+Math.round(c1.surface()));
		
		System.out.println("\nCercle c2:"+
				"\npérimètre= "+Math.round(c2.perimetre())+
				"\nsurface= "+Math.round(c2.surface()));
		
		// Exercice CercleFactory
		Cercle nouveauCercleRayon7= CercleFactory.genererCercle(7);
		

	}

}
