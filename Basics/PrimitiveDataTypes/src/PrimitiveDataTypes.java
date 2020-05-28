/**  Data cited from https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html  **/

public class PrimitiveDataTypes {

    /**  This is the entry point in your program/code  **/
    public static void main(String[] args) {

        /**  Different Primitive Data Types  **/
        /**  Primitive Data Types are different ways of storing data into variables depending on the program's needs  **/
        /**  [Note]: Signed variables are both positive and negative  **/


        byte b = 14; // The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters.
        short s = 12; // The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive)
        int i = 10000; // The int data type is a 32-bit signed two's complement integer, which has a minimum value of -231 and a maximum value of 231-1
        long l = 1000000; // The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1

        /**  [Note]: for float data types you must include a f after the float to convert it from a double to a float  **/
        float f = 12.4f; // The float data type is a single-precision 32-bit IEEE 754 floating point.
        double d = 12.46; // The double data type is a double-precision 64-bit IEEE 754 floating point.
        double scientificNotation = 1246e-2; // You can also use Scientific Notation for doubles
        System.out.println(scientificNotation);

        boolean isItTrue = true; // The boolean data type has only two possible values. true and false. It is generally used to track true/false conditions
        boolean isItFalse = false;

        char character = 'a'; // The char data type is a single 16-bit Unicode character, meaning that is stores a single character


    }

}
