package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {

	public static Cercle circleBuilder(double rayon) {
		return new Cercle(rayon);
	}
	
}