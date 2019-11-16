package fr.diginamic.salaire;

public abstract class Intervenant {
	
	private String nom;
	private String prenom;
	
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public abstract double getSalaire();
	
	public void afficherDonnees(){
		System.out.println("Intervenant:"+
			"\nnom: "+this.nom+
			"\nprenom: "+this.prenom+
			"\nsalaire: "+Math.round(this.getSalaire()*100)/100+
			"\nstatut: "+this.getStatut());
	}

	public abstract String getStatut();

}
