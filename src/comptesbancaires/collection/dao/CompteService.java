package comptesbancaires.collection.dao;

import java.util.ArrayList;
import java.util.List;

import comptesbancaires.metiers.Compte;


public class CompteService implements ICompte<Compte> {
	
	
	@Override
	public boolean create(Compte s) {
		
		return comptes.add(s);
	
	}
	
	@Override
	public void retirer(double id, double montant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verser(double id, double montant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Compte consulterCompte(double id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Operation> listOperation(double id, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	


		/*List<Compte> comptes = new ArrayList<Compte>();
		
		@Override
		public boolean create(Compte s) {
			
			return comptes.add(s);
		
		}

		@Override
		public boolean delete(Compte s) {
			
			return comptes.remove(s);
		}

		@Override
		public boolean update(Compte s) {
			
			for (Compte monCompte : comptes) {
				if (monCompte.getId() == s.getId()) {
					monCompte.setSolde(s.getSolde());
					monCompte.setDatecreation(s.getDatecreation());
					return true;
				}
			}
			return false;
		}

		//Méthode permettant de renvoyer un objet dont id est passé en paramètre.
		
		@Override
		public Compte findById(int id) {
			for (Compte monCompte : comptes) {
				if (monCompte.getId() == id) {
					return monCompte;
				}
			}
			return null;
		}

		@Override
		public List findAll() {
			
			return comptes;
			
		}

		public static void afficherComptes(List<Compte> comptes) {
			for (Compte monCompte : comptes) {
				System.out.println(monCompte.toString());  /* Le toString est optionnel ici
			}
		}

	}*/
		
	}

