package assignments;

public class OROperator {
	
	static void AllConditions(int a, int b)
	{
		if (a>10 || b>20)
		{
			System.out.println("This condition is true");
		}
		else
		{
			System.out.println("This condition is false");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AllConditions(11,21);   // true, true
		AllConditions(11,19);   // true, false
		AllConditions(8,21);   // false, true
		AllConditions(8,19);   // false, false

	}

}
