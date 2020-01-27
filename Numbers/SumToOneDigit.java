import java.util.Scanner;
class SumToOneDigit
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		double num=input.nextDouble();

		while(num>9)
		{
			int sum=0;
			while(num!=0)
			{
				sum+=num%10;
				num/=10;
			}
			num=sum;
			System.out.println("Sum of digits: "+num);
		}
	}
}