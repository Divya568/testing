import java.util.Scanner;
import java.lang.Math;
class Prime
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=input.nextInt();

		int i,factors=0;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				factors++;
			}
		}
		if(factors==2)
		{
			System.out.println(num+" is Prime number");
		}
		else
		{
			System.out.println(num+" is not Prime");
		}

		factors=0;
		for(i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				factors++;
			}
		}
		if(factors==1)
		{
			System.out.println(num+" is Prime number");
		}
		else
		{
			System.out.println(num+" is not Prime");
		}


		factors=0;
		for(i=1;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				factors++;
			}
		}
		if(num!=1 && factors==1)
		{
			System.out.println(num+" is Prime number");
		}
		else
		{
			System.out.println(num+" is not Prime");
		}
	}
}