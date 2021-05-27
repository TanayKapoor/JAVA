package PracticalFile;

import java.util.Arrays;

public class EmployeeSalaryCL {
    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("Tanay | 1955991593");
        System.out.println("------------------");

        int[] salary = new int[args.length];
        int numCount = 0;
        int frequencyCount = 1;

        //        Typecasting array
        for (int i = 0; i < args.length; i++) {
            salary[i] = Integer.parseInt(args[i]);
        }

        //        Finding lowest and highest salaries
        int lowest = salary[0];
        int highest = salary[0];

        for (int i = 0; i < args.length; i++) {
            if (salary[i] > highest) {
                highest = salary[i];
            } else if (salary[i] < lowest) {
                lowest = salary[i];
            }
        }
        System.out.println("Highest salary is: " + highest);
        System.out.println("Lowest salary is: " + lowest);

        //        Finding number of employees having more than 5k salary
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > 5000) {
                numCount++;
            }
        }
        System.out.println("Employees having more than 5000 salary: " + numCount);

        //        Finding number of employees having equal salary

        Arrays.sort(salary);
        for (int i = 0; i < salary.length; i++) {

            for (int j = i + 1; j < salary.length; j++) {
                if (salary[i] == salary[j]) {
                    frequencyCount++;
                }
            }
        }
        System.out.println(frequencyCount + " employee have same salary");

    }
}