package Assignment3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Add1WeekToCurrentDate {
	
    public static void main(String[] args) {
        
        //First Way
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        //add 1 week to the current date
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("\nNext week: " + nextWeek);
        
//        //Second Way
//        long theFuture = System.currentTimeMillis() + (86400 * 7 * 1000);
//        Date nextWeek = new Date(theFuture);
//        System.out.println(nextWeek);
        
        
    }

}

