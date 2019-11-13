package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne p1= new Personne();
		p1.prenom= "Jérémy";
		p1.prenom= "FROMINVILLE";
		p1.adresse= new AdressePostale();
		
		Personne p2= new Personne();
		p2.prenom= "Tareck";
		p2.prenom= "FRAN";
		p2.adresse= new AdressePostale();

	}

}
