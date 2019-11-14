package entites;

public class Rectangle implements ObjetGeometrique{

	private double longueur;

	private double largeur;

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	
	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	public double perimetre(){
		return 2*(this.longueur+this.largeur);
	}
	
	public double surface(){
		return this.largeur*this.longueur;
	}
	
}
