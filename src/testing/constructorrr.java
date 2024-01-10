package testing;
class shoes
{
	String brand;
	int prize;
	int size;
	public shoes(String b,int p,int s) {
		// TODO Auto-generated constructor stub
		this.brand=b;
		this.prize=p;
		this.size=s;
		System.out.println("consturctor is excuting");
		
	}
	public void display()
	{
		System.out.println(brand+" "+prize+" "+" "+ size);
	}
}
public class constructorrr {
	public static void main(String[] args) {
		shoes s=new shoes("puma",100000,25);
		s.display();
	}

}
