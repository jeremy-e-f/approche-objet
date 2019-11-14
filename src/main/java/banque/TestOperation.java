package banque;

import banque.entities.Credit;
import banque.entities.Debit;
import banque.entities.Operation;

public class TestOperation {

	public static void main(String[] args) {
		
		Operation listeOperations[]= new Operation[4];
		
		listeOperations[0]= new Debit("10/02/2019",1458.9);
		listeOperations[1]= new Debit("01/01/2019",585.6);
		listeOperations[2]= new Credit("10/02/2019",759.2);
		listeOperations[3]= new Credit("10/11/2019",256.3);
		
		for(int i= 0; i< listeOperations.length; i++){
			System.out.println("\n"+listeOperations[i]);
		}
		
		// Montant global
		double montantGlobal= 0;
		for(int i= 0; i< listeOperations.length; i++){
			if(listeOperations[i].afficherType()== "Debit"){
				montantGlobal-= listeOperations[i].getMontantOperation();
			}else{
				montantGlobal+= listeOperations[i].getMontantOperation();
			}
		}
		System.out.println("\nMontant global= "+montantGlobal);
		
	}

}
