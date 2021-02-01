package fr.diginamic.parseur;

public class Expression {

	private String membreGauche;
	private char operateur;
	private String membreDroite;

	public Expression(String membreGauche, char operateur, String membreDroite) {
		super();
		this.membreGauche = membreGauche;
		this.operateur = operateur;
		this.membreDroite = membreDroite;
	}

	public double evaluer(String nom, double valeur) {	
		if (operateur == '+') {
			if (membreGauche.indexOf(nom) != -1) {
				return valeur + Double.parseDouble(membreDroite);
			} else {
				return Double.parseDouble(membreGauche) + valeur;
			}	
		} else if (operateur == '-') {
			if (membreGauche.indexOf(nom) != -1) {
				return valeur - Double.parseDouble(membreDroite);
			} else {
				return Double.parseDouble(membreGauche) - valeur;
			}	
		} else if (operateur == '/') {
			if (membreGauche.indexOf(nom) != -1) {
				return valeur / Double.parseDouble(membreDroite);
			} else {
				return Double.parseDouble(membreGauche) / valeur;
			}	
		} else if (operateur == '*') {
			if (membreGauche.indexOf(nom) != -1) {
				return valeur * Double.parseDouble(membreDroite);
			} else {
				return Double.parseDouble(membreGauche) * valeur;
			}	
		} else {
			return 0.0;
		}
	}
	
	
}
