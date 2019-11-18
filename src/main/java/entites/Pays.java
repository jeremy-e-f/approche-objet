package entites;

public class Pays implements Comparable<Pays>{
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

	@Override
	/** Par ordre alphabétique */
	/*public int compareTo(Pays pays) {
		return nom.compareToIgnoreCase(pays.getNom());
	}*/
	
	/** Par PIB/habitant */
	public int compareTo(Pays pays) {
		return ((Double)PibParHabitant).compareTo(pays.getPibParHabitant());
	}
	
}
