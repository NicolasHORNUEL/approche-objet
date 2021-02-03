package fr.diginamic.geometrie.utils;

import fr.diginamic.geometrie.entites.Cercle;

public class CercleFactory {

	public static Cercle circleBuilder(double rayon) {
		return new Cercle(rayon);
	}
	
}
