//testing multiple user integer inputs

import java.util.Scanner;

public class userMultiplication {
    public static void main(String[] args) {

        //Create Scanner
        Scanner scanner = new Scanner(System.in);

        //User Prompt
        System.out.println("Please enter two integers for multiplication\n");

        //User Input
        System.out.println("Enter the first number: ");
        int numOne = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int numTwo = scanner.nextInt();

        //System Multiplication
        int numThree = numOne * numTwo;

        //System Output
        System.out.println("\nThis equals: " + numThree);
        
        //close Scanner
        scanner.close();
    }
}
