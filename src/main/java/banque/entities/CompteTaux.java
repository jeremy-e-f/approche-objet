package banque.entities;

public class CompteTaux extends Compte{
	
	double tauxRenumeration;
	
	public CompteTaux(String numeroCompte, double soldeCompte, double tauxRenumeration){
		super(numeroCompte, soldeCompte);
		this.tauxRenumeration= tauxRenumeration;
	}
	
	public String toString(){
		return super.toString()+"\ntaux de rénumération: "+this.tauxRenumeration;
	}

}
