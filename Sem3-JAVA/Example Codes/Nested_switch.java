import java.util.*;
public class Nested_switch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int year;// 1 2 3 4
		System.out.println("Enter the year: ");
		year = sc.nextInt();
		char branch;//C = CSE, E = ECE, M = Mech		
		System.out.println("Enter the branch: ");
		branch = sc.next().charAt(0);

		switch(year)
		{
			case 1:
			System.out.println("English, Maths and Drawing");
			break;

			case 2:
			switch(branch)
			{
				case 'C':
				System.out.println("Data Structures, OOP, COD");
				break;

				case 'E':
				System.out.println("Microprocessors, Logic Switching Theory");
				break;

				case 'M':
				System.out.println("Manufacturing and Drawing");
				break;

				default : 
				System.out.println("Please use the following keywords only : for years- 1,2,3 ; for branch: C,E,M");
			}
			break;

			case 3:
			switch(branch)
			{
				case 'C':
				System.out.println("Operating Systems, RDBMS");
				break;

				case 'E':
				System.out.println("Fundamentals of Logic Design, Microelectronics");
				break;

				case 'M':
				System.out.println("Internal Combustion Engine, MEchanical Vibration");
				break;

				default :
				System.out.println("Please use the following keywords only : for years- 1,2,3 ; for branch: C,E,M");

			}
			break;

			default:
			System.out.println("Please use the following keywords only : for years- 1,2,3 ; for branch: C,E,M");

		}
	}
}