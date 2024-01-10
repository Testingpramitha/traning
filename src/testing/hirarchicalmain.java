package testing;
class car
{
	String s="Dhoni";
}
class bike extends car
{
	
}
class auto extends car
{
	
}
public class hirarchicalmain {
	public static void main(String[] args) {
		auto a=new auto();
		System.out.println(a.s);
	}

}
