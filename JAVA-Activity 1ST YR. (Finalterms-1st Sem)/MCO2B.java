import java.util.Scanner ;

public class MCO2B{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		char Letter;

				do{
					System.out.print ("(Press S to Start, X to exit): ");
					Letter = ip.next().toUpperCase().charAt(0);
					System.out.println();

					String firstname;
					String midname;
					String lastname;

					if (Letter == 'S'){
						System.out.println( "Evaluation Initiating...");
						System.out.println();

						System.out.print ("Enter Last Name: ");
						lastname = ip.next().toUpperCase().toString();

						System.out.print ("Enter First Name: ");
						firstname = ip.next().toUpperCase().toString();

						System.out.print ("Enter Middle Inital: ");
						midname = ip.next().toUpperCase().toString();
						System.out.println();

						double number1, number2, number3, number4, number5, number6, number7, number8, number9;

						System.out.print ("Enter First Average: ");
						number1 = ip.nextDouble();

						System.out.print ("Enter Second Average: ");
						number2 = ip.nextDouble();

						System.out.print ("Enter Third Average: ");
						number3 = ip.nextDouble();

						System.out.print ("Enter Fourth Average: ");
						number4 = ip.nextDouble();

						System.out.print ("Enter Fifth Average: ");
						number5 = ip.nextDouble();

						System.out.print ("Enter Sixth Average: ");
						number6 = ip.nextDouble();

						System.out.print ("Enter Seventh Average: ");
						number7 = ip.nextDouble();

						System.out.print ("Enter Eighth Average: ");
						number8 = ip.nextDouble();

						System.out.print ("Enter Ninth Average: ");
						number9 = ip.nextDouble();

						System.out.println();

						double Sum = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9;
						double Average = Sum / 9;

						System.out.println("The Total Average is " + Average + ".");
						System.out.println();

						System.out.println ("Name: " + lastname + ", " + firstname  + " " + midname);

						if (Average == 100){
							System.out.println ("Rating: S+" );
							System.out.println ("Evaluation: MAGNIFICENT!!!" );
							System.out.println(); }

							else if (Average <= 99.9 && Average >= 96 ){
								System.out.println ("Rating: A++");
								System.out.println ("Evaluation: EXCELLENT!!!");
								System.out.println(); }

							else if (Average <= 95.9 && Average >= 90 ){
								System.out.println ("Rating: A+");
								System.out.println ("Evaluation: OUTSTANDING!!!");
								System.out.println(); }

							else if (Average <= 89.9 && Average >= 86 ){
								System.out.println ("Rating: A");
								System.out.println ("Evaluation: AMAZING!!!");
								System.out.println(); }

							else if (Average <= 85.9 && Average >= 80 ){
								System.out.println ("Rating: B");
								System.out.println ("Evaluation: GREAT!!!");
								System.out.println(); }

							else if (Average <= 79.9 && Average >= 76 ){
								System.out.println ("Rating: C");
								System.out.println ("Evaluation: GOOD...");
								System.out.println(); }

							else if (Average == 75 ){
								System.out.println ("Rating: D");
								System.out.println ("Evaluation: ROOM FOR IMPROVEMENT...");
								System.out.println(); }

							else {
								System.out.println ("Rating: F");
								System.out.println ("Evaluation: FAILED...");
								System.out.println(); }


						}

					else if (Letter == 'X'){

						System.out.println( "Ending Evaluation..." );
						System.out.println( "GOOD DAY!!!" );
						System.out.println();
							}

					else{

						System.out.println ( "Error! Please Input Y to continue or X to exit." );
						System.out.println();

							}
				}
				while ( Letter != 'X');


	}
}