package ru.job4j.calculator;

/**
* Программа расчета идеального веса.
*/
public class Fit {

	/**
	 * Идеальный вес для мужщин.
	 *
	 * @param height Рост.
	 * @return идеальный вес.
	 */
	 public static double Value_Formen = 100;
	 public static double Value_Forwomen = 110;
	 public static double Just_Value = 1.15;

	double manWeight(double height) {
		double iweightformen = (height - Value_Formen) * Just_Value;
		return iweightformen;
	}

	/**
	 * Идеальный вес для женщины.
	 *
	 * @param height Рост.
	 * @return идеальный вес.
	 */
	double womanWeight(double height) {
		double iweightforwomen = (height - Value_Forwomen) * Just_Value;
		return iweightforwomen;
	}
}