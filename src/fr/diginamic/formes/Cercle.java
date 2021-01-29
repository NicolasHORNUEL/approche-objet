package fr.diginamic.formes;

public class Cercle extends Forme {

	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		return  Math.rint(Math.PI * Math.pow(this.rayon, 2));
	}

	@Override
	public double calculerPerimetre() {
		return Math.rint(2 * Math.PI * this.rayon);
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	
	
}
