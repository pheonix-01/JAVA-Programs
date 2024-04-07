import java.util.*;
class Division
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int nr,dr;
		System.out.println("Enter numerator and denominator");
		nr=sc.nextInt();
		dr=sc.nextInt();
		double res=0.0;
		try
		{
			res=nr/dr;
		}
		catch(Exception e)
		{
			System.out.println("Cannot divide by zero");
			while(dr==0)
			{
				System.out.println("Enter denominator again");
				dr=sc.nextInt();
				
			}
			res=nr/dr;
		}
		finally
		{
			System.out.println("Result= " + res);
		}
	}
}
