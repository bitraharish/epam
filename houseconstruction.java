public class houseconstruction
{
	public int housecost(String sm,int a,String f)
	{
		String c="standardmaterial";
		String b="abovestandardmaterial";
		String d="highStandardmatrial";
		String hf="fullyautomated";
		String nf="notfullyautomated";
		if(b.equalsIgnoreCase(sm))
		{
			return 1500*a;
		}
		else if(c.equalsIgnoreCase(sm))
		{
			return 1200*a;
		}
		else 
		{
			if(hf.equalsIgnoreCase(f))
			{
				return 2500*a;
			}
			else
			{
				return 1800*a;
			}
		}
	}
}