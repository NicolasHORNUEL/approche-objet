package fr.diginamic.recensement.entites;

public class Departement implements Comparable<Departement> {

	private String codeDepartement;
	private int popDepartement;

	public Departement(String codeDepartement, int popDepartement) {
		this.codeDepartement = codeDepartement;
		this.popDepartement = popDepartement;
	}

	@Override
	public int compareTo(Departement other) {
		if (this.popDepartement > other.getPopDepartement()) {
			return -1;
		} else if (this.popDepartement < other.getPopDepartement()) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return codeDepartement + "=" + popDepartement;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public int getPopDepartement() {
		return popDepartement;
	}

	public void setPopDepartement(int popDepartement) {
		this.popDepartement = popDepartement;
	}
	
}
