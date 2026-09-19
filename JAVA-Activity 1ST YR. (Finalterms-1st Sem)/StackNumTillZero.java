//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 11:	A looping Java Program that prompts the user to enter a series of number then finds the product of the numbers inputted. The number zero (0) prompts the end of the loop.


import java.util.Scanner;

public class StackNumTillZero{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		double product = 1;													//variables and data type
		double number;

		do{																	//start of do-while loop
			System.out.print ( "Enter A Number: ");							//prompts the input of the variable
			number = ip.nextDouble();

			if (number != 0){												//sets the condition to continue multiplying the numbers until the number 0, which prompts the end of the loop
				product *= number;
				}
			}

		while (number != 0);												//end of do-while loop

		System.out.println( "Final Product: " + product);					//final output

	}
}