package fr.diginamic.listes;

public class Ville {

	private String nom;
	private int nbHabitant;
	
	public Ville(String nom, int nbHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ville)) {
			return false;
		}
		Ville other = (Ville) obj;
		return (nom.equals(other.getNom()) && nbHabitant==other.getNbHabitant());		
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
