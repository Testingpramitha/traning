package testing;
 abstract class MyTest
{
	abstract void calculate(int a,int b);
}
 class Addition extends MyTest
 {
   void calculate(int a, int b)
   {
   int x=a+b;
   System.out.println("sum:" +x);
 }
 }
 class subtraction extends MyTest
 {
	 void calculate(int a, int b)
	 {
		 int y=a-b;
		 System.out.println("sub:"+y);
	 }
 }
 class multiplication extends MyTest
 {
	 void calculate(int a,int b)
	 {
		 int z=a*b;
		 System.out.println("mul:"+z);
	 }
 }

public class myclassabstraction01 {
	public static void main(String[] args) {
		Addition a=new Addition();
		subtraction s=new subtraction();
		multiplication m=new multiplication();
		a.calculate(200, 300);
		s.calculate(10, 9);
		m.calculate(2, 6);
	}

}
