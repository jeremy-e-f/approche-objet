package banque;

import java.util.Scanner;

import banque.entities.Compte;
import banque.entities.CompteDao;
import banque.entities.CompteDaoMem;
import banque.entities.CompteTaux;
import banque.entities.Credit;
import banque.entities.Debit;

public class TestBanque {

	public static void main(String[] args) {
		//Compte compte= new Compte("021854181ED", 12485.5);
		
		Compte listeComptes[]= new Compte[2];
		// Compte normal
		listeComptes[0]= new Compte("021854181ED", 12485.5);
		listeComptes[0].ajouterOperation(new Debit("10/02/2019",1458.9));
		listeComptes[0].ajouterOperation(new Debit("01/01/2019",585.6));
		listeComptes[0].ajouterOperation(new Credit("10/02/2019",759.2));
		
		// Compte avec un taux
		listeComptes[1]= new CompteTaux("021UI418FRD", 19685.1, 15588.2);
		listeComptes[1].ajouterOperation(new Credit("10/11/2019",256.3));
		
		for(int i= 0; i< listeComptes.length; i++){
			System.out.println("\n"+listeComptes[i]);
		}
		
		/*
		CompteDao compteDao= new CompteDaoMem();
		compteDao.sauvegarder(listeComptes[0]);
		compteDao.sauvegarder(listeComptes[1]);
		
		Scanner saisie= new Scanner(System.in);
		byte choix;
		
		do{
			System.out.println("\n***** Administration des comptes *****"+
				"\n1. Lister les comptes"+
				"\n2. Ajouter un nouveau compte"+
				"\n3. Ajouter une opération à un compte"+
				"\n4. Supprimer un compte"+
				"\n99. Sortir \n");
			choix= saisie.nextByte();
			
			switch(choix){
				case(1):
					System.out.println("Liste des comptes");
					afficherListeCompte(compteDao.lister());
					break;
				case(2):
					System.out.println("Ajout d’un nouveau compte");
					
					System.out.println("Veuillez saisir le numéro :");
					
					break;
				case(3):
					System.out.println("Ajout d’une opération à un compte");
					break;
				case(4):
					System.out.println("Suppression d’un compte");
					break;
			}
			
		}while(choix!= 99);
		saisie.close();
		
		System.out.println("Aurevoir :(");*/
	}
	
	/*public static void afficherListeCompte(Compte[] liste){
		for(int i= 0; i< liste.length; i++){
			System.out.println("\nNumero: "+liste[i].getNumeroCompte()+" - Nombre d'opérations: "+liste[i].getListeOperations().size()+" - Solde: "+liste[i].getSolde()+" U+20AC");
			if(liste[i].compteAvecTaux()){
				System.out.println(" - Taux: "+((CompteTaux)liste[i]).getTauxRenumeration());
			}
		}	
	}*/

}
