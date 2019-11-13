package banque.entities;

public class Compte {

	String numeroCompte;
	float soldeCompte;
	
	public Compte(){
		
	}
	
	public Compte(String numeroCompte, float soldeCompte){
		this.numeroCompte= numeroCompte;
		this.soldeCompte= soldeCompte;
	}
	
	public void setNumeroCompte(String numeroCompte){
		this.numeroCompte= numeroCompte;
	}
	
	public void setSoldeCompte(float soldeCompte){
		this.soldeCompte= soldeCompte;
	}
	
	public String getNumeroCompte(){
		return this.numeroCompte;
	}
	
	public float getsoldeCompte(){
		return this.soldeCompte;
	}
	
	public String toString(){
		return "Compte, numéro: "+numeroCompte+
				"\nsolde du compte: "+soldeCompte;	
	}
	
}
