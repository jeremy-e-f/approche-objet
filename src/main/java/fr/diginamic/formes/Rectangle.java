package fr.diginamic.formes;

public class Rectangle extends Forme{
	
	private double longueur;
	private double largeur;
	
	public Rectangle(double longeur, double largeur) {
		this.longueur = longeur;
		this.largeur = largeur;
	}
	
	public double getLongeur() {
		return longueur;
	}
	public void setLongeur(double longeur) {
		this.longueur = longeur;
	}
	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public double calculerSurface() {
		return largeur*longueur;
	}

	public double calculerPerimetre() {
		return 2*(largeur+longueur);
	}

}
