package banque.entities;

import java.util.ArrayList;
import java.util.List;

public class CompteDaoMem implements CompteDao{

	private ArrayList<Compte> listeComptes;
	
	public CompteDaoMem(){
		this.listeComptes= new ArrayList<Compte>();
	}

	@Override
	public List<Compte> lister() {
		return listeComptes;
	}

	@Override
	public void sauvegarder(Compte nvCompte) {
		listeComptes.add((Compte)nvCompte);
	}

	@Override
	public boolean supprimer(String numero) {
		return listeComptes.remove(this.getCompte(numero));
	}

	@Override
	public boolean existe(String numero) {
		return this.getCompte(numero)!= null;
	}

	@Override
	public Compte getCompte(String numero) {
		for(Compte compte : listeComptes){
	       if(compte.getNumeroCompte().equals(numero)){
	    	   return compte;
	       }
		}
		return null;
	}
	
}
