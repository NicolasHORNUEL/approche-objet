package fr.diginamic.entites;

public class Theatre {

	private String nom;
	private int capaciteTotal;
	private int clientTotal;
	private double recette;
	
	public Theatre(String nom, int capaciteTotal, int clientTotal, double recette) {
		this.nom = nom;
		this.capaciteTotal = capaciteTotal;
		this.clientTotal = clientTotal;
		this.recette = recette;
	}
	
	public void inscrire(int client, double prix) {
		if (clientTotal+client<=capaciteTotal) {
			clientTotal += client;
			recette += client*prix;
			System.out.print(clientTotal+" clients inscrits.");
			System.out.println(" Recette totale : " + recette + '\u20AC');
			if (clientTotal==capaciteTotal) {
				System.out.println("Complet!");
			}
		} else {
			System.err.println("Il n'y a pas assez de place!");
		}
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCapaciteTotal() {
		return capaciteTotal;
	}
	public void setCapaciteTotal(int capaciteTotal) {
		this.capaciteTotal = capaciteTotal;
	}
	public int getClientTotal() {
		return clientTotal;
	}
	public void setClientTotal(int clientTotal) {
		this.clientTotal = clientTotal;
	}
	public double getRecette() {
		return recette;
	}
	public void setRecette(double recette) {
		this.recette = recette;
	}
	
	
}
