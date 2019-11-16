package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		Maison maison= new Maison();
		maison.ajouterPiece(new Chambre(33.4, 1));
		maison.ajouterPiece(new Chambre(33.4, 1));
		maison.ajouterPiece(new Chambre(25.9, 1));
		maison.ajouterPiece(new SalleDeBain(15.4, 1));
		maison.ajouterPiece(new WC(7.2, 1));
		maison.ajouterPiece(new WC(8.1, 0));
		maison.ajouterPiece(new Cuisine(15.1, 0));
		maison.ajouterPiece(new Salon(26.8, 0));
		
		maison.ajouterPiece(null);
		maison.ajouterPiece(new Salon(-25, 0));
		
		System.out.println("Superficie totale: "+maison.calculerSuperficieTotale());
		System.out.println("Superficie totale du 1er étage: "+maison.calculerSuperficieTotale(0));
		System.out.println("Superficie totale du 2ème étage: "+maison.calculerSuperficieTotale(1));
		
		System.out.println("Superficie totale des chambres: "+maison.calculerSuperficieTotale("chambre"));
		System.out.println("Nombre total des chambres: "+maison.getNombrePieces("chambre"));
	}

}
