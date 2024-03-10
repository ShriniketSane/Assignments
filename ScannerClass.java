package assignments;
import java.util.Scanner;

public class ScannerClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter value 1");
		int number1= s1.nextInt();
		System.out.println("Please enter value 2");
		int number2= s1.nextInt();
		int sum = number1+number2;
		System.out.println(sum);
	}

}
