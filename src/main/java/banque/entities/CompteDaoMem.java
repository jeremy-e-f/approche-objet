package banque.entities;

import java.util.ArrayList;
import java.util.Iterator;

public class CompteDaoMem implements CompteDao{

	private ArrayList<Compte> listeComptes;
	
	public CompteDaoMem(){
		this.listeComptes= new ArrayList<Compte>();
	}

	@Override
	public Compte[] lister() {
		return (Compte[])listeComptes.toArray();
	}

	@Override
	public void sauvegarder(Compte nvCompte) {
		listeComptes.add(nvCompte);
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
		Iterator<Compte> it = listeComptes.iterator();
		 
		while(it.hasNext()){
		       Compte compte = it.next();
		       if(compte.getNumeroCompte()== numero){
		    	   return compte;
		       }
		}
		return null;
	}
	
}
