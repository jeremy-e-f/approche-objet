package fr.diginamic.entites;

public class Cercle {
	private double rayon;
	
	public Cercle(){
		
	}
	
	public Cercle(double rayon){
		this.rayon= rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	public double surface(){
		return Math.PI*rayon*rayon;
	}
	
	public double perimetre(){
		return 2*Math.PI*rayon;
	}
	
}
