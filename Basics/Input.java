// testing the import utility

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        //create scanner
        Scanner scanner = new Scanner(System.in);

        //prompt user
        System.out.println("Enter Username: ");

        //read user input
        String userName = scanner.nextLine();

        //output user input
        System.out.println("Username is: " + userName);
        scanner.close();
    }
}
