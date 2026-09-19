// Russell Athan R. Villanueva BSIT-1A
// A program for the problem: Ask the user to input the rows and columns of a multidimensional array and its elements.
//								Then, ask the user to input an integer and check if it exists in the multidimensional
//								array. Print "Found!" if it exists, otherwise print "Sorry, {value} not found.".

import java.util.Scanner;
public class MultiArrayNumberHunt
{
	public static void main (String[] args)
		{
			Scanner ip = new Scanner(System.in);

			System.out.print("INPUT NUMBER OF ROWS: ");
			int row = ip.nextInt();

			System.out.print("INPUT NUMBER OF COLUMNS: ");
			int column = ip.nextInt();

			int [][] MultArray = new int[row][column];

			for (int i = 0; i < row; i++)
			{
				for (int j = 0; j < column; j++)
				{
					System.out.print("ENTER AT ROW[" + i + "] COLUMN[" + j + "]:" );
					MultArray [i][j] = ip.nextInt();
					}
				}

					System.out.print("ENTER X: ");
					int X = ip.nextInt();

					int Num = 0;

					for (int i = 0; i < row; i++)
					{
						for (int j = 0; j < column; j++)
						{
				 			if (MultArray[i][j] == X)
							{
								Num = MultArray[i][j];
								}
							}
						}

					if (Num == X)
						{
							System.out.println ("FOUND!");
							}
						else
							System.out.println ("SORRY, " + X + " NOT FOUND.");

			}
	}