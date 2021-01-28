package fr.diginamic.banque.entites;

public class Compte {

		private int numCompte;
		private double soldeCompte;
		
		public Compte(int n, double s) {
			numCompte = n;
			soldeCompte = s;	
		}
		
		@Override
		public String toString() {
			return "N° du Compte : " + numCompte + ". Solde du Compte : " + soldeCompte;
		}
}
