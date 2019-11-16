package fr.diginamic.maison;

import java.util.ArrayList;

public class Maison {
	
	private ArrayList<Piece> pieces;

	public Maison() {
		this.pieces= new ArrayList<Piece>();
	}

	public ArrayList<Piece> getPieces() {
		return pieces;
	}

	public void setPieces(ArrayList<Piece> pieces) {
		this.pieces = pieces;
	}
	
	public void ajouterPiece(Piece piece){
		if(piece!= null && piece.getNumeroEtage()>= 0 && piece.getSuperficie()> 0){
			pieces.add(piece);
		}
	}
	
	/**
	 * Renvoie la surperficie totale des pièces de la maison
	 * @return superficieTotale
	 */
	public double calculerSuperficieTotale(){
		double superficieTotale= 0;
		for(Piece piece : pieces){
			superficieTotale+= piece.getSuperficie();
		}
		return Math.round(superficieTotale*100)/100;
	}
	
	/**
	 * Renvoie la surperficie totale des pièces de l'étage donné
	 * @param numeroEtage
	 * @return superficieTotale
	 */
	public double calculerSuperficieTotale(int numeroEtage){
		double superficieTotale= 0;
		for(Piece piece : pieces){
			if(numeroEtage== piece.getNumeroEtage()){
				superficieTotale+= piece.getSuperficie();
			}
		}
		return Math.round(superficieTotale*100)/100;
	}
	
	/**
	 * Renvoie la surperficie totale d'un type de pièce en particulier
	 * @param typePiece
	 * @return superficieTotale
	 */
	public double calculerSuperficieTotale(String typePiece){
		double superficieTotale= 0;
		for(Piece piece : pieces){
			if(typePiece.equals(piece.getTypePiece())){
				superficieTotale+= piece.getSuperficie();
			}
		}
		return Math.round(superficieTotale*100)/100;
	}
	
	/**
	 * Renvoie le nombre de pièce d'un type particulier
	 * @param typePiece
	 * @return nombrePieces
	 */
	public int getNombrePieces(String typePiece){
		int nb= 0;
		for(Piece piece : pieces){
			if(typePiece.equals(piece.getTypePiece())){
				nb++;
			}
		}
		return nb;
	}
	

}
