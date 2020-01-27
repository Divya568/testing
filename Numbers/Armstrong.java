import java.util.Scanner;
import java.lang.Math;
class Armstrong
{
	public static void main(String args[])
	{
	 	Scanner input=new Scanner(System.in);
	 	System.out.print("Enter a number: ");
	 	int num=input.nextInt();

	 	int temp=num,digits=0;
	 	while(temp>0)
	 	{
	 		temp=temp/10;
	 		digits++;
	 	}
	 	System.out.println("Number of digits: "+digits);
	 	
	 	temp=num;
	 	double arm=0;
	 	while(temp!=0)
	 	{
	 		int rem=temp%10;
	 		arm +=Math.pow(rem,digits);
	 		temp/=10;
	 	}
	 	System.out.println("result: "+arm);

	 	if(arm==num)
	 	{
	 		System.out.print(num+" is a Armstrong");
	 	}
	 	else
	 	{
	 		System.out.print(num+" is not a Armstrong");
	 	}
	}
}