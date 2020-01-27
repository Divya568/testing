import java.util.Scanner;
class Perfect
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Eneter number: ");
		int num=input.nextInt();
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
				System.out.print(num+" is a perfect number");
			}
			else
			{
				System.out.print(num+" is not a perfect ");
			}
	}
}