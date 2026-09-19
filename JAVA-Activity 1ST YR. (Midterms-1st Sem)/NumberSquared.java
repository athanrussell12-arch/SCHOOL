//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 1:	A Java Program that computes the squared of the number that was inputted.

import java.util.Scanner;

public class NumberSquared{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		double number;																		//variable and data type

		System.out.print ("Enter Number: ");												//input
		number = ip.nextDouble();

		double Squared = number * number;													//process

		System.out.println("The squared of the number " + number + " is " + Squared);		//output

	}
}