//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 12: A Java Program that prompts the user to input an integer and produces the reversed version of the inputted integer.


import java.util.Scanner;

public class ReverseNumbers{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.print ("Enter A Number: ");							//the part that prompts the input of an integer
		int number = ip.nextInt();										// variable and data type

		System.out.print ("Reversed Number: ");

		for ( ; number > 0 ; number /= 10){								//for loop, an iteration that prints the last digit number
			System.out.print (number % 10);								//remove the last digit by integer division
		}

		System.out.println();											//showcase output

	}
}