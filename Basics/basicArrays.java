public class basicArrays {
    public static void main(String[] args) {
        //values
        String[] cars = {"Volkswagen", "Audi", "Porsche"};
        int[] numbers = {5,10,15,20,25};

        //print array values as index
        //Output should be Audi and 20
        System.out.println(cars[1]);
        System.out.println(numbers[3] + "\n");

        //print all values in the array
        System.out.println("All car models:\n");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        //Sum of value in an int array
        System.out.println("\ntotal of numbers in the array:");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}