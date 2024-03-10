package assignments;

class school
{
	static void standard1()
	{
		System.out.println("This is standard 1");
	}
	static void standard2()
	{
		System.out.println("This is standard 2");
	}
}

class teacher extends school
{
	static void subject1()
	{
		System.out.println("Subject English");
	}
	static void subject2()
	{
		System.out.println("Sbject Science");
	}
}

class student extends teacher
{
	
}

public class MultipleLevelInheritance31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
