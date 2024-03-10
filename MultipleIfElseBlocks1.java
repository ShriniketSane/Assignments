package assignments;

public class MultipleIfElseBlocks1 {

		static void Numbers(int a)
		{
			if (a>0)
			{
				System.out.println("This is positive number");
			}
			else
			{
				if(a==0)
				{
					System.out.println("This is zero");
				}
				
				if(a<0)
				{
					System.out.println("This is negative number");
				}
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers(5);
		Numbers(-8);
		Numbers(0);
	}

}
