package fr.diginamic.entites;

public class Cercle {

	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	public String perimetre() {
		return "Périmètre : " + Math.rint(2 * Math.PI * rayon);
	}
	
	public String surface() {
		return  "Surface : " + Math.rint(Math.PI * Math.pow(rayon, 2));
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	
}
