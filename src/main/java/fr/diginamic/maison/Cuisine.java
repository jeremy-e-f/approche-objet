package fr.diginamic.maison;

public class Cuisine extends Piece {

	public Cuisine(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);
	}
	
	public String getTypePiece() {
		return "cuisine";
	}

}
