public class MainEmployee
{
	public static void main (String[] args)
	{

		Employee employee1 = new Employee ("Susan Myers", 47899, "Accounting", "Vice President");
		Employee employee2 = new Employee ("Mark Jones", 39119, "IT", "Programmer");
		Employee employee3 = new Employee ("Joy Rogers", 81774, "Manufacturing", "Engineer");

		employee1.print();
		employee2.print();
		employee3.print();

		}
	}
