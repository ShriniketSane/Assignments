package assignments;

import java.util.Scanner;

public class ScannerClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter start value");
		int start= s1.nextInt();
		System.out.println("Please enter end value");
		int end= s1.nextInt();
		for(int i=start;i<=end;i++)
		{
			System.out.println(i);
		}

	}

}
