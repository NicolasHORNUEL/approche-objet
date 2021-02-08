package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		Date date = cal.getTime();	
		SimpleDateFormat formatage1 = new SimpleDateFormat("dd/MM/yy");	
		String jString1 = formatage1.format(date);
		System.out.println(jString1);
		
		cal = Calendar.getInstance();
		date = cal.getTime();	
		
		SimpleDateFormat[] formatages = {
				new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"),
				new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRANCE),
				new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINA),
				new SimpleDateFormat("EEEE dd MMMM yyyy", new Locale("ru", "RU")),
				new SimpleDateFormat("EEE d MMM yyyy", Locale.GERMANY)
		};
		
		for (SimpleDateFormat formatage : formatages) {
			System.out.println(formatage.format(date));
		}
	}
}
