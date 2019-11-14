package banque.entities;

public class Compte {

	private String numeroCompte;
	private double soldeCompte;
	
	public Compte(){
		
	}
	
	public Compte(String numeroCompte, double soldeCompte){
		this.numeroCompte= numeroCompte;
		this.soldeCompte= soldeCompte;
	}
	
	public void setNumeroCompte(String numeroCompte){
		this.numeroCompte= numeroCompte;
	}
	
	public void setSoldeCompte(double soldeCompte){
		this.soldeCompte= soldeCompte;
	}
	
	public String getNumeroCompte(){
		return this.numeroCompte;
	}
	
	public double getsoldeCompte(){
		return this.soldeCompte;
	}
	
	public String toString(){
		return "Compte, numéro: "+numeroCompte+
				"\nsolde du compte: "+soldeCompte;	
	}
	
}
