package fr.diginamic.essais;

import fr.diginamic.parseur.Expression;
import fr.diginamic.parseur.Parser;

public class TestParseur {

	public static void main(String[] args) {
		
			Expression expr = Parser.parse("x+3");
			double resultat = expr.evaluer("x", 2.5);
			System.out.println(resultat);

	}

}
