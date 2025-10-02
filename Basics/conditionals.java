import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        //define variables
        int deal = 3; // 1 = bad, 2 = neutral, 3 = good
        int value = 4;

        //else if
        if (deal == 1) {
            System.out.println("Thats a bad deal...");
        }
        if (deal == 2) {
            System.out.println("Thats an ok deal.");
        }
        if (deal == 3) {
            System.out.println("Thats a goood deal!");
        }
        else {
            System.out.println("that wasn't an expected input!");
        }


        //switch
        switch (value) {
            case 1:
                System.out.println("The value is 1");
                break;
            case 2:
                System.out.println("The value is 2");
                break;
            case 3:
                System.out.println("The value is 3");
                break;
            case 4:
                System.out.println("The value is 4");
                break;
            case 5:
                System.out.println("The value is 5");
                break;
            default:
                System.out.println("Thats not an expected value!");
        }
    }
}
