package Hello.World;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) 
	{
		ArrayList<Salesmen> list = new ArrayList<Salesmen>();
		Salesmen s1 = new Salesmen("Abraham" , 15);
		Salesmen s2 = new Salesmen("Reese" , 43);
		Salesmen s3 = new Salesmen("Luke" , 25);
		Salesmen s4 = new Salesmen("Norman" , 32);
		Salesmen s5 = new Salesmen("Zeke" , 12);
		Salesmen s6 = new Salesmen("Mikey" , 8);
		Salesmen s7 = new Salesmen("Guss" , 22);
		Salesmen s8 = new Salesmen("Blade" , 90);
		
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8); 
		
		
		orderSalesmen(list);
		displayList(list);
		
		
		
	}
	
	
	
	
	public static void orderSalesmen(ArrayList<Salesmen> list)
	{
		int n = list.size();
		Salesmen temp = new Salesmen("empty" , -1);
		for(int i = 0; i < n - 1; i++)
		{
			for(int j = 0; j < n - i- 1; j++)
			{
				if(list.get(j).getSalesTotal() < list.get(j + 1).getSalesTotal())
				{
					
					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
					
				}
			}
		}
		
			
	}
	
	
	public static void displayList(ArrayList<Salesmen> input)
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.println(input.get(i).getName() + " : " + input.get(i).getSalesTotal());
		}
	}

}
