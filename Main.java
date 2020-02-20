import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter principal balance: ");
		float balance=s.nextFloat();
		System.out.print("enter rate of interest: ");
		float rate=s.nextFloat();
		System.out.print("enter time in years: ");
		float year=s.nextFloat();
		System.out.print("enter number of times interest applied per time period: ");
		int n=s.nextInt();
		simple_compound_interest_cal obj=new simple_compound_interest_cal();
		System.out.println("simple interest : "+obj.Simple_interest(balance,rate,year));
		System.out.println("compound interest : "+obj.Compound_interest(balance,rate,year,n));
	}
}


