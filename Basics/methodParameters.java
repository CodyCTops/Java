public class methodParameters {
    static void myMethod(String wordGiven) {
        System.out.println("String: " + wordGiven);
    }

    static void methodTwo(int numGiven) {
        System.out.println("Int: " + numGiven);
    }

    static void multiParams(String newWord, int newNum) {
        System.out.println(newWord + newNum);
    }

    static int calcMethod(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        myMethod("Five");
        myMethod("Twenty");
        myMethod("Ten");

        methodTwo(5);
        methodTwo(10);
        methodTwo(15);

        multiParams("Elves ", 10000);
        multiParams("Humans ", 80);
        multiParams("Dwarves ", 400);
        multiParams("Hobits ", 100);

        System.out.println("calculated: " + calcMethod(5, 5));
        System.out.println("calculated: " + calcMethod(3, 5));
        System.out.println("calculated: " + calcMethod(2, -8));
    }
}
