//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 18:	A Java Program that prompts the user to enter a number for the sides of a square and displays it by asterisks.


import java.util.Scanner;

public class Asterisks {
	public static void printSquare(int side) {

		for (int i = 0; i < side; i++) {						//runs the outer loop, column
			for (int j = 0; j < side; j++) {					//runs the inner loop, row
					System.out.print ("*");						//output
			}

			System.out.println ();
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner (System.in);

			System.out.print ("Enter side of a square: ");		//prompt input
			int side = ip.nextInt();

		System.out.println ("The square of " + side + ":");		//output
		printSquare(side);

	}

}