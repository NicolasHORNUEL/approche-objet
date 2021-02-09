package fr.diginamic.testexceptions;

import fr.diginamic.listes.Ville;

public class TestReflectionUtils {

	public static void main(String[] args) {

		Ville v1 = new Ville("Montpellier", 285000);
		Ville v2 = null;

		try {
			ReflectionUtils.afficherAttributs(v2);
		} catch (IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
