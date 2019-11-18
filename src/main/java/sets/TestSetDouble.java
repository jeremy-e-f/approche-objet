package sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		HashSet<Double> set= new HashSet<Double>();
		set.addAll(Arrays.asList(1.5,8.25,-7.32,13.3,-12.45,48.5,0.01));
		
		for(Double d : set){
			System.out.print(d+" ");
		}
		
		// Recherche du plus grand élément
				double max= Double.MIN_VALUE;
				for(Double d : set){
					if(d> max){
						max= d;
					}
				}
		
		// Recherche du plus petit élément
		Double min= Double.MAX_VALUE;
		for(Double d : set){
			if(d< min){
				min= d;
			}
		}
		set.remove(min);
		
		System.out.println("\nCollection modifiée: ");
		for(Double d : set){
			System.out.print(d+" ");
		}
		

	}

}
