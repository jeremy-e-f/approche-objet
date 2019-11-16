package fr.diginamic.operations;

public class CalculMoyenne {

	private double tableau[];
	private int tailleTableau= 0;
	private int pasAgrandissement= 10;

	public CalculMoyenne() {
		this.tableau= new double[pasAgrandissement];
	}
	
	public void ajout(double d){
		// Le tableau est plein, on agrandit le tableau
		if(tailleTableau== tableau.length){
			double nouveauTableau[]= new double[tailleTableau+pasAgrandissement];
			// On copie les anciens éléments
			for(int i= 0; i< tailleTableau; i++){
				nouveauTableau[i]= this.tableau[i];
			}
			nouveauTableau[tailleTableau]= d;
			this.tableau= nouveauTableau;
		}else{
			tableau[tailleTableau]= d;
		}
		tailleTableau++;
	}
	
	public double calcul(){
		if(this.tailleTableau== 0){
			return 0;
		}
		double somme= 0;
		for(int i= 0; i< tailleTableau; i++){
			somme+= this.tableau[i];
		}
		System.out.println(somme);
		System.out.println(tailleTableau);
		return somme/tailleTableau;
	}
	
}
