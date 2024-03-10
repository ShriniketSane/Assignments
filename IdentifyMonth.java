package assignments;

public class IdentifyMonth {
	
	static void Month(int day)
	{
		if(day>=1 && day<=31)
		{
			System.out.println("This day is in January");
		}
		if(day>=32 && day<=59)
		{
			System.out.println("This day is in February");
		}
		if(day>=60 && day<=90)
		{
			System.out.println("This day is in March");
		}
		if(day>=91 && day<=120)
		{
			System.out.println("This day is in April");
		}
		if(day>=121 && day<=151)
		{
			System.out.println("This day is in May");
		}
		if(day>=152 && day<=181)
		{
			System.out.println("This day is in June");
		}
		if(day>=182 && day<=212)
		{
			System.out.println("This day is in July");
		}
		if(day>=213 && day<=243)
		{
			System.out.println("This day is in August");
		}
		if(day>=244 && day<=273)
		{
			System.out.println("This day is in September");
		}
		if(day>=274 && day<=304)
		{
			System.out.println("This day is in October");
		}
		if(day>=305 && day<=334)
		{
			System.out.println("This day is in November");
		}
		if(day>=335 && day<=365)
		{
			System.out.println("This day is in December");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Month(75);
		Month(150);
		Month(225);
		Month(300);
	}

}
