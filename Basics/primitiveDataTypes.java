public class primitiveDataTypes {
    public static void main(String[] args) {
        //basic facts:
        // byte 	Stores whole numbers from -128 to 127
        // int 	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
        // long 	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // float 	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        // double 	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
        // boolean 	Stores true or false values
        // char 	Stores a single character/letter or ASCII values
        // short 	Stores whole numbers from -32,768 to 32,767
        //date types are static and cannot be changed

        //examples
        byte numByte = 1;
        int numInt = 7;
        long numLong = 899999999999999999L;
        float numFloat = 5.12f;
        double numDouble = 2.12345678901234;
        short numShort = 32760;
        char letterVal = 'U';
        boolean boolVal = true;

        //output
        System.out.println(numByte);
        System.out.println(numInt);
        System.out.println(numLong);
        System.out.println(numFloat);
        System.out.println(numDouble);
        System.out.println(numShort);
        System.out.println(letterVal);
        System.out.println(boolVal);
    }
}
