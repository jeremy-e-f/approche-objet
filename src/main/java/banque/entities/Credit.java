package banque.entities;

public class Credit extends Operation{
	
	public Credit(){
		
	}
	
	public Credit(String dateOperation, double montantOperation){
		super(dateOperation, montantOperation);
	}
	
	public String afficherType(){
		return "Credit";
	}

}
