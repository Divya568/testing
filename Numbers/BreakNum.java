import java.util.Scanner;
class BreakNum
{
	public static void  main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number:");
		int num=input.nextInt();

		int temp=num;
		while(temp>0)
		{
			System.out.print(temp%10+" ");
			temp=temp/10;
		}
		System.out.println();
		
		int digits=0;
		temp=num;
		while(temp>0)
		{
			digits++;
			temp=temp/10;	
		}
		System.out.println("Total number of digits: "+digits);

	}
}