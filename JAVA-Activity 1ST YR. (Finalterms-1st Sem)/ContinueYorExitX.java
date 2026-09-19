//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 10:	A Java Program that prompts the user to enter "Y" to continue and "X" to exit.


import java.util.Scanner;

public class ContinueYorExitX{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		char Letter;																						//variable and data type

		do{																									//start of do-while loop
			System.out.print ("(Press Y to continue, X to exit): ");										//prompt to input first variable
			Letter = ip.next().toUpperCase().charAt(0);														//set string class method to set the 1st letter is in uppercase as well as to ensure that the 1st letter is the only one that is read

			if (Letter == 'Y'){																				//set 1st condition and the next line is the output
				System.out.println( "Continuing...");
				}

				else if (Letter == 'X'){																	//set 2nd condition and the next line is the output
					System.out.println( "Exiting..." );
					}

				else{
						System.out.println ( "Error! Please Input Y to continue or X to exit." );			//set 3rd condition and the output
					}

		}
		while ( Letter != 'X');																				//end of do-while loop

	}
}