package ru.bazhenov.fraction;


import java.io.IOException;
import java.util.Scanner;



public class Fraction implements Comparable<Fraction>{
	private int numerator;
	private int denominator;
	public void Mixed (){
		int integer;
		Fraction resultFraction = new Fraction();
		resultFraction.denominator=this.denominator;
		resultFraction.numerator=this.numerator;
		integer = resultFraction.numerator/resultFraction.denominator;
		resultFraction.numerator=resultFraction.numerator-integer*resultFraction.denominator;
		NOD(resultFraction);
		System.out.print(integer + "+");
		resultFraction.Print();
	}
	public int compareTo (Fraction firstFraction){
		int result=firstFraction.numerator*this.denominator-firstFraction.denominator*this.numerator;
		if (result<0)
			return -1;
		if (result==0)
			return 0;
		if (result>0)
			return 1;
		return -2;
	}
	public static Fraction Add (Fraction firstFraction, Fraction secondFraction){
		Fraction resultFraction = new Fraction();
		resultFraction.numerator=firstFraction.numerator*secondFraction.denominator+secondFraction.numerator*firstFraction.denominator;
		resultFraction.denominator=firstFraction.denominator*secondFraction.denominator;
		NOD(resultFraction);
		return resultFraction;
	}
	public void Print(){
		System.out.println(this.numerator + "/" + this.denominator);
	}
	public static Fraction Sub (Fraction firstFraction, Fraction secondFraction){
		Fraction resultFraction = new Fraction();
		resultFraction.numerator=firstFraction.numerator*secondFraction.denominator-secondFraction.numerator*firstFraction.denominator;
		resultFraction.denominator=firstFraction.denominator*secondFraction.denominator;
		NOD(resultFraction);
		return resultFraction;
	}
	public static Fraction Mul(Fraction firstFraction, Fraction secondFraction)	{
		Fraction resultFraction = new Fraction();
		resultFraction.numerator=firstFraction.numerator*secondFraction.numerator;
		resultFraction.denominator=firstFraction.denominator*secondFraction.denominator;
		NOD(resultFraction);
		return resultFraction;
	}
	public int getNumerator(){
		return numerator;
	}
	public int getDenominator(){
		return denominator;
	}
	public void setNumerator(int number){
		numerator=number;
	}
	public void setDenominator(int number){
		denominator=number;
	}
	public static Fraction Div(Fraction firstFraction, Fraction secondFraction){
		Fraction resultFraction = new Fraction();
		resultFraction.numerator=firstFraction.numerator*secondFraction.denominator;
		resultFraction.denominator=firstFraction.denominator*secondFraction.numerator;
		NOD(resultFraction);
		return resultFraction;
	}
	public static void NOD(Fraction fraction){
		int a; 
		int b;
		a=fraction.numerator; 
		b= fraction.denominator;
		while((a!=0) && (b!=0)){
				if(a>=b) a=a%b;
				else b=b%a;
		}
		a=a+b;
		fraction.numerator=fraction.numerator/a;
		fraction.denominator=fraction.denominator/a;
	}
	public Fraction(){
	}
	public void ScanFraction() throws IOException{
		Scanner sc = new Scanner(System.in);
		numerator=sc.nextInt();
		denominator=sc.nextInt();
	}
	public static Fraction[] ScanMass() throws IOException{
		System.out.println("¬ведите число элементов в массиве дробей дл€ сортировки");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(number);
		Fraction[] arrayFraction = new Fraction[number];
		for (int i=0; i<number; i++){
			arrayFraction[i]= new Fraction();
			arrayFraction[i].ScanFraction();
		}
		return arrayFraction;
	}
	public void PrintMass(Fractions[] array){
		
	}
}