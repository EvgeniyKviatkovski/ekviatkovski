package ru.job4j.calculator;

/**
 * this class for arithmetic calculations.
 * @autor evgeniy kviatkovski.
 * @since 21.02.18.
 * @version 1.
 */

public class Calculator {
    /**
     *addition of two numbers.
     *@param first it's first arg.
     *@param second it's second arg.
     *@return resalt.
     */

    private double result;
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     *subtraction of two numbers.
     *@param first it's first arg.
     *@param second it's second arg.
     *@return resalt.
     */

    public void subtract (double first,double second){
        this.result = first - second;
    }

    /**
     *multiplication of two numbers.
     *@param first it's first arg.
     *@param second it's second arg.
     *@return resalt.
     */

  public void multiply(double first,double second){
        this.result = first * second;
  }
    /**
     *devision of two numbers.
     *@param first it's first arg.
     *@param second it's second arg.
     *@return resalt.
     */
    public void divide (double first, double second){
        this.result = first / second;
  }

    public double getResult() {
        return this.result;
    }

}
