package fr.diginamic.tri;

public class Ville implements Comparable<Ville> {

	private String nom;
	private int nbHabitant;
	
	public Ville(String nom, int nbHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	@Override
	public int compareTo(Ville other) {	
		// sort with name
		//return this.nom.compareTo(other.getNom());
		// sort with nbHabitant
		if (this.nbHabitant > other.getNbHabitant()) {
			return 1;
		} else if (this.nbHabitant < other.getNbHabitant()) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitant=" + nbHabitant + "]\n";
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
