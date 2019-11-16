package fr.diginamic.chaines;

import banque.entities.Compte;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;012543;1 523.5";
		
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		System.out.println("Taille de la chaine de caractères: "+chaine.length());
		
		System.out.println("Index du premier \";\": "+chaine.indexOf(';'));
		
		String nomFamille= chaine.substring(0,chaine.indexOf(';'));
		System.out.println("Nom de famille : "+nomFamille);
		
		System.out.println(nomFamille.toUpperCase());
		
		System.out.println(nomFamille.toLowerCase());
		
		System.out.println("\nDécomposition des chaines: ");
		String[] tableauChaines= chaine.split(";");
		for(String sousChaine : tableauChaines) {
			System.out.println(sousChaine);
		}
		
		System.out.println("\nCompte & client: ");
		Compte c= new Compte(tableauChaines[2], Double.parseDouble(tableauChaines[3].replace(" ","")));
		System.out.println(c);
		// Client à réaliser
		
		
		
		
	}

}
