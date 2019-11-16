package banque;

import java.util.Scanner;

import banque.entities.Compte;
import banque.entities.CompteDao;
import banque.entities.CompteDaoMem;
import banque.entities.CompteTaux;
import banque.entities.Credit;
import banque.entities.Debit;
import banque.entities.Operation;

public class TestBanque {

	public static void main(String[] args) {
		//Compte compte= new Compte("021854181ED", 12485.5);
		
		Compte listeComptes[]= new Compte[2];
		// Compte normal
		listeComptes[0]= new Compte("218", 12485.5);
		listeComptes[0].ajouterOperation(new Debit("10/02/2019",14.9));
		listeComptes[0].ajouterOperation(new Debit("01/01/2019",585.6));
		listeComptes[0].ajouterOperation(new Credit("10/02/2019",759.2));
		
		// Compte avec un taux
		listeComptes[1]= new CompteTaux("219", 19685.1, 15588.2);
		listeComptes[1].ajouterOperation(new Credit("10/11/2019",256.3));
		
		for(int i= 0; i< listeComptes.length; i++){
			System.out.println("\n"+listeComptes[i]);
		}
		
		/**
		 * APPLICATION BANCAIRE
		 */
		
		CompteDao compteDao= new CompteDaoMem();
		compteDao.sauvegarder(listeComptes[0]);
		compteDao.sauvegarder(listeComptes[1]);
		Compte liste[];
		
		Scanner saisie= new Scanner(System.in);
		String numeroCompte;
		byte choix;
		
		do{
			liste= compteDao.lister();
			System.out.println("\n\n***** Administration des comptes *****"+
				"\n1. Lister les comptes"+
				"\n2. Ajouter un nouveau compte"+
				"\n3. Ajouter une opération à un compte"+
				"\n4. Supprimer un compte"+
				"\n99. Sortir");
			choix= saisie.nextByte();
			
			switch(choix){
				case(1):
					System.out.println("Liste des comptes");
					for(int i= 0; i< liste.length; i++){
						System.out.print("\nNumero: "+liste[i].getNumeroCompte()+" - Nombre d'opérations: "+liste[i].getListeOperations().size()+" - Solde: "+liste[i].getSolde()+" \u20ac");
						if(liste[i].compteAvecTaux()){
							System.out.print(" - Taux: "+((CompteTaux)liste[i]).getTauxRenumeration());
						}
					}
					break;
				case(2):
					System.out.println("Ajout d’un nouveau compte");
					System.out.println("Veuillez saisir le numéro :");
					numeroCompte= saisie.next();
					
					System.out.println("Veuillez saisir le solde initial :");
					double soldeInitial= saisie.nextDouble();
					
					System.out.println("Veuillez saisir le type de compte (1: NORMAL, 2: REMUNERE) :");
					byte typeCompte= saisie.nextByte();
					Compte nouveauCompte;
					if(typeCompte== 1){
						nouveauCompte= new Compte(numeroCompte, soldeInitial);
					}else{
						System.out.println("Veuillez saisir le taux :");
						double tauxCompte= saisie.nextDouble();
						nouveauCompte= new CompteTaux(numeroCompte, soldeInitial, tauxCompte);
					}
					compteDao.sauvegarder(nouveauCompte);
					break;
				case(3):
					System.out.println("Ajout d’une opération à un compte");
					System.out.println("\nListe des comptes");
					for(int i= 0; i< liste.length; i++){
						System.out.print("\nNumero: "+liste[i].getNumeroCompte()+" - Nombre d'opérations: "+liste[i].getListeOperations().size()+" - Solde: "+liste[i].getSolde()+" \u20ac");
						if(liste[i].compteAvecTaux()){
							System.out.print(" - Taux: "+((CompteTaux)liste[i]).getTauxRenumeration());
						}
					}
					
					System.out.println("\nVeuillez choisir le numéro de compte concerné :");
					numeroCompte= saisie.next();
				
					Compte compteChoisi= compteDao.getCompte(numeroCompte);
					if(compteChoisi== null){
						System.err.println("Le compte de numéro \""+numeroCompte+"\" est introuvable!");
						continue;
					}
						
					byte typeOperation;
					do{
						System.out.println("\nVeuillez saisir le type d’opération (1 : CREDIT, 2 : DEBIT):");
						typeOperation= saisie.nextByte();
					}while(typeOperation!=1 && typeOperation!=2);
					
					System.out.println("\nVeuillez saisir la date :");
					String dateOperation= saisie.next();
					
					System.out.println("\nVeuillez saisir le montant :");
					double montantOperation= saisie.nextDouble();
					
					Operation op;
					if(typeOperation== 1){
						op= new Credit(dateOperation, montantOperation);
					}else{
						op= new Debit(dateOperation, montantOperation);
					}
					compteChoisi.ajouterOperation(op);
					
					break;
				case(4):
					System.out.println("Suppression d’un compte");
					System.out.println("\nVeuillez saisir le numéro de compte à supprimer :");
					numeroCompte= saisie.next();
					compteDao.supprimer(numeroCompte);
					System.out.println("Compte supprimé avec succès!");
					break;
			}
			
		}while(choix!= 99);
		saisie.close();
		
		System.out.println("\nAurevoir :(");
	}
	
}
