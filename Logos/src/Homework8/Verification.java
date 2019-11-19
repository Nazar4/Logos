package Homework8;

import java.util.Scanner;

public class Verification {

		public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a month: ");
	        String scanData = sc.next();

	        for(Month months : Month.values()) {
	            if (scanData.equalsIgnoreCase(months.name())) {
	                System.out.println("SUCCESS");
	                System.out.println();
	                monthsWithSameSeason(months);
	                System.out.println();
	                monthsWithSameNumberOfDays(months);
	                System.out.println();
	                monthsWithLowerAmountOfDays(months);
	                System.out.println();
	                monthsWithHigherAmountOfDays(months);
	                System.out.println();
	                nextSeason(months);
	                System.out.println();
	                previousSeason(months);
	                System.out.println();
	                monthsWithEvenDays();
	                System.out.println();
	                monthsWithOddDays();
	            }
	        }


	    }


	        public static void monthsWithSameSeason (Month months){
	            System.out.print("Month with same season: ");
	            for (Month month : Month.values()) {
	                if (months.getSeasons().equals(months.getSeasons())) {
	                    System.out.print(month);
	                }
	            }
	        }
	        public static void monthsWithSameNumberOfDays(Month months){
	            System.out.print("Months with same number of days: ");
	            for (Month month : Month.values()) {
	                if (month.getDays() == months.getDays()) {
	                    System.out.print(month);
	                }
	            }
	        }
	        public static void monthsWithLowerAmountOfDays (Month months){
	            System.out.print("Months with lower amount of days: ");
	            for (Month month : Month.values()) {
	                if (month.getDays() < months.getDays()) {
	                    System.out.print(months);
	                }
	            }
	        }
	        public static void monthsWithHigherAmountOfDays (Month months){
	            System.out.print("Months with higher amount of days: ");
	            for (Month month : Month.values()) {
	                if (month.getDays() > months.getDays()) {
	                    System.out.print(month + " ");
	                }
	            }
	        }
	        public static void previousSeason (Month months){
	            System.out.print("Previous season: ");
	            int nowSeason = months.getSeasons().ordinal();
	            int previousSeason = (nowSeason - 1);
	            if (previousSeason < 0) previousSeason += 4;

	            System.out.println(Seasons.values()[previousSeason]);
	        }
	        public static void nextSeason (Month months){
	            System.out.print("Next season: ");
	            int nowSeason = months.getSeasons().ordinal();
	            int nextSeason = (nowSeason + 1) % 4;
	            System.out.println(Seasons.values()[nextSeason]);
	        }
	        public static void monthsWithEvenDays () {
	            System.out.print("Month with even days: ");
	            for (Month month : Month.values()) {
	                if ((month.getDays() & 1) == 0) {
	                    System.out.println(month);
	                }
	            }
	        }
	        public static void monthsWithOddDays () {
	            System.out.print("Months with odd days: ");
	            for (Month month : Month.values()) {
	                if (month.getDays() % 2 != 0) {
	                    System.out.print(month);
	                }
	            }
	        }
}


