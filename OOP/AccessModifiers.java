//showing how to connect to private and protected classes from other classes

class Vehicle {
    //set private value
    private int KM = 12000;

    //getter class to allow access to private value
    public int getKM() {
        return KM;
    }
}

class AccessModifiers {
    public static void main(String[] args) 
    {
        //set new object
        Vehicle porsche = new Vehicle();

        //show how many KMs the car has
        System.out.println(porsche.getKM());
    }
}
