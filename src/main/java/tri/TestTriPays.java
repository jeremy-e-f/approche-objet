package tri;

import java.util.ArrayList;

import entites.Pays;

public class TestTriPays {

	public static void main(String[] args) {
		ArrayList<Pays> listePays= new ArrayList<Pays>();
		listePays.add(new Pays("Usa",380000458,1245859869));
		listePays.add(new Pays("France",67485856,124585869));
		listePays.add(new Pays("Allemagne",87485856,224585869));
		listePays.add(new Pays("Uk",65485856,130585869));
		listePays.add(new Pays("Italie",35485856,90585869));
		listePays.add(new Pays("Japon",180485856,300148869));
		listePays.add(new Pays("Russie",50485856,41485869));
		listePays.add(new Pays("Inde",1250485856,489485869));
		
		listePays.sort(null);
		
		for(Pays pays: listePays){
			System.out.println(pays);
		}
		
		/* Tri en fonction du nombre d'habitants */
		System.out.println("\nTri en fonction du nombre d'habitant");
		listePays.sort(new ComparatorHabitant());
		for(Pays pays: listePays){
			System.out.println(pays);
		}
		
		/* Tri en fonction du PIB par habitants */
		System.out.println("\nTri en fonction du PIB par habitant");
		listePays.sort(new ComparatorPibHabitant());
		for(Pays pays: listePays){
			System.out.println(pays);
		}
	}

}
