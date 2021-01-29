package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;
import fr.diginamic.formes.Carre;

public class TestForme {

	public static void main(String[] args) {

		Cercle cerc = new Cercle(10.0);
		Rectangle rect = new Rectangle(12.3, 5.8);
		Carre carr = new Carre(8.0);
		
		// Polymorphisme :
		// la méthode afficher peut prendre en paramètre n'importe quelle instance
		// d'une classe qui hérite de Forme
		AffichageForme.afficher(cerc);
		AffichageForme.afficher(rect);
		AffichageForme.afficher(carr);

		
		
	}

}
