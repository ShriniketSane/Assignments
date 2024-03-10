package assignments;

public class LeapYear {
	
	void CheckYear()
	{
		int year = 2027;
		if (year%4==0)
		{
			System.out.println("This is leap year");
		}
		else
		{
			System.out.println("This is not leap year");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeapYear l1 = new LeapYear();
		l1.CheckYear();

	}

}
