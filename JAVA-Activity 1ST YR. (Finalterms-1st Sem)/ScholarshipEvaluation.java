//Name:	Russell Athan R. Villanueva
//BSIT 1-A	(Computer Programmminng 1)
//MCO2b: Design a program that maybe implemented as a solution to a given problem using the fundamental programming components adhering to appropriate coding standard
//		 with proper documentation.


//PROBLEM:	Design a program that prompts the user to input certain variables such as name,  total average, and their family's monthly income and use said variables to figure
//			out if that person's total average is sufficient, the grade rating, and their family income status, then use those to figure out whether that person passes the
//			scholarship evaluation and is elegible for a scholarship or not.


import java.util.Scanner ;

public class ScholarshipEvaluation{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		char Letter;																	//	declare variable "Letter" to data type "char".

		System.out.println ("GOOD DAY DEAR USER!");
		System.out.println();


				do{																		//	begins the do-while looping program.
					System.out.print ("(Press S to Start Evaluation, X to Exit): ");	//	prompts the user to choose between S(start) or X(exit).
					Letter = ip.next().toUpperCase().charAt(0);							//	sets the variable to be read by the system as all caps and that only the first
					System.out.println();												//	letter of the variable is set to trigger the looping program.

					String firstname;													//	declare variables for name to String.
					String midname;
					String lastname;

					String birthmonth;													//	declare variable for birthmonth to String and, date and year to data type "int".
					int birthdate;
					int birthyear;

					String barangay;													//	declare variable for adress to String.
					String citymunicipality;
					String province;

					String educationlevel;												//	declare variable for Education Level to String.


					if (Letter == 'S'){													//	start of the if...elseif conditions and sets the first condition to the "Letter S".
						System.out.println( "Evaluation Initiating...");
						System.out.println();

						System.out.print ("Enter Last Name: ");													//	prompts the user to input the "necessary variables" for the
						lastname = ip.next().toUpperCase().toString();											//	program to work like name, address, birthday, and education.

						System.out.print ("Enter First Name: ");
						firstname = ip.next().toUpperCase().toString();

						System.out.print ("Enter Middle Inital: ");
						midname = ip.next().toUpperCase().toString();
						System.out.println();

						System.out.print ("Enter Birth Month: ");
						birthmonth = ip.next().toUpperCase().toString();

						System.out.print ("Enter Birth Date: ");
						birthdate = ip.nextInt();

						System.out.print ("Enter Year of Birth: ");
						birthyear = ip.nextInt();
						System.out.println();

						System.out.print ("Enter Barangay: ");
						barangay = ip.next().toUpperCase().toString();

						System.out.print ("Enter City/Municipality: ");
						citymunicipality = ip.next().toUpperCase().toString();

						System.out.print ("Enter Province: ");
						province = ip.next().toUpperCase().toString();
						System.out.println();

						System.out.print ("Enter Current Education Level (Primary, Secondary, Tertiary): ");	//	the input of "necessary variables" ends here.
						educationlevel = ip.next().toUpperCase().toString();									//	this line sets that all variables inputted by the user are
																												//	in all capital format when shown later on.

						double Average;															//	sets the main variables "Average" and "Income" to data type "Double".
						double Income;

						System.out.print ("Enter Total Average: ");								//	prompts the user to input the main variable "Average".
						Average = ip.nextDouble();

						System.out.print ("Enter Total Familial Monthly Income: ");				//	prompts the user to input the main variable "Income".
						Income = ip.nextDouble();
						System.out.println();
						System.out.println();

						System.out.println ("Name: " + firstname + " " + midname + " " + lastname);									// prints out necessary variable "name".
						System.out.println ("Birthday: " + birthmonth + " " + birthdate + ", " + birthyear);						// prints out necessary variable "birthday".
						System.out.println ("Age: " + (2024 - birthyear));
						System.out.println ("Address: " + "BARANGAY " + barangay + ", " + citymunicipality + ", " + province);		// prints out necessary variable "address".
						System.out.println ("Educational Level: " + educationlevel);												// prints out necessary variable "education".

						if (Average == 100 && Income <= 35000.00){														// a nested if...elseif with the following conditions and
							System.out.println ("Grade Rating: S+" );													// the following outputs.
							System.out.println ("Grade: SUFFICIENT" );
							System.out.println ("Income Status: BELOW AVERAGE" );										//	1st condition is the average = 100 and the income is
							System.out.println ("Scholarship Evaluation: PASSED" );										//	less than or equal to 35000 that prompts the output to
							System.out.println ("Scholarship Grant: ELIGIBLE" );										//	elegible for scholarship grant.
							System.out.println(); }

							else if (Average <= 99.999 && Average >= 96 && Income <= 35000.00 ){						//	2nd condition is the average is 99.99-96 with the same range
								System.out.println ("Grade Rating: A++");												//	for the income as 100 that prompts the ouput as eligible for
								System.out.println ("Grade: SUFFICIENT");												//	scholarship grant.
								System.out.println ("Income Status: BELOW AVERAGE" );
								System.out.println ("Scholarship Evaluation: PASSED" );
								System.out.println ("Scholarship Grant: ELIGIBLE" );
								System.out.println(); }

							else if (Average <= 95.999 && Average >= 90 && Income <= 35000.00 ){						//	3rd condition, average = 95.99-90 with same income range that
								System.out.println ("Grade Rating: A+");												//	that prompts the output eligible for scholarship grant.
								System.out.println ("Grade: SUFFICIENT");
								System.out.println ("Income Status: BELOW AVERAGE" );
								System.out.println ("Scholarship Evaluation: PASSED" );
								System.out.println ("Scholarship Grant: ELIGIBLE" );
								System.out.println(); }

							else if (Average <= 89.999 && Average >= 86 && Income <= 35000.00){							//	4th condition, average = 89.99-86 with same income range.
								System.out.println ("Grade Rating: A");													//	prompts the output eligible for scholarship grant.
								System.out.println ("Grade: SUFFICIENT");
								System.out.println ("Income Status: BELOW AVERAGE" );
								System.out.println ("Scholarship Evaluation: PASSED" );
								System.out.println ("Scholarship Grant: ELIGIBLE" );
								System.out.println(); }

							else if (Average <= 85.999 && Average >= 80 && Income <= 35000.00){							//	5th condition, average = 85.99-80 with same income range.
								System.out.println ("Grade Rating: B");													//	prompts output of eligible to scholarship grant.
								System.out.println ("Grade: SUFFICIENT");
								System.out.println ("Income Status: BELOW AVERAGE" );
								System.out.println ("Scholarship Evaluation: PASSED" );
								System.out.println ("Scholarship Grant: ELIGIBLE" );
								System.out.println(); }

							else if (Average <= 79.999 && Average >= 76 && Income <= 35000.00){							//	from here the output would be not eligible for
								System.out.println ("Grade Rating: C");													//	scholarship grant due to insufficiency of the main
								System.out.println ("Grade: INSUFFICIENT");												// 	variable "Grade".
								System.out.println ("Income Status: BELOW AVERAGE" );
								System.out.println ("Scholarship Evaluation: FAILED (Grade: low)" );
								System.out.println ("Scholarship Grant: NOT ELIGIBLE" );
								System.out.println(); }

							else if (Average == 75 && Income <= 35000.00){
								System.out.println ("Grade Rating: D");
								System.out.println ("Grade: INSUFFICIENT");
								System.out.println ("Income Status: BELOW AVERAGE" );
								System.out.println ("Scholarship Evaluation: FAILED (Grade: low)" );
								System.out.println ("Scholarship Grant: NOT ELIGIBLE" );								//	ends here (not eligible due to insufficent grade).
								System.out.println(); }

							else if (Average <= 99.999 && Average >= 96 && Income >= 35000.00 ){						//	from here the output would be not eligible for
								System.out.println ("Grade Rating: A++");												//	scholarship grant due to not meeting the requirements
								System.out.println ("Grade: SUFFICIENT");												//	of the main variable "Income" with no regards to the
								System.out.println ("Income Status: DECENT" );											//	results of the main variable "Grade".
								System.out.println ("Scholarship Evaluation: FAILED (Income: high)" );
								System.out.println ("Scholarship Grant: NOT ELIGIBLE" );
								System.out.println(); }

							else if (Average <= 95.999 && Average >= 90 && Income >= 35000.00 ){
								System.out.println ("Grade Rating: A+");
								System.out.println ("Grade: SUFFICIENT");
								System.out.println ("Income Status: DECENT" );
								System.out.println ("Scholarship Evaluation: FAILED (Income: high)" );
								System.out.println ("Scholarship Grant: NOT ELIGIBLE" );
								System.out.println(); }

							else if (Average <= 89.999 && Average >= 86 && Income >= 35000.00){
								System.out.println ("Grade Rating: A");
								System.out.println ("Grade: SUFFICIENT");
								System.out.println ("Income Status: DECENT" );
								System.out.println ("Scholarship Evaluation: FAILED (Income: high)" );
								System.out.println ("Scholarship Grant: NOT ELIGIBLE" );
								System.out.println(); }

							else if (Average <= 85.999 && Average >= 80 && Income >= 35000.00){
								System.out.println ("Grade Rating: B");
								System.out.println ("Grade: SUFFICIENT");
								System.out.println ("Income Status: DECENT" );
								System.out.println ("Scholarship Evaluation: FAILED (Income: high)" );
								System.out.println ("Scholarship Grant: NOT ELIGIBLE" );								//	ends here (not eligible due to Income being high).
								System.out.println(); }

							else if (Average <= 79.999 && Average >= 76 && Income >= 35000.00){							//	from here on out the output would be "Not Eligible" due to both
								System.out.println ("Grade Rating: C");													//	the main variables "Grade" and "Income" not meeting the requirements.
								System.out.println ("Grade: INSUFFICIENT");
								System.out.println ("Income Status: DECENT" );
								System.out.println ("Scholarship Evaluation: FAILED (Grade: low, Income: high)" );
								System.out.println ("Scholarship Grant: NOT ELIGIBLE" );
								System.out.println(); }

							else if (Average == 75 && Income >= 35000.00){
								System.out.println ("Grade Rating: D");
								System.out.println ("Grade: INSUFFICIENT");
								System.out.println ("Income Status: DECENT" );
								System.out.println ("Scholarship Evaluation: FAILED (Grade: low, Income: high)" );
								System.out.println ("Scholarship Grant: NOT ELIGIBLE" );
								System.out.println(); }

							else {
								System.out.println ("Grade Rating: F");
								System.out.println ("Grade: INSUFFICIENT");
								System.out.println ("Income Status: DECENT" );
								System.out.println ("Scholarship Evaluation: FAILED (Grade: low, Income: high)" );
								System.out.println ("Scholarship Grant: NOT ELIGIBLE" );								//	the nested if...elseif conditions end here.
								System.out.println(); }

						}

					else if (Letter == 'X'){														//	2nd condition for the if...elseif loop which prompts
																									//	the end of the do-while loop.
						System.out.println( "Ending Evaluation..." );
						System.out.println( "GOOD DAY!!!" );
						System.out.println();
							}

					else{																			//	end of the if...elseif loop.

						System.out.println ( "Error! Please Input S to start or X to exit." );
						System.out.println();

							}
				}
				while ( Letter != 'X');																//	closing condition for the do-while loop.s


	}
}