package ru.bazhenov.fraction;


import java.io.IOException;

public class FractionTest {

	public static void main(String[] args) throws IOException {
		Fraction firstFraction = new Fraction();
		Fraction secondFraction = new Fraction();
		firstFraction.ScanFraction();
		secondFraction.ScanFraction();
		Fraction.Add(firstFraction, secondFraction).Print();
		Fraction.Sub(firstFraction, secondFraction).Print();
		Fraction.Mul(firstFraction, secondFraction).Print();
		Fraction.Div(firstFraction, secondFraction).Print();
		firstFraction.Mixed();
		secondFraction.Mixed();
		Fraction[] array = Fraction.ScanMass();
		System.out.println(Fractions.ConvertToFloat(firstFraction));
		Fractions.ArraySort(array);
		
	}
}
