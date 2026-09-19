// Russell Athan R. Villanueva BSIT-1A
// A program for the problem: Ask the user to create an integer array by inputting the size of an array and its
//								elements. If the size of the array is odd, print the middle of the array. If the
//								size of the array is even, print the two middle elements instead.


import java.util.Scanner;
public class ArrayOddEven
{
	public static void main (String [] args)
	{
		Scanner ip = new Scanner(System.in);

		System.out.print("ENTER SIZE OF THE ARRAY: ");
		int size = ip.nextInt();

		int[] array = new int [size];

		System.out.println("ENTER THE ELEMENTS OF THE ARRAY: ");

		for (int i = 0; i < size; i++)
		{
			array[i] = ip.nextInt();
			}

			if (size % 2 == 1)
			{
				System.out.println("MEDIAN: " + array[size / 2]);
				}
			else
				System.out.println("MEDIAN: " + array[size / 2] + " and " + array[size / 2 - 1]);
		}
	}