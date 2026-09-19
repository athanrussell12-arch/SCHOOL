// Russell Athan R. Villanueva BSIT-1A
// A program for the problem: Ask the user to input the number of rows and columns of a
//								multidimensional array and its corresponding elements.
//								Then, print its elements starting from the end (i.e. last
//								row, last column) all the way to the start (i.e. first row,
//								first column). Print the elements by separating each element
//								by \t by column and a new line per row.

import java.util.Scanner;
public class MultiArrayReverse
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

				for (int i = row - 1; i >= 0; i--)
				{
					for (int j = column - 1; j >= 0; j--)
					{
					System.out.print (MultArray[i][j] + " ");
						}
			System.out.println();
					}

		}
	}