package it.develhope.javadoc2;

/**
 * This is a tester class
 * @author Giulia
 */
public class Start {
    /**
     * This is the main method of the program
     * @param args it takes arguments of String type and store it in a String array
     */
    public static void main(String[] args) {
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        arithmeticOperators.sum(5,6);
        arithmeticOperators.sub(10,5);
        arithmeticOperators.mul(4,5);
        arithmeticOperators.div(20,5);
    }
}
