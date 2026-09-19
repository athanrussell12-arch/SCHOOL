//Returning Value

public class ReturningValue
{
	public static void main (String[] args)
	{
		System.out.println(age( 9 , 10 ));
		System.out.println(name( "Russell Athan R. Villanueva" ));
		System.out.println(gender( 'M' ));
		}

		public static int age ( int num1 , int num2 )
		{
			return num1 + num2;
			}

		public static String name ( String name1 )
		{
			return name1;
			}

		public static char gender ( char gender1 )
		{
			return gender1;
			}
	}