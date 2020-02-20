import java.util.Scanner;
public class constructionmain
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter standard material or above Standard material or high standard :");
		String sm=s.nextLine();
		System.out.print("enter fullyAutomated or not fullyAutomated : ");
		String f=s.nextLine();
		System.out.print("enter total area: ");
		int a=s.nextInt();
		houseconstruction hc=new houseconstruction();
		System.out.println("total cost :"+hc.housecost(sm,a,f));

	}
}