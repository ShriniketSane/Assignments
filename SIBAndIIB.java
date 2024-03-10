package assignments;

public class SIBAndIIB {
	
	SIBAndIIB()
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
		new SIBAndIIB();
		new SIBAndIIB();
		

	}

}
