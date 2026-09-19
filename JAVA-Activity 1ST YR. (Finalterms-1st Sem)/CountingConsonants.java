//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 13:	A Java Program that prompts the user to enter a word or group of words and then displays how many consonants are present.


import java.util.Scanner;

public class CountingConsonants {
	public static void main (String[] args) {
		Scanner ip = new Scanner (System.in);

		System.out.print ("Enter a string: ");															//input variable
		String str = ip.nextLine ();

		int consonantCount = 0;																			//set variable "consonantCount" to "0" to int

		for (int i = 0; i < str.length(); i++) {														//execute the loop's body if str length is greater than i, increment 1 after each iteration
			char chr = str.charAt(i);																	//store a character from the string at a specific index

			chr = Character.toLowerCase(chr);															//assigns the lowercase version of the variable chr

			if (chr != 'a' && chr != 'e' && chr != 'i' && chr != 'o' && chr != 'u' && chr != ' ') {		//if it don't see any vowel, it will continue to iterate
					consonantCount++;
			}
		}

		System.out.println ("Number of consonants: " + consonantCount);									//print output

	}
}