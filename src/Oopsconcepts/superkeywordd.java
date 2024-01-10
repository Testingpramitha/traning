package Oopsconcepts;
//superkeyword():used to access the super class members like variables and methods.
class A
{
	int a=500;
	public void m1()
	{
		System.out.println("this is A class method");
	}
}
class B extends A
{
	int a=600;
	 void m2()
	{
		
		System.out.println("this is B class method");
		super.m1();
		System.out.println(super.a);
	}
}
public class superkeywordd {
	public static void main(String[] args) {
		B b=new B();
		b.m2();
	}

}
