package assignments;

public class Voter {
	
	void CheckAge()
	{
		int age = 10;
		if (age>=18)
		{
			System.out.println("Person is adult");
		}
		else
		{
			System.out.println("Person is teenager");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voter v1 = new Voter();
		v1.CheckAge();

	}

}
