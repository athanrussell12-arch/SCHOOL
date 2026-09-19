public class Employee
{

		public String name;
		public int IDNum;
		public String Dept;
		public String position;

		public Employee (String name1, int IDNum1, String Dept1, String position1)
		{

			name = name1;
			IDNum = IDNum1;
			Dept = Dept1;
			position = position1;

			}

		public void print()
		{
			System.out.println( name + " is a member of " + Dept + " with the position of " + position + ", and has the ID Number of " + IDNum );
			}


	}