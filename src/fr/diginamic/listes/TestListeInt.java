package fr.diginamic.listes;

import java.util.ArrayList;

public class TestListeInt {

	public static void main(String[] args) {

		ArrayList<Integer> liste1 = new ArrayList<>();
		liste1.add(-1);
		liste1.add(5);
		liste1.add(7);
		liste1.add(3);
		liste1.add(-2);
		liste1.add(4);
		liste1.add(8);
		liste1.add(5);
		System.out.println("liste1 : " + liste1);
		System.out.println("Taille de la liste1 : " + liste1.size());

		int valeurMax = 0;
		for (int i = 0; i < liste1.size(); i++) {
			if (liste1.get(i)>valeurMax) {
				valeurMax = liste1.get(i);
			}
		}
		System.out.println(valeurMax + " est le plus grand élément");
		
		int valeurMin = 0;
		for (int i = 0; i < liste1.size(); i++) {
			if (liste1.get(i)<valeurMin) {
				valeurMin = liste1.get(i);
			}
		}
		System.out.print("On supprime le plus petit élément : " + valeurMin);		
		liste1.remove(liste1.indexOf(valeurMin));
		System.out.println(". La liste1 devient : " + liste1);
		
		for (int i = 0; i < liste1.size(); i++) {
			if (liste1.get(i)<0) {
				int newElt = liste1.get(i) * -1;
				liste1.set(i, newElt);
			}
		}
		System.out.println("Voici la liste des éléments devenus positifs : " + liste1);
		
		
	}

}
