import java.util.Scanner;
class PerfectNumbers
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter limit: ");
		int limit=input.nextInt();

		for(int num=2;num<=limit;num++)
		{
			int sum=0;
			for(int i=1;i<=num/2;i++)
		    {
		     	if(num%i==0)
		       	{
					sum=sum+i;
				}		
			}
			if(sum==num)
			{
				System.out.println(num);
			}
		}
	}
}