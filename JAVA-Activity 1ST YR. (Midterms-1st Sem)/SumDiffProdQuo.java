//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 2:	A Java Program that computes the sum, difference, product, and quotient of two inputted numbers.

import java.util.Scanner;

public class SumDiffProdQuo{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		double Number1, Number2;						//variables and data type

		System.out.print ("Enter First Number: ");		//input variables
		Number1 = ip.nextDouble();

		System.out.print ("Enter Second Number: ");
		Number2 = ip.nextDouble();

		double Sum = Number1 + Number2;					//process
		double Difference = Number1 - Number2;
		double Product = Number1 * Number2;
		double Quotient = Number1 / Number2;

		System.out.println( Number1 + " + " + Number2 + " = " + Sum + " is the sum." );							//output
		System.out.println( Number1 + " - " + Number2 + " = " + Difference + " is the difference." );
		System.out.println( Number1 + " * " + Number2 + " = " + Product + " is the product." );
		System.out.println( Number1 + " / " + Number2 + " = " + Quotient + "is the quotient." );

	}
}