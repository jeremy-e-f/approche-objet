package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// Afficher liste des valeurs de énumérations
		for(Saison s : Saison.values()){
			System.out.println(s);
		}
		
		// Rechercher saison
		String nom = "ETE";
		Saison recherche= Saison.valueOf(nom);
		System.out.println(recherche);
		
		String libelle = "Hiver";
		System.out.println(Saison.getSaison(libelle));
		
	}

}
