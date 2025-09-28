//basics with multidimensional arrays

public class multiArray {
    public static void main(String[] args) {
        //variables
        int[][] varArr= {{1,2,3},{7,8,9}};

        //print a specific index
        //Should print out the first array, index 2, which would be 3
        System.out.println(varArr[0][2] + "\n");

        //changing a value in the multidimensional array
        //Should print 5;
        varArr[0][2] = 5;
        System.out.println(varArr[0][2] + "\n"); 

        //The lengths of rows and columns
        System.out.println("Rows: " + varArr.length);
        System.out.println("Cols in Row 0: " + varArr[0].length);
        System.out.println("Cols in Row 1: " + varArr[1].length + "\n");

        //printing all values in a multidimensional array
        for (int row = 0; row < varArr.length; row++) {
            for (int col = 0; col < varArr[row].length; col++) {
                System.out.println("varArr[" + row + "][" + col + "] = " + varArr[row][col]);
            }
        }
        System.out.println();

        //fun - printing the array as it would be written on paper
        for (int row = 0; row < varArr.length; row++) {
            int index = 0;
            for (int col = 0; col < varArr[row].length; col++) {
                if (col > index) {
                    System.out.print(",");
                    index++;
                }
                System.out.print(varArr[row][col]);
            }
            System.out.println("");
        }
    }
}