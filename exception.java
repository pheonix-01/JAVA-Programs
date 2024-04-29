class Except
{
	public static void main(String ...args)
	{
		try
		{
			Thread.sleep(1000);
			System.out.println("Try 1");
			Thread.sleep(2000);
			System.out.println("Try 2");
			System.out.println(args[0]);
			System.out.println("Try 3");
		}
		catch(InterruptedException m)
		{
			System.out.println("Exception found in Thread");
		}
		catch(ArrayIndexOutOfBoundsException g)
		{
			System.out.println("Exception in args");
		}
		finally
		{
			System.out.println("Inside Finally");
		}
	}
}
