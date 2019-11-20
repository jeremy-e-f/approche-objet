package banque.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;

public abstract class Operation {
	
	private String dateOperation;
	
	private double montantOperation;
	
	public Operation(){
		
	}
	
	public Operation(String dateOperation, double montantOperation){
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}
	
	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
	}

	public String toString() {
		return "Operation, date: " + this.dateOperation + "\nmontant: " + this.montantOperation+"\ntype: "+afficherType();
	}
	
	public boolean equals(Object o){
		if(!(o instanceof Operation)){
			return false;
		}
		Operation op= (Operation)o;
		return new EqualsBuilder().append(dateOperation, op.getDateOperation()).isEquals() && montantOperation== op.getMontantOperation();
	}
	
	public abstract String afficherType();
	
	public abstract String getType();

}
