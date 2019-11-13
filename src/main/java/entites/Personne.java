package entites;

public class Personne {
	
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public Personne(){
		
	}
	
	public Personne(String nom, String prenom){
		this.nom= nom;
		this.prenom= prenom;
	}
	
	public Personne(String nom, String prenom, AdressePostale adresse){
		this.nom= nom;
		this.prenom= prenom;
		this.adresse= adresse;
	}
	
	public void setNom(String nom){
		this.nom= nom;
	}
	
	public void setPrenom(String prenom){
		this.prenom= prenom;
	}
	
	public void setAdresse(AdressePostale adresse){
		this.adresse= adresse;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public String getPrenom(){
		return this.prenom;
	}
	
	public AdressePostale getAdresse(){
		return this.adresse;
	}
	
	public String toString(){
		return this.prenom.toUpperCase()+" "+this.nom.toUpperCase();
	}
	


}
