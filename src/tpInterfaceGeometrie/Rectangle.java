package tpInterfaceGeometrie;

public class Rectangle implements ObjetGeometrique {
	
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	@Override
	public double perimetre() {
		return Math.rint(2*(largeur+longueur));

	}
	@Override
	public double surface() {
		return Math.rint(largeur*longueur);
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	

}
