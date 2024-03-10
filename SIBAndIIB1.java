package assignments;

public class SIBAndIIB1 {
	
	SIBAndIIB1(int a)
	{
		System.out.println("Constructor");
	}
	static
	{
		System.out.println("Hi I am SIB");
	}
	{
		System.out.println("Hi I am IIB");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main method");
		new SIBAndIIB1(20);
		new SIBAndIIB1(25);
	}

}
