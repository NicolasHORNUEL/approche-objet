package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte newC = new Compte(12344657,100.07);
		System.out.println(newC);

	}

}
