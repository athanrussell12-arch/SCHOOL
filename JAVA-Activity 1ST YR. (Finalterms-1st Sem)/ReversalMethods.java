//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 16:	A Java Program that prompts the user to enter a specific integer and prints out the reversed version of the variable inputted.


import java.util.Scanner;

public class ReversalMethods {
	public static int reversedInput(int num) {										//modifiers, returntype, methodname, and argument

		int reversed = 0;															//intialization

		for (; num != 0; num /= 10) {												//condition and iteration
			int digit = num % 10;													//assigns last digit od input in int variable "digit"
			reversed = reversed * 10 + digit;										//updates "reversed" variable by shifting its digit one place to left
		}

		return reversed;															//returns the new value of reversed variable
	}


	public static void main(String[] args) {
		Scanner ip = new Scanner (System.in);

		System.out.print ("Enter a number: ");										//prompt user input
		int num = ip.nextInt();

		int reversedInt = reversedInput(num);										//calling reversedInput method and storing it in int reversedInt variable

		System.out.println ("The reverse digit of " + num + " is " + reversedInt);	//print output
	}
}