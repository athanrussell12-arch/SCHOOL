public class AddedSubtracted
{
	public static void main (String[] args)
	{

		System.out.println(getSum(1, 2));


		System.out.println(getDifference(4, 3));

		}
	public static int getSum ( int num1, int num2)
	{
		System.out.print("The sum of " + num1 + " and " + num2 + " is ");
		return num1 + num2;

		}
	public static int getDifference ( int num3, int num4)
	{
		System.out.print("The difference of " + num3 + " and " + num4 + " is ");
		return num3 - num4;

		}
	}