import java.util.Scanner;
class PalindromeNumbers
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter limit: ");
		int limit=input.nextInt();

		for( int num=1;num<=limit;num++)
		{
			int rev=0,temp=num;
			while(temp!=0)
			{
				rev=rev*10+temp%10;
				temp=temp/10;
			}
			
			if(num==rev)
			{
				System.out.print(num+ " ");
			}
		}
	}

}