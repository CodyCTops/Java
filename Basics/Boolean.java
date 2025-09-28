//Boolean returns true if value is less than 5

public class Boolean {
    public static void simpleBool() {
        //variables
        int x = 5;

        System.out.println("x < 10: " + (x < 10));
        System.out.println("x > 10: " + (x > 10));
        System.out.println("x = 10: " + (x == 10));        
    }

    public static void loopBool() {
        //variable assignment
        int x = 10;
        int y = 4;
        int z = 0;
        boolean varFlag = false;

        //Loop
        while (y < x) {
            z = z + 1;
            System.out.println("Loop " + z + ": X < Y\n" + varFlag);
            x = x - 1;
        }
    }

    public static void main (String[] args) {
        simpleBool();
        loopBool();
    }
}
