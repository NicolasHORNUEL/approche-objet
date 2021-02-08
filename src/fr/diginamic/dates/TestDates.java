package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {

		// java.util.Date constructeur deprecated
		@Deprecated // annotation permettant de générer le message javadoc
		// année à partir de 1900
		// mois à partir de 0
		// jour
		// heure
		// minute
		// seconde
		Date jDate = new Date();
		// java.text.SimpleDateFormat
		SimpleDateFormat formatage = new SimpleDateFormat("dd/MMMM/yyyy");
		// invoquer la méthode de conversion Date vers String
		String jString = formatage.format(jDate);
		// Affichage de la String
		System.out.println(jString);
		
		Date jDate2 = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat formatage2 = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss");
		String jString2 = formatage2.format(jDate2);
		System.out.println(jString2);
		
		Date jDate3 = new Date();
		String jString3 = formatage2.format(jDate3);
		System.out.println(jString3);
		

		
		
	}

}
