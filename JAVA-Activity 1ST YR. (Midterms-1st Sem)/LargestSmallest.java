//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 6:	A Java Program that determines which of the three inputted integers are the largest and smallest.

import java.util.Scanner;

public class LargestSmallest{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		double num1, num2, num3;						//variables and data types
		double Largest, Smallest;

		System.out.print ("Enter Integer 1: ");			//input variables
		num1 = ip.nextDouble();

		System.out.print ("Enter Integer 2: ");
		num2 = ip.nextDouble();

		System.out.print ("Enter Integer 3: ");
		num3 = ip.nextDouble();

		Largest = num1;
		Smallest = num1;

					if (num2 > Largest) {				//conditions and specifications
						Largest = num2;
					}
					if (num2 < Smallest) {
						Smallest = num2;
					}

					if (num3 > Largest) {
						Largest = num3;
					}
					if (num3 < Smallest) {
						Smallest = num3;
					}

			System.out.println("The largest number is: " + Largest);			//output
         	System.out.println("The smallest number is: " + Smallest);

	}
}