package DateTimeAPI;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author KaustubhWaghmare
 *
 */
public class LocalDateExample {
	public static void main(String args[]){
		
		LocalDate date;
		date = LocalDate.now();
		System.out.println("Date -- "+date);
		
		date = LocalDate.of(2017, 1, 23);
		System.out.println("Date -- "+date);
		
		date = LocalDate.of(2017, Month.APRIL, 23);
		System.out.println("Date -- "+date);
		
		date = LocalDate.ofEpochDay(11111);
		System.out.println("Date -- "+date);
		
		date = LocalDate.of(2017, Month.APRIL, 23);
		System.out.println("Date -- "+date);
		
		date=LocalDate.ofYearDay(2018, 21);
		System.out.println("Date -- "+date);
		
	}

}
