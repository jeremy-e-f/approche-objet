package banque.entities;

/** Liste les m�thodes obligatoires pour la persistence des comptes
* @author DIGINAMIC
*/
public interface CompteDao {
	
	/** Retourne la liste de tous les comptes
	* @return
	*/
	Compte[] lister();
	
	/** Permet de sauvegarder un nouveau compte
	* @param nvCompte nouveau compte � sauvegarder
	*/
	void sauvegarder(Compte nvCompte);
	
	/** Supprime un compte
	* Retourne true si la suppression a �t� r�alis�e avec succ�s, false sinon.
	* @param numero num�ro du compte � supprimer
	*/
	boolean supprimer(String numero);
	
	/** Retourne true si le num�ro du compte pass� en param�tre existe,
	* false dans le cas contraire
	* @param numero num�ro du compte
	* @return boolean
	*/
	boolean existe(String numero);
	
	/** Retourne le compte dont le num�ro est pass� en param�tre
	* @param num�ro num�ro du compte
	* @return Compte
	*/
	Compte getCompte(String numero);
}
