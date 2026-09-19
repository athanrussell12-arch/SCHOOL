//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 8:	A Java Program that specifies whether a number is Java, Program, or Java Program by its divisibility to numbers "2" and "5".

import java.util.Scanner;

	public class Divisible_Two_Five {
		public static void main (String[] args) {
			Scanner ip = new Scanner (System.in);

			int number;												//variables and data type

			System.out.print ("Enter a number: ");					//input variable
			number = ip.nextInt ();

			if ((number % 2 == 0) && (number % 5 != 0)) {			//conditions and its respective outputs
				System.out.println ("Java!");
			}
			else if ((number % 2 != 0) && (number % 5 == 0)) {
				System.out.println ("Program!");
			}
			else if ((number % 2 == 0) && (number % 5 == 0)){
				System.out.println ("Java Program!");
			}
			else {
				System.out.println ("None of the above...");
			}

		}
	}