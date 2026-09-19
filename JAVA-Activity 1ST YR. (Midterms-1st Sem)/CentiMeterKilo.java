//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 4:	A Java Program that computes and converts centimeters(cm) to meters(m) and kilometers(km).

import java.util.Scanner;

public class CentiMeterKilo{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		double number;																					//variables and data type

		System.out.print ("Enter Centimeter: ");														//imput variable
		number = ip.nextDouble();

		double Meter = number * 100;																	//processess
		double Kilometer = number * 100000;

		System.out.println("Meter: " + number + "cm" + " = " + Meter + " meters (m)");					//outputs
		System.out.println("Kilometer: " + number + "cm" + " = " + Kilometer + " kilometers (km)");

	}
}