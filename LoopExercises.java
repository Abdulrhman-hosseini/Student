import java.util.Scanner;

public class LoopExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n---------------------------");

        System.out.print("Enter a number to check even or odd: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        System.out.println("---------------------------");

        // 3. Use switch to display the name of the day
        System.out.print("Enter a number (1-7) for day of the week: ");
        int day = input.nextInt();

        switch (day) {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Invalid day number.");
        }
        System.out.println("---------------------------");


        System.out.print("Enter a number to print its multiplication table: ");
        int tableNum = input.nextInt();

        System.out.println("Multiplication table for " + tableNum + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
        }
        System.out.println("---------------------------");


        System.out.print("Enter a number to count its digits: ");
        int countNum = input.nextInt();
        int originalNum = countNum;
        int count = 0;

        if (countNum == 0) {
            count = 1;
        } else {
            while (countNum != 0) {
                countNum /= 10;
                count++;
            }
        }
        System.out.println("Number of digits in " + originalNum + " = " + count);
        System.out.println("---------------------------");


        System.out.print("Enter a number to reverse: ");
        int reverseNum = input.nextInt();
        int reversed = 0;
        int temp = reverseNum;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reversed number of " + reverseNum + " = " + reversed);


    }
}
