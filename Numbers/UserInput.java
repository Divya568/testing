import java.util.Scanner;
class UserInput
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);

		System.out.print("Enter sentence:");
		String sentence=input.nextLine();
		System.out.println("Entered sentence is:"+sentence);

		System.out.print("Enter integer: ");
		int integerNum=input.nextInt();
		System.out.println("Entered integer is: "+integerNum);

		System.out.print("Enter double:");
		double doubleNum=input.nextDouble();
		System.out.println("Entered double is:" +doubleNum);

		System.out.print("Enter name:");
		String name=input.next();
		System.out.println("Entered name is:"+name);

		System.out.print("Enter sentence:");
		sentence=input.nextLine();
		System.out.println("Entered sentence is:"+sentence);
	}
}