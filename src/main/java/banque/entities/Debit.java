package banque.entities;

public class Debit extends Operation{
	
	public Debit(){
		
	}
	
	public Debit(String dateOperation, double montantOperation){
		super(dateOperation, montantOperation);
	}
	
	public String afficherType(){
		return "Debit";
	}

}
