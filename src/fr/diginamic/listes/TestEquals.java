package fr.diginamic.listes;

public class TestEquals {

	public static void main(String[] args) {
		
		// Test Override Equals
		Ville v1 = new Ville("Marseille", 850700);
		Ville v2 = new Ville("Marseille", 850701);
		
		boolean egalite2 = v1.equals(v2);
		System.out.println(egalite2);
		
		if (v1.equals(v2)) {
			System.out.println("Les villes sont identiques");
		} else {
			System.out.println("Les villes sont différentes");
		}
		
		v1 = v2;
		
		boolean egalite1 = v1==v2;
		System.out.println(egalite1);

		if (v1 == v2) {
			System.out.println("Les villes sont identiques");
		} else {
			System.out.println("Les villes sont différentes");
		}

	}

}
