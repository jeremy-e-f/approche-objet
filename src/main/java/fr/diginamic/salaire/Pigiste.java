package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
	
	public Pigiste(String nom, String prenom) {
		super(nom, prenom);
	}

	public Pigiste(String nom, String prenom, byte nbJoursTravaillesMois, double montantJournalierRenum) {
		super(nom, prenom);
		this.nbJoursTravaillesMois = nbJoursTravaillesMois;
		this.montantJournalierRenum = montantJournalierRenum;
	}

	private byte nbJoursTravaillesMois;
	
	private double montantJournalierRenum;

	public byte getNbJoursTravaillesMois() {
		return nbJoursTravaillesMois;
	}

	public void setNbJoursTravaillesMois(byte nbJoursTravaillesMois) {
		this.nbJoursTravaillesMois = nbJoursTravaillesMois;
	}

	public double getMontantJournalierRenum() {
		return montantJournalierRenum;
	}

	public void setMontantJournalierRenum(double montantJournalierRenum) {
		this.montantJournalierRenum = montantJournalierRenum;
	}

	public double getSalaire() {
		return nbJoursTravaillesMois*montantJournalierRenum;
	}
	
	public String getStatut() {
		return "pigiste";
	}

}
