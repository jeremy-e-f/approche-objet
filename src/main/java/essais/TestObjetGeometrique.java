package essais;

import entites.Cercle;
import entites.ObjetGeometrique;
import entites.Rectangle;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique tableau[]= new ObjetGeometrique[2];
		
		tableau[0]= new Cercle(10);
		tableau[1]= new Rectangle(2,5);
		
		for(int i= 0; i< tableau.length; i++){
			System.out.println("\nObjet géométrique n°"+i+", surface="+Math.round(tableau[i].surface())+", perimètre="+Math.round(tableau[i].perimetre()));
		}
		
	}

}
