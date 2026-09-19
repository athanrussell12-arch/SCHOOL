//Russell Athan R. Villanueva
// BSIT-1A
//



import java.util.Scanner;

public class PopArray
{
	public static void main (String [] args)
	{
		Scanner ip = new Scanner (System.in);

		System.out.println("Starting PopArray Operation...");	//for Pop
		System.out.println();

		System.out.print("Enter Array Size: ");					//prompting user to input desired size of array
		int size1 = ip.nextInt();

		int[] array1 = new int[size1];							//array declaration
		int top1 = size1 - 1;									//assuming that the array is full

		for (int i = 0; i < size1; i++)							//start of a for loop that asks the user for the values of the array
		{
			System.out.print("Value Of Position " + i + ": ");	//prompts the user to input the values of the array
			array1[i] = ip.nextInt();
			}

		if (top1 == -1)											//sets a condition that if the array has no value to pop print out STACK UNDERFLOW
		{
			System.out.println("Stack Underflow...");
			System.out.println();
			}

		else
		{
			int num1 = array1[top1];							//declaration of the variable num1

			System.out.println("Popped Number: " + num1);		//displays the value that was popped
			top1--;

			System.out.print("Values After The Pop: ");			//displays the remaining values
			for (int i = 0; i <= top1; i++)
			{
				System.out.print(array1[i] + " ");
					}

			System.out.println();
			System.out.println();
			}

		System.out.println("Starting PeekArray Operation...");	//for Peek

		if (top1 == -1)
		{
			System.out.println("Array Is Empty!");				//condition set that if there are no values then print the following
			}

		else
		{
			int val1 = array1[top1];
			System.out.println("Top Value : " + val1);			//display or print the top value
			}

		System.out.println();
		System.out.println();



		System.out.println("Starting PushArray Operation...");	//for Push
		System.out.println();

		System.out.print("Enter Array Size: ");					//prompting user to input desired size of the array
		int size2 = ip.nextInt();

		int[] array2 = new int[size2];							//array declaration
		int top2 = -1;											//initializing that the array is empty


		for (int j = 0; j < size2; j++)							//a loop that will continue until the array is full
		{
			System.out.print("Enter Value To Push: ");			//prompting user to input values that will be pushed
			int val2 = ip.nextInt();

			if (top2 == size2 - 1)
			{
				System.out.println("Stack Overflow...");		//condition that will print STACK OVERFLOW if the array exceeds its prompted size
				System.out.println();
				break;
				}

			else
			{
				top2++;
				array2[top2] = val2;
				System.out.println("Value Pushed: " + val2);	//part of the if else loop that displays the value that was pushed

				}
			}


		System.out.print("Final List Of Values: ");				//prints the final list of all the pushed values that the user inputted
		for (int j = 0; j <= top2; j++)
		{
			System.out.print(array2[j] + " ");
			}

		System.out.println();
		System.out.println();

		System.out.println("Starting PeekArray Operation...");	//for Peek

		if (top2 == -1)
		{
			System.out.println("Array Is Empty!");				//condition set that if there are no values then print the following
			}

		else
		{
			int val3 = array2[top2];
			System.out.println("Top Value : " + val3);			//display or print the top value
			}

		System.out.println();
		System.out.println();





		}

	}