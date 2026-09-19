// Russell Athan R. Villanueva BSIT-1A
// A program for the problem: Create an array by asking the user to input the size of an array and its elements.
//								Then print all of its elements on the next line in one line, seperated by a coma
//								with a space, starting from the last element to the first.

import java.util.Scanner;
public class ArrayReversed
{
	public static void main (String [] args)
	{
		Scanner ip = new Scanner(System.in);

		System.out.print("ENTER SIZE OF THE ARRAY: ");
		int size = ip.nextInt();

		int[] array = new int [size];

		for (int i = 0; i < size; i++)
		{
			System.out.print("ENTER ELEMENT #" + (i + 1) + ": ");
			array[i] = ip.nextInt();
			}

		for (int i = size - 1; i >= 0; i--)
		{
			System.out.print( array[i] );
			if (i > 0)
			{
				System.out.print(", ");
				}
			}
			System.out.println();
		}
	}