package comptesbancaires.collection.dao;

import comptesbancaires.metiers.Compte;

public interface ICompte<T> {
	
	//Ajouter un compte
	boolean create (T o);
	
	//Effectuer un retrait
	public void retirer(double id, double montant);
	
	//Effectuer un versement
	public void verser(double id, double montant);
	
	public Compte consulterCompte (double id);
	
	public Page<Operation> listOperation(double id, int page, int size);
	
	
	

	
	
}

	

