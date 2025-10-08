package JavaExamples;
//direction example - OOO principles for classes, objects and loops

class cardinalDirection {
    //we start by facing north
    //values 0 = West, 1 = North, 2 = East, 3 = South
    int direction = 1;

    public int turnRight(int x) {
        System.out.println(direction);
        System.out.println("Turning Right " + x + " times");

        //nullify negative
        x = Math.abs(x);

        //loop to calculate new direction
        for(int i=0; i<x; i++) {
            System.out.println(direction);
            if(direction >= 3) {
                direction = 0;
            }
            else {
                direction = direction + 1;
            }
        }

        return direction;
    }


    public int turnLeft(int x) {
        //start direction
        System.out.println(direction);
        System.out.println("Turning Left " + x + " times");

        //nullify negative
        x = Math.abs(x);

        //loop to calculate new direction
        for(int i=0; i<x; i++) {
            System.out.println(direction);
            if(direction <= 0) {
                direction = 3;
            }
            else {
                direction = direction - 1;
            }
        }

        //return value
        return direction;
    }

    public void facing() {
        if (direction == 0) {
            System.out.println("We are facing West");
        }
        else if (direction == 1) {
            System.out.println("We are facing North");
        }
        else if (direction == 2) {
            System.out.println("We are facing East");
        }
        else if (direction == 3) {
            System.out.println("We are facing South");
        }
        else {
            System.out.println("Well... that wasn't expected");
        }
    }
}

public class directionExample {
    public static void main(String[] args) {
        //create object
        cardinalDirection cardinal = new cardinalDirection();

        //find current direction
        cardinal.facing();

        //update direction
        cardinal.turnLeft(3);
        cardinal.turnLeft(-4);

        //show direction
        cardinal.facing();

        //update direction again
        cardinal.turnRight(5);

        //final show direction
        cardinal.facing();
    }
}