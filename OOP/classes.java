//classes examples

class Car {
    //values 0 = West, 1 = North, 2 = East, 3 = South
    int gear = 1;

    //Direction prompts
    void accelerate() {
        System.out.println("Increasing Velocity");
        if(gear <= 5) {
            gear = gear + 1;
            System.out.println("We are in gear " + gear);
        }
    }

    void decelerate() {
        System.out.println("Decreasing Velocity");
        if(gear >= 0) {
            gear = gear - 1;
            System.out.println("We are in gear " + gear);
        }
    }

    void turnRight() {
        System.out.println("Turning Right");
    }

    void turnLeft() {
        System.out.println("Turning Left");
    }
}

public class classes {
    public static void main(String[] args) {
        //create object
        Car sportCar = new Car();

        //test speed up/down
        sportCar.accelerate();
        sportCar.decelerate();

        //test direction logs
        sportCar.turnLeft();
        sportCar.turnRight();
    }
}