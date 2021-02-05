package fr.diginamic.recensement.entites;

public class Region implements Comparable<Region> {

	private String nomRegion;
	private int popRegion;	

	public Region(String nomRegion, int popRegion) {
		this.nomRegion = nomRegion;
		this.popRegion = popRegion;
	}

	@Override
	public int compareTo(Region other) {
		if (this.popRegion > other.getPopRegion()) {
			return -1;
		} else if (this.popRegion < other.getPopRegion()) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return nomRegion + "=" + popRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getPopRegion() {
		return popRegion;
	}

	public void setPopRegion(int popRegion) {
		this.popRegion = popRegion;
	}

	
}
