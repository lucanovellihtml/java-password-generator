package org.lessons.java.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		//DICHIARAZIONI VARIABILI
		String name = "Luca";
		String surname = "Novelli";
		String color = "black";
		String birth = "21/12/2000";

		
		/*
		  - METODO CALCOLO PASSWORD;
		  - LA STRINGA DELLA DATA DI NASCITA VIENE SPLITTATA DAL VALORE "/" E SUCCESSIVAMENTE VIENE MEMORIZZATO OGNI SPLIT IN UN ARRAY;
		  - VENGONO INIZIALIZZATE LE VARIABILI DI NASCITA CON LA POSIZIONE SPECIFICA DELL'ARRAY;
		  - VIENE FATTA LA DOMMA DAL GIORNO, MESE E ANNO DI NASCITA;
		  - VIENE CREATA LA PASSWORD E STAMPATA A VIDEO;
		
		*/
		String[] date = birth.split("/");
		int day = Integer.valueOf(date[0]);
		int mounth = Integer.valueOf(date[1]);
		int year = Integer.valueOf(date[2]);
		int summ = day + mounth + year;
		String password = name + "-" + surname + "-" + color + "-" + summ;
		System.out.print("Password ---> " + password);
	}

}
