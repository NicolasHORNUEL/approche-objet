package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		

		for (Saison string : Saison.values()) {
			System.out.println(string);
		}
		
		String nom = "ETE";
		System.out.println(Saison.valueOf(nom).getLibelle());
		
		String libelle = "Hiver";
		System.out.println(Saison.getIntance(libelle));

	}

}
