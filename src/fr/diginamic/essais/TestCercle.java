package fr.diginamic.essais;

import fr.diginamic.geometrie.entites.Cercle;
import fr.diginamic.geometrie.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		
		// Circle exercise
		Cercle c1 = new Cercle(3.3);
		Cercle c2 = new Cercle(103.56);		
		System.out.println(c1.perimetre());
		System.out.println(c1.surface());
		System.out.println(c2.perimetre());
		System.out.println(c2.surface());
		
		// Circle Factory exercise
		double r1 = 3.3;
		Cercle c3 = CercleFactory.circleBuilder(r1);
		System.out.println(c3.perimetre());
		System.out.println(c3.surface());

		
	}

}
