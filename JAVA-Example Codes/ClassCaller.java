//open program "MethodCaller" from the same folder to work...

public class ClassCaller
{
	public static void main(String[] args)
	{
		exampleB();
		}
	public static void exampleB()
	{
		MethodCaller.exampleA();
		}
	}