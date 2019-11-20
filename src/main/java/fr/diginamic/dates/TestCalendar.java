package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar calendar= Calendar.getInstance();
		Date dateJour= calendar.getTime();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(dateJour));
		
		calendar= Calendar.getInstance();
		calendar.set(Calendar.HOUR, 23);
		calendar.set(Calendar.MINUTE, 30);
		calendar.set(Calendar.SECOND, 59);
		dateJour= calendar.getTime();
		SimpleDateFormat sdf2= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf2.format(dateJour));
		
		calendar= Calendar.getInstance();
		dateJour= calendar.getTime();
		SimpleDateFormat sdf3= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(sdf3.format(dateJour));

	}

}
