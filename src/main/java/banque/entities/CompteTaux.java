package banque.entities;

public class CompteTaux extends Compte{
	
	private double tauxRenumeration;
	
	public CompteTaux(String numeroCompte, double soldeCompte, double tauxRenumeration){
		super(numeroCompte, soldeCompte);
		this.tauxRenumeration= tauxRenumeration;
	}
	
	public double getTauxRenumeration(){
		return this.tauxRenumeration;
	}
	
	public void setTauxRenumeration(double tauxRenumeration){
		this.tauxRenumeration= tauxRenumeration;
	}
	
	public boolean compteAvecTaux(){
		return true;
	}
	
	public String toString(){
		return super.toString()+"\ntaux de rénumération: "+this.tauxRenumeration;
	}

}
