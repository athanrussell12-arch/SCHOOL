//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 14:	A Java Program that prompts the user to enter two strings and prints out the lengths of each string and the sum of the lengths of both strings.


import java.util.Scanner;

public class CountingStringLength {
	public static void main (String[] args) {
		Scanner ip = new Scanner (System.in);

	System.out.print ("Enter the first string: ");						//first user input
	String str1 = ip.nextLine ();

	System.out.print ("Enter the second string: ");						//second user input
	String str2 = ip.nextLine ();

	int length1 = str1.length();										//store str1's length in int variable length1
	int length2 = str2.length();										//store str2's length in int variable length2

	System.out.println ("Length of the first string: "+ length1);		//output 1st string length
	System.out.println ("Length of the second string: " + length2);		//output 2nd string length

	int sum = length1 + length2;										//add the length of both strings

	System.out.println ("Sum: " + sum);									//print output

	}
}