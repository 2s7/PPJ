

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Data {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	 
	        System.out.println("Podaj datê w formacie \"dd-MM-yyyy\": ");
	        String date = input.nextLine();
	        
	        DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        LocalDate podanaData = LocalDate.parse(date, dateFormater);
	 
	        System.out.println("w tym dniu wypada: "+podanaData.getDayOfWeek());
	        
	        LocalDate todayNextYear = podanaData.plusYears(1);
	        System.out.println("w " + podanaData.plusYears(1)+" wypadnie: " + todayNextYear.getDayOfWeek());
	 

	    }
}
