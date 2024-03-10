package assignments;

import java.util.Scanner;

public class ScannerClass1 {
	static int a;
	static int b;
	static void add()
	{
		int sum=a+b;
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter value 1");
		int a= s1.nextInt();
		System.out.println("Please enter value 2");
		int b= s1.nextInt();
		add();
		

	}

}
