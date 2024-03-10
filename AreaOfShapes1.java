package assignments;

public class AreaOfShapes1 {

	static void CicumferenceOfCircle(int radius)
	{
		double circumference = 2*3.14*radius;
		System.out.println("Circumference of circle="+circumference);
		
	}
	
	static void CicumferenceOfSquare(int side)
	{
		double circumference = 4*side;
		System.out.println("Circumference of square="+circumference);
		
	}
	
	static void CicumferenceOfRectangle(int base, int height)
	{
		double circumference = 2*base+2*height;
		System.out.println("Circumference of rectangle="+circumference);
		
	}
	
	public static void main(String[] args) {

		CicumferenceOfCircle(15);
		CicumferenceOfSquare(18);
		CicumferenceOfRectangle(20,25);

	}

}
