//Sum A+B
//Goal: Capture 2 user inputs and output the sum

//Library's
import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //initialize
        
        //gather input 1
        System.out.print("Input First Number: "); 
        int FirstNum = scanner.nextInt(); //input 1
        System.out.print("\n");

        //gather input 2
        System.out.print("Input Second Number: ");
        int SecNum = scanner.nextInt();
        System.out.print("\n");

        //calculate and output total
        int Sum = FirstNum + SecNum;
        System.out.println("Total sum is: " + Sum);

        scanner.close();
    }
}