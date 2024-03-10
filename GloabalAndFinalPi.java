package assignments;

public class GloabalAndFinalPi {
	
	final static double pi = 3.14;
	
	static void AreaOfCircle(int r)
	{
		double Area = pi*r*r;
		System.out.println(Area);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfCircle(10);

	}

}
