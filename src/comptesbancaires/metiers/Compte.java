package comptesbancaires.metiers;

public class Compte {

	private int id;
	private double solde;
	private String datecreation;
	private static int compteurId = 0;
	
	
	
	

	public Compte(int id, int solde, String datecreation) {
		super();
		this.id = id;
		this.solde = solde;
		this.datecreation = datecreation;
	}


	@Override
	public String toString() {
		return "Compte [id=" + id + ", solde=" + solde + ", datecreation=" + datecreation + "]";
	}
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getSolde() {
		return solde;
	}



	public void setSolde(int solde) {
		this.solde = solde;
	}



	public String getDatecreation() {
		return datecreation;
	}



	public void setDatecreation(String datecreation) {
		this.datecreation = datecreation;
	}



	public static int getCompteurId() {
		return compteurId;
	}



	public static void setCompteurId(int compteurId) {
		Compte.compteurId = compteurId;
	}
	

	
	
}
