//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 5:	A Java Program that shows whether the inputted number is positive, negative, or zero.

import java.util.Scanner;

public class PosNegZero{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		double number;												//variable and data type

		System.out.print ("Enter Number: ");						//input variable
		number = ip.nextDouble();

			if ( number > 0){										//conditions and its respective outputs
				System.out.println("The number is POSITIVE!");}

			else if (number < 0){
				System.out.println("The number is NEGATIVE!");}

			else {
				System.out.println("The number is ZERO!");}
	}
}