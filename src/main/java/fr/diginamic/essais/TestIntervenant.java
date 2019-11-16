package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie salarie= new Salarie("Jean", "Jacques", 2585.5);
		//System.out.println("Salarie Jean Jacques:\nsalaire= "+salarie.getSalaire());
		salarie.afficherDonnees();
		
		System.out.println("\n======");
		
		Pigiste pigiste= new Pigiste("Claude", "Renault", (byte)21, 125.7);
		//System.out.println("Pigiste Claude Renault:\nsalaire= "+(Math.round(pigiste.getSalaire()*100)/100));
		pigiste.afficherDonnees();
	}

}
