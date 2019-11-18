package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> listeVilles= new ArrayList<String>();
		listeVilles.addAll(Arrays.asList("Nice","Carcassonne","Narbonne","Lyon","Foix","Pau","Marseille","Tarbes"));
		
		/* Ville, le plus grand nombre de lettres */
		String villeNomPlusGrand= "";
		for(String ville: listeVilles){
			if(ville.length()> villeNomPlusGrand.length()){
				villeNomPlusGrand= ville;
			}
		}
		System.out.println(villeNomPlusGrand);
		
		/* En majuscule */
		System.out.println("En majuscule");
		ListIterator<String> it= listeVilles.listIterator();
		while(it.hasNext()){
			String ville= it.next().toUpperCase();
			it.set(ville);
		}
		for(String ville: listeVilles){
			System.out.print(ville+" ");
		}
		
		/* Supprimer de la liste les villes dont les noms commencent par N */
		System.out.println("\nSupprimer de la liste les villes dont les noms commencent par N");
		it= listeVilles.listIterator();
		while(it.hasNext()){
			String ville= it.next();
			if(ville.startsWith("N"))
				it.remove();
		}
		for(String ville: listeVilles){
			System.out.print(ville+" ");
		}
		
	}

}
