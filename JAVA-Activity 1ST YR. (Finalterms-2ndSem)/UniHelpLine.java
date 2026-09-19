//UniHelpLine.java
//Russell Athan R. Villanueva
//MCO3:	A program that will assess how the student will make careful choices of data structures and
//		algorithms to address requirements needed to solve the computing problem. (Individual project)

//Problem:	Design a program that would act as a mini help line for a university student (like a lost item or grade calculation), using a multidimensional array.


import java.util.*;

public class UniHelpLine																							//class name
{
	public static void main (String[] args)																			//main method
	{
		Scanner ip = new Scanner(System.in);																		//for scanner

		char Begin;																									//declare the variable "Begin" with data type char.

		System.out.println ("------------------------------------------------------------------");					//Introductory part
		System.out.println ("WELCOME TO UniHelpLine!!!");
		System.out.println ("------------------------------------------------------------------");
		System.out.println ("ENTER (Q) to open our (Query Panel)...");												//Gives the user the exactly 3 choices to prompt the start of
		System.out.println ("ENTER (G) to open our (Grade Calculation Panel)...");									//the program.
		System.out.println ("ENTER (X) to (Exit)...");
		System.out.println ("------------------------------------------------------------------");

		do {																										//do while loop starts

			System.out.print ("Enter: ");																			//prompts the user to input one of the 3 choices above
			Begin = ip.next().toUpperCase().charAt(0);																//stores the prompt that the user made
			System.out.println ();

						if (Begin == 'Q')																			// start of if...else if loop with condition of the char 'Q'
						{
							queries();																				//method call for the method queries.
							}

						else if (Begin == 'G')																		//else if with the condition of char 'G'
						{
							calculation();																					//method call for the method calculation
							System.out.println ("------------------------------------------------------------------");
							System.out.println ("ENTER (Q) to open our (Query Panel)...");
							System.out.println ("ENTER (G) to open our (Grade Calculation Panel)...");
							System.out.println ("ENTER (X) to (Exit)...");
							System.out.println ("------------------------------------------------------------------");
							}

						else if (Begin == 'X')																				//else if with char 'X' as condition
						{
							System.out.println ("------------------------------------------------------------------");
							System.out.println ("Exiting UniHelpLine...");
							System.out.println ("Have a Wonderful Day!");
							System.out.println ("------------------------------------------------------------------");

							}

						else																								//else
						{
							System.out.println ("Error! Please Enter Q for Queries, G for Grade Calculation, X to Exit");
							System.out.println ("------------------------------------------------------------------");
							System.out.println ();
									}																						//end of the if...else if loop

			} while (Begin != 'X');																					//end of do...while loop with the condition to keep on looping
																													//as long as the char 'X' is not entered

		}																											//end of the main method


		public static void queries()																				//the queries method we called earlier
		{
			Scanner ip1 = new Scanner(System.in);																	//scanner
			int QOption;																							//declaring QOption as int data type

			System.out.println ("------------------------------------------------------------------");
			System.out.println ("Welcome To Queries...");															//introductory
			System.out.println ("------------------------------------------------------------------");
			System.out.print ("Enter Number of Queries: ");															//prompts the user to enter a number of queries.
			int item = ip1.nextInt();																				//stores the prompted number to be used as the number of
			System.out.println ("------------------------------------------------------------------");				//rows for the multidimensional array.
			System.out.println ();

			String[][] MultArray1 = new String[item][4];															//declaration of the multidimensional array with a fixed
																													//number of columns .
			do {																									//start of another do...while loop

				System.out.println ("------------------------------------------------------------------");
				System.out.println ("Choose an Option: ");															//prints out the options that the user will prompt
				System.out.println ("1. Query Lost Item...");
				System.out.println ("2. Check Missing Items...");
				System.out.println ("3. Return to Main Page...");
				System.out.println ();



				System.out.print ("Option: ");																		//prompts the user for an option from the data above
				QOption = ip1.nextInt();																			//stores the user prompt in 'QOption'
				ip1.nextLine();
				System.out.println ("------------------------------------------------------------------");
				System.out.println ();

				switch (QOption)																					//start of the switch statement with QOption as expression
				{
					case 1:																							//first case of the switch statement that prompts the user
						for (int i = 0; i < item; i++)																//to input the description of the query.
						{
							for (int j = 0; j < 4; j++)
							{
								System.out.print ("Enter Discription " + (j + 1) + " for Query " + (i + 1) + "(Item, Last Seen, Brand, etc.): ");		//prompts the user to input
								MultArray1[i][j] = ip1.nextLine();																						//stores in array
								System.out.println ();

								}
							}
							System.out.println ();
							System.out.println ("------------------------------------------------------------------");

							System.out.println ("Lost Item Registered...");
							System.out.println ("------------------------------------------------------------------");
							System.out.println ();

						break;																						//break of case 1

					case 2:																							//start of case 2 of the statement
						for (int i = 0; i < item; i++)																//for loop that prints out the query
						{
							System.out.print ("Query " + (i + 1) + ": ");

							for (int j = 0; j < 4; j++)
							{
								System.out.print (" / " + MultArray1[i][j] + " / ");								//the array that stored the query was printed
								}
							System.out.println ();
							System.out.println ("------------------------------------------------------------------");
							System.out.println ();
							}
						break;																						//break for case 2

					case 3:																							//case 3
						System.out.println ("Returning to Main Page...");
						System.out.println ("------------------------------------------------------------------");
						System.out.println ("------------------------------------------------------------------");
						System.out.println ("ENTER (Q) to open our (Query Panel)...");
						System.out.println ("ENTER (G) to open our (Grade Calculation Panel)...");
						System.out.println ("ENTER (X) to (Exit)...");
						System.out.println ("------------------------------------------------------------------");
						return;																						//returns the user to the main page and ends case 3

					default:																						//default of the statement
						System.out.println("Invalid Option... Choose A Query...");									//tells the user of the invalid option if the user ever inputs.
						System.out.println ("------------------------------------------------------------------");

					}



				} while(QOption != 0);																				//end of the 2nd do...while loop with the condition to end only
																													//if the option 0 was inputted.

			}																										//end of the queries method

		public static void calculation ()																			//the calculation method we called earlier
			{
				Scanner ip2 = new Scanner(System.in);																//scanner

				System.out.println ("------------------------------------------------------------------");
				System.out.print("Enter Number of Grades: ");														//prompts the user to enter the number of grades to be computed.
				int grade = ip2.nextInt();																			//stores that data in variable grade.
				System.out.println ("------------------------------------------------------------------");

				double[] array = new double [grade];																//declaration of the array to be used.
																													//double because grades tend to have decimals.
				for (int i = 0; i < grade; i++)																		//for loop with the conditions.
				{
					System.out.print("Enter Grade " + (i + 1) + ": ");												//prompts the user to input the value of numbered grades
					array[i] = ip2.nextDouble();																	//stores the data to the array
					}																								//end of for loop

				double sum = 0;																						//declaration of the variable sum to data type double

				for (int i = 0; i < grade; i++)																		//for loop with the conditions
				{
					sum += array[i];																				//sums up the values the user inputted
					}																								//end of for loop

					double average = sum / grade;																	//converts it to average
					System.out.println ("------------------------------------------------------------------");
					System.out.println ("Sum: " + sum);																//prints out the sum
					System.out.println ();
					System.out.printf ("Average: %.2f%n", average);													//prints out the average
					System.out.println ("------------------------------------------------------------------");
		}																											//end of the calculation method

	}																												//end of the program... Thank you!!