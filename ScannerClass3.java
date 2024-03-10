package assignments;

import java.util.Scanner;

public class ScannerClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the radius:");
		int r=s1.nextInt();
		double area=3.14*r*r;
		System.out.println(area);				
		
	}

}
