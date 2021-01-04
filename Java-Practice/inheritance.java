import java.util.Scanner;

class Person{
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printPerson(){
        System.out.println("Name: " + lastName + ", " + "\nID: " + idNumber);
    }
}

class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores){
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    char calculate(){
        int total = 0;

        for (int testScore : testScores) total += testScore;

        int average = total / testScores.length;

        if (average >= 90 && average <= 90) return 'O';
        if (average >= 80 && average <= 90) return 'E';
        if (average >= 70 && average <= 80) return 'A';
        if (average >= 55 && average <= 70) return 'P';
        if (average >= 40 && average <= 55) return 'D';
        return 'T';
    }
}

public class inheritance {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student student = new Student(firstName, lastName, id, testScores);
        student.printPerson();
        System.out.println("Grade: " + student.calculate());
    }
}