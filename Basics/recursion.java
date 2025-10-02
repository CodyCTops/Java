//Countdown recursion example

public class recursion {

    //recursion method
    public static void countdown(int i) {
        if (i > 0) {
            System.out.println(i + " ");
            countdown(i - 1);
        }
    }

    public static void main(String[] args) {
        
        //call method
        countdown(5);
    }
}
