package sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> set= new HashSet<String>();
		set.addAll(Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));
		
		String nomPaysPlusGrand= "";
		for(String nomPays : set){
			if(nomPays.length()> nomPaysPlusGrand.length()){
				nomPaysPlusGrand= nomPays;
			}
		}
		set.remove(nomPaysPlusGrand);
		
		for(String nomPays : set){
			System.out.print(nomPays+" ");
		}

	}

}
