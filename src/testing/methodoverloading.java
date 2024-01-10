package testing;
class pink
{
	public void m1(int a)
	{
		System.out.println("hi");
	}
	public void m1(int d,double b)
	{
		System.out.println("good morning");
	}
	public void m1(String a,double b,int c)
	{
		System.out.println("good night");
	}
}

public class methodoverloading {
	public static void main(String[] args) {
		pink p=new pink();
		p.m1(10,0.5);
	}

}
