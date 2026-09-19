import java.util.Scanner;

public class ArrayMultD
{
	public static void main (String [] args)
	{
		Scanner ip = new Scanner (System.in);

		System.out.print ("Input Number of Rows: ");
		int row = ip.nextInt();

		System.out.print ("Input Number of Columns: ");
		int column = ip.nextInt();

		String [][] MultArray = new String [row][column];

		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				System.out.print("ENTER AT ROW[" + i + "] COLUMN[" + j + "]:");
				MultArray [i][j] = ip.next().toString();
				}
			}
		for (int i = 0 ; i >= 0; i++)
		{
			for (int j = 0 ; j >= 0; j++)
			{
				System.out.print (MultArray[i][j] + " ");
				}
		System.out.println();
			}
		}
	}
