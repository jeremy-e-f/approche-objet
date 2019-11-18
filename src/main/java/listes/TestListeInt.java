package listes;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListeInt {

	public static void main(String[] args) {
		ArrayList<Integer> listeEntiers= new ArrayList<Integer>();
		listeEntiers.add(-1);
		listeEntiers.add(5);
		listeEntiers.add(7);
		listeEntiers.add(3);
		listeEntiers.add(-2);
		listeEntiers.add(4);
		listeEntiers.add(8);
		listeEntiers.add(5);

		for(Integer entier : listeEntiers){
			System.out.print(" "+entier);
		}
		System.out.println("\nTaille de la liste: "+listeEntiers.size());
		
		int max= Integer.MIN_VALUE;
		/* Recherche du maximum */
		for(Integer entier : listeEntiers){
			if(entier> max){
				max= entier;
			}
		}
		System.out.println("Maximum  de la liste: "+max);
		
		/* Supprimer le plus petit élément de la liste */
		Integer min= Integer.MAX_VALUE;
		for(Integer entier : listeEntiers){
			if(entier< min){
				min= entier; 
			}
		}
		listeEntiers.remove(min);
		System.out.println("Minimum  de la liste: "+min);
		
		/* Rechercher éléments négatifs */
		ListIterator<Integer> it= listeEntiers.listIterator();
		while(it.hasNext()){
			Integer entier= it.next();
			if(entier< 0){
				it.set(Math.abs(entier));
			}
		}
		for(Integer entier : listeEntiers){
			System.out.print(" "+entier);
		}
		
	}

}
