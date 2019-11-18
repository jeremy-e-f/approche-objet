package listes;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListVille {

	public static void main(String[] args) {
		ArrayList<Ville> listeVilles= new ArrayList<Ville>();
		listeVilles.add(new Ville("Nice", 343_000 ));
		listeVilles.add(new Ville("Carcassonne", 47_800));
		listeVilles.add(new Ville("Narbonne", 53_400));
		listeVilles.add(new Ville("Lyon", 484_000));
		listeVilles.add(new Ville("Foix", 9_700));
		listeVilles.add(new Ville("Pau", 77_200));
		listeVilles.add(new Ville("Marseille", 850_700));
		listeVilles.add(new Ville("Tarbes", 40_600));
		
		// Ville la plus peuplée
		Ville laPlusPeuplee= listeVilles.get(0);
		for(Ville ville: listeVilles){
			if(laPlusPeuplee.getNbHabitants()< ville.getNbHabitants()){
				laPlusPeuplee= ville;
			}
		}
		System.out.println("Ville la plus peuplée: "+laPlusPeuplee.getNom());
		
		// Ville la moins peuplée
		Ville laMoinsPeuplee= listeVilles.get(0);
		for(Ville ville: listeVilles){
			if(laMoinsPeuplee.getNbHabitants()> ville.getNbHabitants()){
				laMoinsPeuplee= ville;
			}
		}
		listeVilles.remove(laMoinsPeuplee);
		System.out.println("Ville la moins peuplée: "+laMoinsPeuplee.getNom());
		
		/* Ville de plus de 100 000 en majuscule */
		ListIterator<Ville> it= listeVilles.listIterator();
		while(it.hasNext()){
			Ville ville= it.next();
			if(ville.getNbHabitants()> 100_000){
				ville.setNom(ville.getNom().toUpperCase());
				it.set(ville);
			}
		}
		for(Ville ville: listeVilles){
			System.out.println(ville);
		}
	}

}
