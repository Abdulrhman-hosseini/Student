import java.util.Scanner;

public class Student2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("\nStudent " + i);

            System.out.print("Enter student's name: ");
            String name = input.nextLine();

            System.out.print("Enter first exam score: ");
            double score1 = input.nextDouble();

            System.out.print("Enter second exam score: ");
            double score2 = input.nextDouble();

            System.out.print("Enter third exam score: ");
            double score3 = input.nextDouble();
            input.nextLine();

            double average = calculateAverage(score1, score2, score3);
            String grade = determineGrade(average);

            System.out.println("Student: " + name);
            System.out.printf("Average: %.2f\n", average);
            System.out.println("Grade: " + grade);
        }

    }
    public static double calculateAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }


    public static String determineGrade(double average) {
        if (average >= 85) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}

