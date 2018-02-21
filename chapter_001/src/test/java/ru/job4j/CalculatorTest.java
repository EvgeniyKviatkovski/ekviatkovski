package ru.job4j

        ;
import org.junit.Test;
import ru.job4j.calculator.Calculator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Evgeniy Kviatkovskiy(evgencyprus@gmail.com)
 * @version $Id$
 * @since 0.1
 */


public class CalculatorTest {
	 /**
     * Test add.
     */

    @Test
    public void whenAddOnePlusOneThenTwo() {

        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test subtract.
     */

    @Test
    public void whenSubtractionTenMinusFiveThenFive(){
        Calculator calc = new Calculator();
        calc.divide(10,5);
        double result = calc.getResult();
        double expected = 5;
        assertThat(result, is(expected));

    }
    /**
     * Test multiply.
     */
    @Test
    public void whenTwoMultiplyTwoThenFour(){
        Calculator calc = new Calculator();
        calc.multiply(2,2);
        double result = calc.getResult();
        double expected = 4;
        assertThat(result, is(expected));
        }

    /**
     * Test devide.
     */

    @Test
    public void whenFortyDevidingTwentyThenTwo() {
        Calculator calc = new Calculator();
        calc.divide(40,20);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));
    }
}



