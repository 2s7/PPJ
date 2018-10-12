package PPJ.git;
import java.util.Scanner;
public class wypelnienie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] tablica;
		  Scanner odczyt = new Scanner(System.in);

		  System.out.println("Podaj iloœæ elementów: ");
		  int liczbaElementow = odczyt.nextInt();
		  tablica = new int[liczbaElementow];

		  for(int i=0; i<tablica.length; i++)
	              tablica[i] = i+1;

	          int licznik=0;
	          while(licznik<tablica.length){
	              System.out.print(tablica[licznik]+" ");
	              licznik++;
	          }
	  }
	}