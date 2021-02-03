package fr.diginamic.tri;

public class Ville implements Comparable<Ville> {

	private String nom;
	private int nbHabitant;
	
	public Ville(String nom, int nbHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	@Override
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return nom ;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}



	
	

}
