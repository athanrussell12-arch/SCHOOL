//Russell Athan R. Villanueva
//BSIT-1A

public class ThreeStatements
{
	public static void main (String[] args)
	{
		System.out.println("I am starting in main.");
		deep();
		System.out.println("Now I am back in main.");

		}
	public static void deep()
	{
		System.out.println("I am now in deep.");
		deeper();
		System.out.println("Now I am back in deep.");
		}
	public static void deeper()
	{
		System.out.println("I am now in deeper.");

		}
	}
