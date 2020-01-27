import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=input.nextInt();

		int rev=0,temp=num;
		while(temp!=0)
		{
			rev=rev*10+temp%10;
			//temp=temp/10;
			temp/=10;
		}
		System.out.println("Reverse of number is: "+rev);
		
		if(num==rev)
		{
			System.out.print(num+" is a Palindrome");
		}
		else
		{
			System.out.print(num+" is not a Palindrome");
		}
	}

}