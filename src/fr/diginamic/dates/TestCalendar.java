package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2016, 4, 19, 23, 59, 30);
		Date jDate1 = cal1.getTime();	
		SimpleDateFormat formatage1 = new SimpleDateFormat("dd/MM/yy");	
		String jString1 = formatage1.format(jDate1);
		System.out.println(jString1);
		
		Calendar cal2 = Calendar.getInstance();
		Date jDate2 = cal2.getTime();	
		SimpleDateFormat formatage2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");	
		String jString2 = formatage2.format(jDate2);
		System.out.println(jString2);
		
		Locale[] localite = new Locale[] {
				Locale.FRANCE,
				Locale.CHINA,
				new Locale("ru"),
				Locale.GERMANY
		};		
		for (Locale locale : localite) {
			SimpleDateFormat formatagel = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss", locale);
			String jStringl = formatagel.format(jDate2);
			System.out.println(jStringl);
		}

	}

}
