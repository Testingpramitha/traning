package testing;
class bottle
{
	private String botname;
	private int price;
	bottle(String botname,int price)
	{
		
		this.botname=botname;
		this.price=price;
	}	
	
}
class water extends bottle
{
	private String colour;
	private int weight;
	water(String colour,int weight)
	{
		super(colour, weight);
		
		
		this.colour=colour;
		this.weight=weight;
		
	}
	public void m1()
	{
		System.out.println("this is child method");
		
	}
	
}
public class main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bottle b=new bottle("white", 50);
		
		
		
		

	}

}
