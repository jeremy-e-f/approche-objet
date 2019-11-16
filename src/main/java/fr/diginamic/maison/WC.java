package fr.diginamic.maison;

public class WC extends Piece {

	public WC(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);
	}
	
	public String getTypePiece() {
		return "wc";
	}

}
