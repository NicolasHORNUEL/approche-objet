package fr.diginamic.parseur;

public class Parser extends Expression {

	
	public Parser(String membreGauche, char operateur, String membreDroite) {
		super(membreGauche, operateur, membreDroite);
	}

	
	public static Expression parse(String chaine) {		
		int delimiter = 0;
		char operateur = '\u0000';
		char[] opeTab = {'+', '-', '*', '/'};
		for (int i = 0; i < opeTab.length; i++) {
			if (chaine.indexOf(opeTab[i]) != -1) {
				delimiter = chaine.indexOf(opeTab[i]);
				operateur = opeTab[i];
			}
		}	
		String subChaineG = chaine.substring(0,delimiter);
		String subChaineD = chaine.substring(delimiter+1,chaine.length());			
		return new Expression(subChaineG,operateur,subChaineD);
	}

	
}
