package org.example.exceptions;

public class Calculator {

    //integer
    public int divide(int o1, int o2) throws DivideByZeroException {
        // "o" is an operand
        int returnvalue = 0;

        if (o2 != 0) {
            returnvalue = o1 / o2;
        } else {
            throw new DivideByZeroException("You cannot divide by zero");
        }
        return returnvalue;
    }
    //double
    public double divide(double o1, double o2) throws DivideByZeroException {
        double returnvalue = 0.0;

        if (o1 != 0) {
            returnvalue = o1 / o2;
        } else {
            throw new DivideByZeroException("You cannot divide by zero");
        }
        return returnvalue;
    }

    public static void main(String[] args) throws DivideByZeroException {
        Calculator c = new Calculator();
        try {
            System.out.println(c.divide(2, 0));
        } catch (DivideByZeroException e) {
            throw new RuntimeException(e);
        }
    }
}
