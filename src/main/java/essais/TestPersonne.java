package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne p1= new Personne("Jérémy","FROMINVILLE", new AdressePostale(5,"Rue de Paris",84100,"Toulouse"));
		Personne p2= new Personne("Tareck","FRAN", new AdressePostale(7,"Rue de Paris",84100,"Toulouse"));

	}

}
