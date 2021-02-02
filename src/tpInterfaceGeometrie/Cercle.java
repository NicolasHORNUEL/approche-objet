package tpInterfaceGeometrie;

public class Cercle implements ObjetGeometrique {

	private double rayon;
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		return Math.rint(2 * Math.PI * this.rayon);
	}

	@Override
	public double surface() {
		return  Math.rint(Math.PI * Math.pow(this.rayon, 2));
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	
}
