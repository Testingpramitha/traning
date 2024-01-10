package testing;

class arthematic
{
	private int x;
	private int y;
	
	arthematic(int x,int y)
	{
		
		this.x=x;
		this.y=y;
	}
	
	public void add()
	{
		int sum=x+y;
		
		System.out.println("sum:"+sum);
	}	
}
class operations extends arthematic
{
	private int a;
	private int b;
	
	public operations(int a,int b) 
	{
		
		super(a, b);
		this.a=a;
		this.b=b;
		//System.out.println(sub);
		
	}

	public void sub()
	{
		int sub=a-b;
		System.out.println("sub:"+sub);
	}
public void mul()
{
	int mul=a*b;
	System.out.println("mul:"+mul);
}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}



	public void setB(int b) {
		this.b = b;
	}		
}
public class assignment {
	public static void main(String[] args) {
		operations p=new operations(10,20);
	//System.out.println(p.getSub());
	//System.out.println(p.getSum());
		p.add();
		p.sub();
	    
	   
	}
}


