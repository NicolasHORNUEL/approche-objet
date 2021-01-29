package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	private int nbJour;
	private double montantJournalier;
	
	public Pigiste(String nom, String prenom, int nbJour, double montantJournalier) {
		super(nom, prenom);
		this.nbJour = nbJour;
		this.montantJournalier = montantJournalier;
	}
	
	@Override
	public double getSalaire() {
		return montantJournalier*nbJour;
	}

	public int getNbJour() {
		return nbJour;
	}

	public void setNbJour(int nbJour) {
		this.nbJour = nbJour;
	}

	public double getMontantJournalier() {
		return montantJournalier;
	}

	public void setMontantJournalier(double montantJournalier) {
		this.montantJournalier = montantJournalier;
	}
	
	
	
}
