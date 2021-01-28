package fr.diginamic.banque.entites;

public class Compte {

		private int numCompte;
		private double soldeCompte;
		
		public Compte(int n, double s) {
			numCompte = n;
			soldeCompte = s;	
		}

		public int getNumCompte() {
			return numCompte;
		}

		public void setNumCompte(int numCompte) {
			this.numCompte = numCompte;
		}

		public double getSoldeCompte() {
			return soldeCompte;
		}

		public void setSoldeCompte(double soldeCompte) {
			this.soldeCompte = soldeCompte;
		}

		@Override
		public String toString() {
			return "N° du Compte : " + numCompte + ". Solde du Compte : " + soldeCompte + "€";
		}
}
