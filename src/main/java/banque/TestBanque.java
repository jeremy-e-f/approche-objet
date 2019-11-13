package banque;

import banque.entities.Compte;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte= new Compte("021854181ED", 12485.5F);
		System.out.println(compte);
	}

}
