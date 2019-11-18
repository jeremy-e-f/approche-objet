package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetObjet {

	public static void main(String[] args) {
		HashSet<Pays> set= new HashSet<Pays>();
		set.add(new Pays("Usa",380000458,1245859869));
		set.add(new Pays("France",67485856,124585869));
		set.add(new Pays("Allemagne",87485856,224585869));
		set.add(new Pays("Uk",65485856,130585869));
		set.add(new Pays("Italie",35485856,90585869));
		set.add(new Pays("Japon",180485856,300148869));
		set.add(new Pays("Russie",50485856,41485869));
		set.add(new Pays("Inde",1250485856,489485869));
		
		Iterator<Pays> it= set.iterator();
		Pays lePlusGrandPIB= it.next();
		while(it.hasNext()){
			Pays pays= it.next();
			if(pays.getNbHabitants()> lePlusGrandPIB.getNbHabitants()){
				lePlusGrandPIB= pays;
			}
		}
		System.out.println("Pays avec le plus grand PIB par habitant: "+lePlusGrandPIB);
		
		it= set.iterator();
		Pays lePlusGrandPIBTOTAL= it.next();
		while(it.hasNext()){
			Pays pays= it.next();
			if(pays.getNbHabitants()*pays.getPibParHabitant()> lePlusGrandPIBTOTAL.getNbHabitants()*lePlusGrandPIBTOTAL.getPibParHabitant()){
				lePlusGrandPIBTOTAL= pays;
			}
		}
		System.out.println("Pays avec le plus grand PIB TOTAL: "+lePlusGrandPIBTOTAL);
		
		it= set.iterator();
		Pays lePlusPetitPIBTOTAL= it.next();
		while(it.hasNext()){
			Pays pays= it.next();
			if(pays.getNbHabitants()*pays.getPibParHabitant()< lePlusPetitPIBTOTAL.getNbHabitants()*lePlusPetitPIBTOTAL.getPibParHabitant()){
				lePlusPetitPIBTOTAL= pays;
			}
		}
		lePlusPetitPIBTOTAL.setNom(lePlusPetitPIBTOTAL.getNom().toUpperCase());
		System.out.println("Pays avec le plus petit PIB TOTAL: "+lePlusPetitPIBTOTAL);

		// Suppression du pays avec le PIB le plus faible
		set.remove(lePlusPetitPIBTOTAL);
		
		for(Pays pays: set){
			System.out.println(pays);
		}
		
	}

}
