package Oopsconcepts;
//Write a Java program to create an abstract class GeometricShape with abstract methods 
//area() and perimeter(). Create subclasses Triangle and Square that extend the GeometricShape 
//class and implement the respective methods to calculate the area and perimeter of each shape.
abstract class GeometriShape
{
	abstract void area();
	abstract void perimeter();
}
class Triangleee extends GeometriShape
{
	int b=2;
	int h=3;
	double a=0.5;
	double r=a*b*h;
	int a1=5;
	int a2=5;
	int a3=5;
	int a4=a1+a2+a3;
	void area()
	{
	System.out.println("area of the Triangle: " + r);	
	}
	void perimeter()
	{
		System.out.println("perimeter of the triangle: "+ a4);
	}
}
class Square extends GeometriShape
{
	void area() {
		System.out.println("area of the square: "+ 2.2);
	}
	void perimeter()
	{
		System.out.println("perimeter of the square: "+ 4*2);
	}
}
public class prog12abst {
public static void main(String[] args) {
	Triangleee q=new Triangleee();
	q.area();
	q.perimeter();
	
	//square
	Square s=new Square();
	s.area();
	s.perimeter();
}
}
