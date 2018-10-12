package PPJ.git;

import java.util.Scanner;

public class wynagrodzenie_kalkulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte godziny;
		float stawka;
		float nadgodziny;
		
		Scanner h = new Scanner(System.in);
		
		System.out.println("podaj liczbê godzin:");
		godziny = h.nextByte();
		
		
		Scanner pln = new Scanner(System.in);
		System.out.println("podaj stawkê:");

		stawka = pln.nextFloat();
		if (godziny>60) {
			System.out.println("za du¿a liczba godzin");
		}
		else if (godziny<40) {
			System.out.println("za ma³a liczba godzin");
		}
		else {
		System.out.println("wynagrodznie: "+godziny*stawka+"PLN");
		}
		
		}
		
		
		
}

