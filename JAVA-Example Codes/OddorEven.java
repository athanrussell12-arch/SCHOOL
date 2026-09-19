import java.util.Scanner;

public class OddorEven{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.print ("Enter Number: ");
		int number = ip.nextInt();

		String outcome = (number % 2 == 0 ? " even" : "odd");

		System.out.println(number + " is " + outcome + ", Congrats!!");

	}
}