//Method calling - proof of concept

public class methodCalling {

    static void calledMethod() {
        System.out.println("I am the called method!");
    }
    public static void main(String[] args) {
        System.out.println("Calling method");
        calledMethod();
    }
}
