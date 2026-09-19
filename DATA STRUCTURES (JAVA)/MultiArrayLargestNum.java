// Russell Athan R. Villanueva BSIT-1A
// A program for the problem: Ask the user to input the rows and columns of a multidimensional integer
//								array and its elements. Loop through the multidimensional array and find
//								the largest element. Print the largest element on the next line in this
//								format:"Largest: {number}".


import java.util.Scanner;
public class MultiArrayLargestNum
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

			int LargestNum = MultArray [0][0];

				for (int i = 0; i < row; i++)
				{
					for (int j = 0; j < column; j++)
					{
						if (MultArray [i][j] > LargestNum)
						{
							LargestNum = MultArray [i][j];
							}
				}
			}

		System.out.println("LARGEST: " + LargestNum);

		}
	}