package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Evgeniy Kviatkovskiy(evgencyprus@gmail.com)
 * @version $Id$
 * @since 0.1
 */

   public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
        }


         @Test
         public void whenDollarsToRubleThen() {
        Converter converter = new Converter();
             int result = converter.dollarsToRuble(100);
        assertThat(result,is(6000));
        }

         @Test
        public void whenEuroToRubleThen() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(200);
             assertThat(result,is(14000));

         }
   }







