package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		ArrayList<Integer> listeEntiers= new ArrayList<Integer>();
		for(int i= 1; i<= 100; i++){
			listeEntiers.add(i);
		}
		System.out.println(listeEntiers.size());
	}

}
