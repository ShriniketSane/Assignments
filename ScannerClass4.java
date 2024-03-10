package assignments;

import java.util.Scanner;
 
public class ScannerClass4 {
		
	static void addition(int a, int b)
	{
		int add = a+b;
		System.out.println("Addition of two numbers is: "+add);
		
	}
	static void substraction(int a, int b)
	{
		int sub = a-b;
		System.out.println("Substraction of two numbers is: "+sub);
		
	}
	static void division(int a, int b)
	{
		int div = a/b;
		System.out.println("Division of two numbers is: "+div);
		
	}
	static void multiplication(int a, int b)
	{
		int mul = a*b;
		System.out.println("Multiplication of two numbers is: "+mul);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the first value");
		final int a = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the second value");
		final int b = s2.nextInt();
		addition(a,b);
		substraction(a,b);
		division(a,b);
		multiplication(a,b);
		

	}

}
