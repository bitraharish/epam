import java.lang.Math;
public class simple_compound_interest_cal
{
	public static float Simple_interest(float bal,float r,float t)
	{
		float c;
		c=bal*(1+(r*t));
		return c;
	}
	public static double Compound_interest(float bal,float r,float t,int n)
	{
		double a;
		a=r/n;
		a=a+1;
		a=Math.pow(a,(n*t));
		a=a*bal;
		return a;
	}
}