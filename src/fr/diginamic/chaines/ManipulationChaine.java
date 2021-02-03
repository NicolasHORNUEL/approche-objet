package fr.diginamic.chaines;

import fr.diginamic.theatre.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
	
		String chaine = "Durand;Marcel;2 523.5";
		
		char premierCaractere = chaine.charAt(0);
		int longueur = chaine.length();
		int indexOfEnd = chaine.indexOf(';');
		int indexOfStart = chaine.indexOf('D');
		String subChaine = chaine.substring(indexOfStart,indexOfEnd);
				
		System.out.println("Premier caractère : " + premierCaractere);
		System.out.println("Longueur chaine de caractères : " + longueur);
		System.out.println("Index du 1er caractère ';' : " + indexOfEnd);
		System.out.println("Nom de famille : " + subChaine);
		System.out.println("En majuscules : " + subChaine.toUpperCase());
		System.out.println("En minuscules : " + subChaine.toLowerCase());

		System.out.print("Affichage du tableau : ");

		String[] tab = chaine.split(";");
		
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]+" ");
		}
		
		tab[2] = tab[2].replace(" ","");		
		Salarie s1 = new Salarie(tab[0], tab[1], Double.parseDouble(tab[2]));

		System.out.println("\nNouveau salarié : " + s1.getNom() + " " + s1.getPrenom() + ", salaire : " + s1.getSalaire() + '\u20AC');

	}


}
