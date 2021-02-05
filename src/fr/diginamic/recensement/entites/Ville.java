package fr.diginamic.recensement.entites;

public class Ville implements Comparable<Ville> {

	private int codeRegion;	
	private String nomRegion;
	private String codeDepartement;
	private int codeCommune;
	private String nomCommune;
	private int popCommune;

	public Ville(int codeRegion, String nomRegion, String codeDepartement, int codeCommune, String nomCommune,
			int popCommune) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.popCommune = popCommune;
	}

	@Override
	public int compareTo(Ville other) {
		if (this.popCommune > other.getPopCommune()) {
			return -1;
		} else if (this.popCommune < other.getPopCommune()) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return nomCommune + "=" + popCommune;
	}
	
	public int getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public int getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public int getPopCommune() {
		return popCommune;
	}

	public void setPopCommune(int popCommune) {
		this.popCommune = popCommune;
	}
	
	

}
