package banque.entities;

import java.util.ArrayList;
import org.apache.commons.lang3.builder.EqualsBuilder;

public class Compte {

	private String numeroCompte;
	private double soldeInitial;
	private ArrayList<Operation> listeOperations;
	
	public Compte(){
		this.listeOperations= new ArrayList<Operation>();
	}
	
	public Compte(String numeroCompte, double soldeCompte){
		this();
		this.numeroCompte= numeroCompte;
		this.soldeInitial= soldeCompte;
	}
	
	public void setNumeroCompte(String numeroCompte){
		this.numeroCompte= numeroCompte;
	}
	
	public void setSoldeInitial(double soldeCompte){
		this.soldeInitial= soldeCompte;
	}
	
	public String getNumeroCompte(){
		return this.numeroCompte;
	}
	
	public double getSoldeInitial(){
		return this.soldeInitial;
	}
	
	public double getSolde(){
		double solde= this.soldeInitial;
		for(Operation op : listeOperations){
			solde+= op.getMontantOperation();
		}
		return Math.round(solde*100)/100;
	}
	
	public double getSolde(String type){
		double solde= 0;
		for(Operation op : listeOperations){
			if(op.getType().equals(type)){
				solde+= op.getMontantOperation();
			}
		}
		return Math.round(solde*100)/100;
	}
	
	public ArrayList<Operation> getListeOperations(){
		return this.listeOperations;
	}
	
	public String toString(){
		return "Compte, numéro: "+numeroCompte+
				"\nsolde : "+soldeInitial+
				"\nnombre d'opération: "+listeOperations.size();	
	}
	
	public void ajouterOperation(Operation ope){
		this.listeOperations.add(ope);
	}
	
	public boolean compteAvecTaux(){
		return false;
	}
	
	public boolean equals(Object o){
		if(!(o instanceof Compte)){
			return false;
		}
		Compte compte= (Compte)o;
		return new EqualsBuilder().append(this.getNumeroCompte(), compte.getNumeroCompte()).isEquals() && this.getSoldeInitial()== compte.getSoldeInitial();
	}
	
}
