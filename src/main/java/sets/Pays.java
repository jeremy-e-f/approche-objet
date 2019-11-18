package sets;

public class Pays {
	private String nom;
	private int nbHabitants;
	private double PibParHabitant;
	
	public Pays(String nom, int nbHabitants, double pibParHabitant) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		PibParHabitant = pibParHabitant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public double getPibParHabitant() {
		return PibParHabitant;
	}

	public void setPibParHabitant(double pibParHabitant) {
		PibParHabitant = pibParHabitant;
	}
	
	public String toString(){
		return nom+", nombre d'habitants: "+nbHabitants+", PIB/habitant: "+PibParHabitant;
	}
	
}
