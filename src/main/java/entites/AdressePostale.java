package entites;

public class AdressePostale {

	public int numeroDeRue;
	public String libelleDeRue;
	public int codePostal;
	public String ville;
	
	public AdressePostale(){
	}
	
	public AdressePostale(int numeroDeRue, String libelleDeRue, int codePostal, String ville){
		this.numeroDeRue= numeroDeRue;
		this.libelleDeRue= libelleDeRue;
		this.codePostal= codePostal;
		this.ville= ville;
	}
	
}
