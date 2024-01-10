package Oopsconcepts;

abstract class Shape
{
    abstract int CalculateArea();
    abstract int Calculateperimeter();
}
class Circle extends Shape
{
    private	int r=2*2;
	private int area=142*r;
	private int peri=2*142*4;
	int CalculateArea()
	{
		
		return area;
	}
	int Calculateperimeter()
	{
		return peri;
	}
}
class Triangle extends Shape
{
	int base=10;
	int height=8;
	int AreaTriangle=base*height;
	int side1=10;
	int side2=5;
	int side3=5;
	int PerimeterTriangle=side1+side2+side3;
	int CalculateArea()
	{
		
		return AreaTriangle;
	}
	int Calculateperimeter()
	{
		return PerimeterTriangle;
	}
}
public class program02abst {
	public static void main(String[] args) {
		Circle c=new Circle();
		System.out.println("Area of the circle:"+c.CalculateArea());
		System.out.println("Perimeter of the Circle:"+c.Calculateperimeter());
		Triangle T=new Triangle();
		System.out.println("Area of the triangle:"+T.CalculateArea());
		System.out.println("Perimeter of the Triangle:"+T.Calculateperimeter());
	}

}
