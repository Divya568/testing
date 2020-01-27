import java.util.Scanner;
import java.lang.Math;
class PrimeNumbers
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter limit:");
		int limit=input.nextInt();

		for(int num=2;num<=limit;num++)
		{
			int fact=0;
			for(int i=1;i<=Math.sqrt(num);i++)
			{
				if(num%i==0)
				{
					fact++;
				}
			}
			if(fact==1)
			{
				System.out.print(num+" ");
			}
		}
	}
}