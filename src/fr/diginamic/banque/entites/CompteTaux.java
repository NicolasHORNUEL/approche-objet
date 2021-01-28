package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private double tauxRemuneration;

	public CompteTaux(int numCompte, double soldeCompte, double tauxRemuneration) {
		super(numCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public String toString() {
		return super.toString() + " [taux de " + tauxRemuneration + "%]";
	}
	
	
	
}
