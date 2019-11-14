package banque;

import banque.entities.Compte;
import banque.entities.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		//Compte compte= new Compte("021854181ED", 12485.5);
		
		Compte listeComptes[]= new Compte[2];
		// Compte normal
		listeComptes[0]= new Compte("021854181ED", 12485.5);
		
		// Compte avec un taux
		listeComptes[1]= new CompteTaux("021UI418FRD", 19685.1, 15588.2);
		
		for(int i= 0; i< listeComptes.length; i++){
			System.out.println("\n"+listeComptes[i]);
		}
	}

}
