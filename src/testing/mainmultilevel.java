package testing;
class g
{
	int a=10;
}
class h extends g
{
	
}
class c extends h
{
	
}
public class mainmultilevel {
 public static void main(String[] args) {
	 c c1=new c();
	 System.out.println(c1.a);
	 
}

}
