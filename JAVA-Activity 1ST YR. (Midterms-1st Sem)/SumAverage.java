//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 3: 	A Java Program that computes the total sum of five quiz averages and computes the final average.

import java.util.Scanner;

public class SumAverage{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		double number1, number2, number3, number4, number5;					//variables and data type

		System.out.print ("Enter First Average: ");							//input variables
		number1 = ip.nextDouble();

		System.out.print ("Enter Second Average: ");
		number2 = ip.nextDouble();

		System.out.print ("Enter Third Average: ");
		number3 = ip.nextDouble();

		System.out.print ("Enter Fourth Average: ");
		number4 = ip.nextDouble();

		System.out.print ("Enter Fifth Average: ");
		number5 = ip.nextDouble();

		double Sum = number1 + number2 + number3 + number4 + number5;		//process
		double Average = Sum / 5;

		System.out.println("The Sum of the 5 averages is " + Sum + ".");	//output
		System.out.println("The Total Average is " + Average + ".");

	}
}