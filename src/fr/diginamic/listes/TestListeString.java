package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {

		ArrayList<String> liste1 = new ArrayList<>();
		liste1.add("Nice");
		liste1.add("Carcassonne");
		liste1.add("Narbonne");
		liste1.add("Lyon");
		liste1.add("Foix");
		liste1.add("Pau");
		liste1.add("Marseille");
		liste1.add("Tarbes");

		int letterMax = 0;
		String ville = null;
		for (int i = 0; i < liste1.size(); i++) {
			if (liste1.get(i).length() > letterMax) {
				letterMax = liste1.get(i).length();
				ville = liste1.get(i);
			}
		}
		System.out.println(ville + " est la ville qui a plus grand nombre de lettre");
		
		for (int i = 0; i < liste1.size(); i++) {
			liste1.set(i, liste1.get(i).toUpperCase());
		}
		System.out.println(liste1);
		
		Iterator<String> iter = liste1.iterator();
		while (iter.hasNext()) {
			String string = (String) iter.next();
			if (string.charAt(0)=='N') {
				iter.remove();
			}
		}
		System.out.println(liste1);
		
	}

}
