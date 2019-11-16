package fr.diginamic.formes;

public class Cercle extends Forme{

	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public double calculerSurface() {
		return Math.PI*rayon*rayon;
	}

	public double calculerPerimetre() {
		return 2*Math.PI*rayon;
	}
	
}
