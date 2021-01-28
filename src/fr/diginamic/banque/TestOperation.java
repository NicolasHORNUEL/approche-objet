package fr.diginamic.banque;

import fr.diginamic.banque.entites.Operation;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;

public class TestOperation {

	public static void main(String[] args) {
		
		System.out.println("TP8 - HERITAGE ET ABSTRACTION");
		System.out.println("-------------------------------");
		
		Credit cre1 = new Credit("lundi", 50);
		Credit cre2 = new Credit("mardi", 150);
		Debit deb1 = new Debit("jeudi", 150);
		Debit deb2 = new Debit("samedi", 1780);
		
		Operation[] opeTab = new Operation[] {cre1, cre2, deb1, deb2};
		
		double total = 0.0;
		for (int i = 0; i < opeTab.length; i++) {
			System.out.println(opeTab[i].afficherType());
			String opeType = opeTab[i].getClass().getName();
			if (opeType == "fr.diginamic.banque.entites.Credit") {
				total += opeTab[i].getMontant();
			} else if (opeType == "fr.diginamic.banque.entites.Debit") {
				total -= opeTab[i].getMontant();
			}
		}
		System.out.println();
		System.out.println("Total des opérations : "+total);
		
	}

}
