public class AverageVoid
{
	public static void main (String [] args)
	{
		numbers( 87, 75, 90);
		}

	public static void numbers (int num1, int num2, int num3)
	{
		int average, sum;
		sum = num1 + num2 + num3;
		average = sum/3;

		System.out.println ("The Ave of " + num1 + ", " + num2 + ", " + num3 + " is " + average);
		}

	}