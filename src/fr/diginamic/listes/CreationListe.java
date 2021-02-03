package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		
		// List typing in Integer
		ArrayList<Integer> liste = new ArrayList<>();
		
		// Indexed loop
		for (int i = 0; i < 100; i++) {
			liste.add(i, i+1);
		}
		
		// Show size of list
		System.out.println("Taille de la liste : " + liste.size());
		
		// Show content of list
		System.out.println(liste);
				

	}

}
