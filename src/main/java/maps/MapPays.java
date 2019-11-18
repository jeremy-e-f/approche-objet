package maps;

import java.util.HashMap;
import java.util.HashSet;

import sets.Pays;

public class MapPays {

	public static void main(String[] args) {
		HashMap<String, Pays> hashMap= new HashMap<String, Pays>();
		
		HashSet<Pays> set= new HashSet<Pays>();
		set.add(new Pays("Usa",380000458,1245859869));
		set.add(new Pays("France",67485856,124585869));
		set.add(new Pays("Allemagne",87485856,224585869));
		set.add(new Pays("Uk",65485856,130585869));
		set.add(new Pays("Italie",35485856,90585869));
		set.add(new Pays("Japon",180485856,300148869));
		set.add(new Pays("Russie",50485856,41485869));
		set.add(new Pays("Inde",1250485856,489485869));
		
		for(Pays pays : set){
			hashMap.put(pays.getNom(), pays);
		}
		
		/* Recherchez et supprimez le pays qui a le moins d’habitants s*/
		Pays leMoinsHabitants= null;
		for(Pays pays : hashMap.values()){
			if(leMoinsHabitants== null || pays.getNbHabitants()< leMoinsHabitants.getNbHabitants()){
				leMoinsHabitants= pays;
			}
		}
		hashMap.remove(leMoinsHabitants.getNom());
		
		for(Pays pays : hashMap.values()){
			System.out.println(pays);
		}
	}

}
