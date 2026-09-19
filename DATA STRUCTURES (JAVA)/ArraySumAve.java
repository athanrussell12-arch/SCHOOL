// Russell Athan R. Villanueva BSIT-1A
// A program for the problem: A program that creates an integer array by asking the user to input the
//								size of an array and its elements. Then, traverse through the array and
//								compute for the sum of its elements and its average.


import java.util.Scanner;
public class ArraySumAve
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

		int sum = 0;

		for (int i = 0; i < size; i++)
		{
			sum += array[i];
			}

			double average = sum / size;
			System.out.println ("Sum: " + sum);
			System.out.printf ("Average: %.2f%n", average);
		}
	}