package org.example; //DO NOT DELETE
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;


        do {
            System.out.println("\nMenu:");
            System.out.println("1. Further Substring Fun");
            System.out.println("2. Run of Integers");
            System.out.println("3. Sum of a Range of Sequential Integers");
            System.out.println("4. Repeatedly Echo a Word");
            System.out.println("5. Two Words One Line");
            System.out.println("6. Adding Up Integers");
            System.out.println("7. Shipping Cost Calculator");
            System.out.println("8. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    furtherSubstringFun(scanner);
                    break;
                case 2:
                    runOfIntegers(scanner);
                    break;
                case 3:
                    sumOfARange(scanner);
                    break;
                case 4:
                    repeatedlyEcho(scanner);
                    break;
                case 5:
                    twoWordsLine(scanner);
                    break;
                case 6:
                    addingUpIntegers(scanner);
                    break;
                case 7:
                    shippingCostCalculator(scanner);
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 8);
    }


    public static void furtherSubstringFun(Scanner scanner) {
        System.out.println("Enter a string:");
        String input = scanner.nextLine();


        System.out.println("Enter beginning index:");
        int beginIndex = scanner.nextInt();


        System.out.println("Enter ending index:");
        int endIndex = scanner.nextInt();
        scanner.nextLine(); 


        String substring = input.substring(beginIndex, endIndex);


        System.out.println("Original string:");
        System.out.println(input);
        System.out.println();
        System.out.println("Substring:");
        System.out.println(substring);
    }


    public static void runOfIntegers(Scanner scanner) {
        System.out.println("Enter Start:");
        int start = scanner.nextInt();


        System.out.println("Enter End:");
        int end = scanner.nextInt();
        scanner.nextLine(); 


        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }


    public static void sumOfARange(Scanner scanner) {
        System.out.println("Enter low:");
        int low = scanner.nextInt();


        System.out.println("Enter high:");
        int high = scanner.nextInt();
        scanner.nextLine(); 


        int sumHigh = (high * (high + 1)) / 2;
        int sumLowMinus1 = ((low - 1) * low) / 2;
        int sum = sumHigh - sumLowMinus1;


        System.out.println("Sum = " + sum);
    }


    public static void repeatedlyEcho(Scanner scanner) {
        System.out.println("Enter a word:");
        String input = scanner.nextLine();


        int times = input.length();


        for (int i = 0; i < times; i++) {
            System.out.println(input);
        }
    }


    public static void twoWordsLine(Scanner scanner) {
        System.out.println("Enter first word:");
        String word1 = scanner.next();


        System.out.println("Enter second word:");
        String word2 = scanner.next();
        scanner.nextLine(); 


        int dots = 30 - word1.length() - word2.length();


        System.out.print(word1);
        for (int i = 0; i < dots; i++) {
            System.out.print(".");
        }
        System.out.println(word2);
    }


    public static void addingUpIntegers(Scanner scanner) {
        System.out.println("How many integers will be added:");
        int count = scanner.nextInt();


        int sum = 0;


        for (int i = 0; i < count; i++) {
            System.out.println("Enter an integer:");
            int number = scanner.nextInt();
            sum += number;
        }
        scanner.nextLine(); 


        System.out.println("The sum is " + sum);
    }


    public static void shippingCostCalculator(Scanner scanner) {
        while (true) {
            System.out.println("Weight of Order:");
            int weight = scanner.nextInt();


            if (weight <= 0) {
                System.out.println("bye");
                break;
            }


            double cost = 3.00;


            if (weight > 10) {
                cost += 0.25 * (weight - 10);
            }


            System.out.printf("Shipping Cost: $%.2f\n", cost);
        }
        scanner.nextLine(); 
    }
}
