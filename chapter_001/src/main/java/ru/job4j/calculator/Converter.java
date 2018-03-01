package ru.job4j.calculator;

/**
 * Корвертор валюты.
 */

public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        int euro = value / 70;
        return euro;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        int dollars = value / 60;
        return dollars;
    }

    /**
     * Конвертируем eвро в рубли.
     * @param value евро.
     * @return рубли
     */

    public int euroToRuble(int value){

       int ruble = value * 70;
        return ruble;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return рубли
     */

    public int dollarsToRuble(int value){

        int ruble = value * 60;

        return ruble;
   }

}// end class
