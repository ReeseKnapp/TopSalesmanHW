package Hello.World;

public class Salesmen 
{
	private String name;
	private int salesTotal;
		
	public Salesmen(String name, int salesTotal)
	{
		this.name = name;
		this.salesTotal = salesTotal;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getSalesTotal()
	{
		return this.salesTotal;
	}

}