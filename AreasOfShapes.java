package assignments;

public class AreasOfShapes {
	
	static void AreaOfCircle(int radius)
	{
		double area = 3.14*radius*radius;
		System.out.println("Area of circle="+area);
		
	}	
	static void AreaOfTriangle(int base, int height)
	{
		double area = 0.5*base*height;
		System.out.println("Area of triangle="+area);
		
	} 
	
	static void AreaOfSquare(int side)
	{
		double area = side*side;
		System.out.println("Area of square="+area);
		
	} 
	
	static void AreaOfRectangle(int base, int height)
	{
		double area = base*height;
		System.out.println("Area of rectangle="+area);
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfCircle(10);
		AreaOfTriangle(10,20);
		AreaOfSquare(12);
		AreaOfRectangle(14,9);
	}

}
