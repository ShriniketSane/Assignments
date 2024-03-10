package assignments;

public class MultipleIfElseBlocks {

	static void Result(int marks)
	{
		if (marks>=35)
		{
			if (marks>=66)
			{
				System.out.println("Distinction class");
			}
			
			if (marks>=60 && marks<66)
			{
				System.out.println("First class");
			}
			
			if (marks>=45 && marks<60)
			{
				System.out.println("Second class");
			}
			
			if (marks>=35 && marks<45)
			{
				System.out.println("Pass class");
			}
		}
		else
		{
			System.out.println("Fail");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result(70);
		Result(58);
		Result(44);
		Result(32);
		

	}

}
