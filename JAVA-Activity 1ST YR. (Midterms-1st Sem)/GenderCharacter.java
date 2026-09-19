//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 7:	A Java Program that determines one's gender from letters "m/M" or "f/F" and determines unspecification otherwise.

import java.util.Scanner;

	public class GenderCharacter {
		public static void main (String[] args) {
			Scanner ip = new Scanner (System.in);

			char gender;

			System.out.print ("Enter a character: ");
			gender = ip.next().charAt(0);

			switch (gender) {
				case 'M':
				case 'm':
					System.out.println ("Male!");
					break;
				case 'F':
				case 'f':
					System.out.println ("Female!");
					break;
				default:
					System.out.println ("Prefer not to specify.");
		}
	}
}