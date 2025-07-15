import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numOfStudent = 5;
        int [] numbersOfMark = new int[numOfStudent];
        for (int i = 0;i<numOfStudent;i++){
            System.out.println("Enter a numbersOfMark : " + (i+1));
            numbersOfMark[i]=scanner.nextInt();

        }


        int total = 0;
        int highest = numbersOfMark[0];
        int lowest = numbersOfMark[0];
        int passed = 0;
        int failed = 0;
        for ( int i = 0;i<numOfStudent;i++){
            int mark = numbersOfMark[i];
            total+=mark;

            if (mark>highest){
                highest=mark;
            }
            if (mark<lowest){
                lowest=mark;
            }
            if (mark>=50){
                passed++;
            }else {
                failed++;
            }

        }

        double average = (double) total / numOfStudent;

        for (int i =0;i<numOfStudent;i++){
            System.out.println("student: "+(i+1) +" " + numbersOfMark[i]);
        }

        System.out.println("Average mark: " + average);
        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);
        System.out.println("Number of students passed: " + passed);
        System.out.println("Number of students failed: " + failed);
    }
}
