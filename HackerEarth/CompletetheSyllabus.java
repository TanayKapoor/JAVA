package HackerEarth;

import java.util.Scanner;

public class CompletetheSyllabus {
    public static void main(String[] args ) {
        try {
            Scanner sc = new Scanner(System.in) ;
            int testCases = sc.nextInt() ;

            while (testCases != 0) {
                int topics = sc.nextInt() ;
                int[] daysToStudy = new int[7] ;
                int totalWeekWork = 0 ;
                int lastDayOfWork = 0;

                for (int i = 0 ; i < 7 ; i++) {
                    daysToStudy[i] = sc.nextInt() ;
                    totalWeekWork += daysToStudy[i] ;
                    if (daysToStudy[i] != 0) {
                        lastDayOfWork = i+1 ;
                    }
                }
                int day ;
                topics = topics % totalWeekWork ;

                if (topics == 0) {
                    day = lastDayOfWork ;
                }
                else {
                    name :
                    while (true) {
                        for (int i = 0 ; i < 7 ; i++) {
                            topics -= daysToStudy[i] ;
                            if (topics <= 0) {
                                day = i + 1 ;
                                break name;
                            }
                        }
                    }
                }
                System.out.println(dayOfWeek(day));

                testCases-- ;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private static String dayOfWeek(int day) {
        return switch (day) {
            case 1 -> "MONDAY";
            case 2 -> "TUESDAY";
            case 3 -> "WEDNESDAY";
            case 4 -> "THURSDAY";
            case 5 -> "FRIDAY";
            case 6 -> "SATURDAY";
            default -> "SUNDAY";
        };
    }
}
