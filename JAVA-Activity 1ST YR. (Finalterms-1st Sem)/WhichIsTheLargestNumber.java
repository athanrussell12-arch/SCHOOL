//Russell Athan R. Villanueva
//BSIT 1-A	Computer Programming 1
//Activity No. 17:	A Java Program that prompts the user to enter a string and prints out the number of vowel(s).


import java.util.Scanner;

public class WhichIsTheLargestNum {
	public static int findLargest(int[] nums) {								//modifiers, returntype, methodname, and argument
		int largestnum = nums[0]; 											//assuming that the first num is largest

		for (int i = 1; i < nums.length; i++) {								//repeats over the array starting from second integer (index 1)*/
			if (nums[i] > largestnum) {				 						//checks if current element is larger than the value of largest
				largestnum = nums[i];										//updates the value of variable largest
			}
		}
		return largestnum;							 						//returns the largest num in the array
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner (System.in);
		int[] numbers = new int[10];										//starts an array numbers to hold 10 ints

		System.out.println("Enter 10 integers: ");
		for (int i = 0; i < 10; i++) {										//stores int into array
			numbers[i] = ip.nextInt();
		}

		int largest = findLargest(numbers);									//calls the findlargest method
		System.out.println("The largest number is " + largest);
	}
}