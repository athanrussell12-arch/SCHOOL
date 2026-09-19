//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 9:	A "while loop" Java Program that prompts the user input to a specific integer and in case that there are zeroes consecutively next to each other, displays how many zeroes can be seens.


import java.util.Scanner ;

public class CountTrailingZeroes{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		int number ;

		System.out.print("Enter An Interger: ");
		number = ip.nextInt();

		int count = 0;
		while (number %10 == 0){
			count++;
			number /= 10;
		}

		System.out.println("Number Of Trailing Zeroes: " + count);
	}
}
