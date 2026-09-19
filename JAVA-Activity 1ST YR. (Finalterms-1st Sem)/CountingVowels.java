//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 15:	A Java Program that prompts the user to enter a string and prints out the number of vowel(s).


import java.util.Scanner;

public class CountingVowels {
	public static void main (String[] args) {
		Scanner ip = new Scanner (System.in);


		System.out.print ("Enter a string: ");													//user inputs variable
		String str = ip.nextLine ();

		int vowelCount = 0;																		//intialize int variable vowelCount to 0

		for (int i = 0; i < str.length(); i++) { 												//execute the loop's body if str length is greater than i, increment 1 after each iteration
			char chr = str.charAt(i);															//store a character from the string at a specific index
			chr = Character.toLowerCase(chr);													//assigns the lowercase version of the variable chr

			if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {			//an "if" condition that when it sees any vowel, it will continue to iterate
			vowelCount++;

			}
		}

		System.out.println ("Number of Vowels: " + vowelCount);									//print output

	}
}