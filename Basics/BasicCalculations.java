//Basic calculations with Java

import java.util.Scanner;

public class BasicCalculations {
    public static void main (String[] args) {

        //Scanner
        Scanner scanner = new Scanner(System.in);

        //User Input
        System.out.println("Please enter two numbers:");

        System.out.println("Number One: ");
        int firstNum = scanner.nextInt();
        
        System.out.println("Number Two: ");
        int secondNum = scanner.nextInt();

        //Multiplication
        int mult = firstNum * secondNum;
        System.out.println(firstNum + " * " + secondNum + " = " + mult);

        //Division
        int div = firstNum / secondNum;
        System.out.println(firstNum + " / " + secondNum + " = " + div);

        //Addition
        int add = firstNum + secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + add);

        //Subtraction
        int sub = firstNum - secondNum;
        System.out.println(firstNum + " - " + secondNum + " = " + sub);

        //close Scanner
        scanner.close();
    }
}