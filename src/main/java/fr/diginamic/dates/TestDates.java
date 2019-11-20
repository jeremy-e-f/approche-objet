package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date dateJour= new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(dateJour));
		
		dateJour= new Date();
		dateJour.setHours(23);
		dateJour.setMinutes(30);
		dateJour.setSeconds(59);
		SimpleDateFormat sdf2= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf2.format(dateJour));
		
		dateJour= new Date();
		System.out.println(sdf2.format(dateJour));
		
		
	}

}
