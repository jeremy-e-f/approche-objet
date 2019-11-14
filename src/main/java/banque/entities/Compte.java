package banque.entities;

import java.util.ArrayList;
import java.util.Iterator;

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
		Iterator<Operation> it= listeOperations.iterator();
		while(it.hasNext()){
			Operation op= it.next();
			solde+= op.getMontantOperation();
		}
		return solde;
	}
	
	public double getSolde(String type){
		double solde= 0;
		Iterator<Operation> it= listeOperations.iterator();
		while(it.hasNext()){
			Operation op= it.next();
			if(op.getType().equals(type)){
				solde+= op.getMontantOperation();
			}
		}
		return solde;
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
	
	public boolean equals(Compte compte){
		return compte.getNumeroCompte()== this.getNumeroCompte(); 
	}
	
}
