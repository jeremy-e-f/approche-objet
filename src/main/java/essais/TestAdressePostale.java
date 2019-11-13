package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		AdressePostale a= new AdressePostale();
		a.numeroDeRue= 5;
		a.libelleDeRue= "Rue de Paris";
		a.codePostal= 84100;
		a.ville= "Toulouse";
		
		
		AdressePostale b= new AdressePostale();
		b.numeroDeRue= 7;
		b.libelleDeRue= "Rue de Paris";
		b.codePostal= 84100;
		b.ville= "Toulouse";

	}

}
