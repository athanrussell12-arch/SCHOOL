import java.util.Scanner;

public class constructor
{

		public int yearModel;
		public String make;
		public int speed;

		public constructor (int yearModel1, String make1, int speed1)
		{

			Scanner ip = new Scanner(System.in);

			yearModel = yearModel1;
			System.out.print ("Enter Year Model: ");
			yearModel1 = ip.nextInt();

			make = make1;
			System.out.print ("Enter Brand: ");
			make1 = ip.next();

			speed = speed1;
			System.out.print ("Enter Initial Speed: ");
			speed1 = ip.nextInt();

			System.out.print ("Enter 1 to Accelerate or 2 to Brake: ");
			int AccelerateBrake = ip.nextInt();

			}

		public void print()
		{
			System.out.println(yearModel);
			System.out.println(make);

			}


		public void print2()
				{

			System.out.println("Final Speed Is: " + speed);

					}


	}
