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
		// Je veux faire un tri sur le nb d'habitants
		// si ma ville courante a plus d'habitants que "other" je retourne 1
		// si other a plus d'habitants : je retourne -1
		// si les 2 villes ont le même nb d'habitants: je retourne 0
		if (this.nbHabitant > other.getNbHabitant()) {
			return 1;
		} else if (this.nbHabitant > other.getNbHabitant()) {
			return -1;
		}
			return 0;
			//return this.nom.compareTo(other.getNom());
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
