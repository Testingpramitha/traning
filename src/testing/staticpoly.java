package testing;

public class staticpoly {
	void sum(int x,int y)
	{
		int s=x+y;
		System.out.println("sum of two numbers:"+s);
	}
	void sum(int x,int y,int z)
	{
		int s=x+y+z;
		System.out.println("sum of three numbers:"+s);
	}
	public static void main(String[] args) {
		staticpoly s=new staticpoly();
		s.sum(10, 20);
		s.sum(10, 20, 30);
	}

}
