package it.develhope.javadoc2;

/**
 * This class represents arithmetic operators
 * @author Giulia
 */
public class ArithmeticOperators {
    /**
     * This method calculate the sum of the 2 int numbers
     * @param sum1 The first int type number
     * @param sum2 The second int type number
     * @return the sum of the 2 int numbers
     */
    public int sum(int sum1, int sum2){
        int sum = sum1 + sum2;
        return sum;
    }

    /**
     * This method calculate the subtraction of the 2 int numbers
     * @param sub1 The first int type number
     * @param sub2 The second int type number
     * @return the subtraction of the 2 int numbers
     */
    public int sub(int sub1, int sub2){
        int sub = sub1 - sub2;
        return sub;
    }

    /**
     * This method calculate the product of the 2 int numbers
     * @param mul1 The first int type number
     * @param mul2 The second int type number
     * @return the product of the 2 int numbers
     */
    public int mul(int mul1, int mul2){
        int mul = mul1 * mul2;
        return mul;
    }

    /**
     * This method calculate the division of the 2 int numbers
     * @param div1 The first int type number
     * @param div2 The second int type number
     * @return the division of the 2 int numbers
     */
    public int div(int div1, int div2){
        int div = div1/div2;
        return div;
    }
}
