package org.lessons.java.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		//DICHIARAZIONI VARIABILI
		String name = "Luca";
		String surname = "Novelli";
		String color = "black";
		String birth = "21/12/2000";

		
		//METODO CALCOLO PASSWORD
		String[] date = birth.split("/");
		int day = Integer.valueOf(date[0]);
		int mounth = Integer.valueOf(date[1]);
		int year = Integer.valueOf(date[2]);
		int summ = day + mounth + year;
		String password = name + "-" + surname + "-" + color + "-" + summ;
		System.out.print("Password ---> " + password);
	}

}
