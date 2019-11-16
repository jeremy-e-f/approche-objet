package fr.diginamic.salaire;

public class Salarie extends Intervenant{
	
	private double salaire;

	public Salarie(String nom, String prenom) {
		super(nom, prenom);
	}

	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	public double getSalaire(){
		return salaire;
	}

	public String getStatut() {
		return "salarié";
	}

}
