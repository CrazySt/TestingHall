package ru.bazhenov.fraction;

import java.util.Arrays;

public class Fractions {
	public static float ConvertToFloat(Fraction fraction){
		float result;
		result=fraction.getNumerator()/fraction.getDenominator();
		return result;
	}
	public static void ArraySort(Fraction[] a){
		Arrays.sort(a);
	}
}
