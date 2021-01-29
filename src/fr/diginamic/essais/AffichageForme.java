package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	static void afficher(Forme newForm) {
		System.out.println("Périmètre : "+newForm.calculerPerimetre());
		System.out.println("Surface: "+newForm.calculerSurface());
	}
}
