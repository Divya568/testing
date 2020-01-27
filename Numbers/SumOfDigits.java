import java.util.Scanner;
class SumOfDigits
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=input.nextInt();

		int sum=0;
		while(num!=0)
		{
			sum+=num%10;
			num/=10;
		}
		System.out.println("Sum of digits: "+sum);
	}
}