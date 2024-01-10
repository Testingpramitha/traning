package testing;
abstract class Abstractclass
{
	int n=10;
	Abstractclass()
	{
		System.out.println("Abstractclass constructor");
	}
	final void m1()
	{
		System.out.println("final method");
	}
	void m2()
	{
		System.out.println("instance method");
	}
	static void m3()
	{
		System.out.println("static mehthod");
	}
	abstract void mssg();
}

 abstract class AbsTest extends Abstractclass {
	 AbsTest()
	 {
		 System.out.println("AbsTest constructor");
	 }
	 void mssg()
	 {
		 System.out.println("hello java");
	 }
	 public static void main(String[] args) {
		AbsTest s=new AbsTest() {
		};
		s.m1();
		s.m2();
		s.m3();
		s.mssg();
		System.out.println("x="+s.n);
		
	}

}
