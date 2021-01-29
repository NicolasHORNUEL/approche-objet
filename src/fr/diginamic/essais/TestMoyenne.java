package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		CalculMoyenne cm1 = new CalculMoyenne();
		cm1.ajout(1.1);
		cm1.ajout(5.2);
		cm1.ajout(50.7);
		System.out.println(cm1.calcul());
		
		CalculMoyenne cm2 = new CalculMoyenne();
		cm2.ajout(33.3);
		cm2.ajout(66.6);
		cm2.ajout(33.3);
		System.out.println(cm2.calcul());
		
		
	}

}
