package assignments;

public class ThreeFive {
	
	static void Numbers()
	{
		for(int i=1;i<=500;i++)
		{
			if(i%3==0 )
			{
				if(i%5==0)
				{
					System.out.println("For i= "+ i +" Computer and Mouse");
				}
				else
				{
					System.out.println("For i= "+ i +" Computer");
				}
				
			}
			else
			{
					if(i%5==0)
					{
						System.out.println("For i= "+ i +" Mouse");
					}
					else
					{
						System.out.println(i);
					}
			}
				
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers();

	}

}
