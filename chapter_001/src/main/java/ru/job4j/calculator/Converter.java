package ru.job4j.calculator;
/**
 * Корвертор валюты.
 */
public class Converter {
    public static final int EURO_RATE = 70;
    public static final int DOLLAR_RATE = 60;
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        int euro = value / EURO_RATE;
        return euro;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры.
     */
    public int rubleToDollar(int value) {
        int dollar = value / DOLLAR_RATE;
        return dollar;
    }
    /**
     * Конвертируем eвро в рубли.
     * @param value евро.
     * @return рубли.
     */
    public int euroToRuble(int value) {
        int ruble = value * EURO_RATE;
         return ruble;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return рубли
     */
    public int dollarsToRuble(int value) {
        int ruble = value * DOLLAR_RATE;
        return ruble;
   }
}
