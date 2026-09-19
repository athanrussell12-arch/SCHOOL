import java.util.Scanner;

public class AreaPerimeter{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		double Length, Width;

		System.out.print("Enter Length: ");
		Length=ip.nextDouble ();

		System.out.print("Enter Width: ");
		Width=ip.nextDouble ();

		double Area = (Length*Width);
		double Perimeter=2*(Length + Width);

		System.out.println("The Area is: " + Area);
		System.out.println("The Perimeter is: " + Perimeter);

	}
}
