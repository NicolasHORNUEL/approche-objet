package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		System.out.println("TP5 - ENCAPSULATION");
		System.out.println("-------------------------------");

		Compte c1 = new Compte(1234567,100.07);
		System.out.println(c1);

		System.out.println();
		System.out.println("TP7 - HERITAGE ET CONSTRUCTEURS");
		System.out.println("-------------------------------");
		
		// Créez un tableau de comptes de 2 instances.
		Compte[] tableau = new Compte[2];	
		
		// instances et stockage dans le tableau
		tableau[0] = new Compte(7778889,-35.56);
		tableau[1] = new CompteTaux(7492648,129.99,2.34);
		
		// Faire une boucle sur le tableau et affichez les infos
		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}

	}

}
