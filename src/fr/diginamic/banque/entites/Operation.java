package fr.diginamic.banque.entites;

public abstract class Operation {

	private String date;
	private double montant;
	
	public Operation(String date, double montant) {
		this.date = date;
		this.montant = montant;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	// abstract method without body
	public abstract String afficherType();
	
	
	
}
