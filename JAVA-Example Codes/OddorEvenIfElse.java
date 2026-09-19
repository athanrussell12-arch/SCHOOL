import java.util.Scanner;

public class OddorEvenIfElse{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.print ("Enter Number: ");
		int number = ip.nextInt();

		if (number == 0) {
			System.out.println("Number is Zero");
		}

		else if (number % 2 == 2); {
			System.out.println("Number is Even");
		}

		else {
			System.out.println("Number is Odd");
		}

	}
}