package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) throws Exception {
		double a= 5;
		double b= 2;
		
		System.out.println("\n"+a+" + "+b+" = "+Operations.calcul(a,b,'+')+
				"\n"+a+" - "+b+" = "+Operations.calcul(a,b,'-')+
				"\n"+a+" * "+b+" = "+Operations.calcul(a,b,'*')+
				"\n"+a+" / "+b+" = "+Operations.calcul(a,b,'/'));

	}

}
