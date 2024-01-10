package Oopsconcepts;
abstract class Shape3D
{
	abstract double calculateVolume();
	abstract double calculateSurfaceArea();
}
class Sphere extends Shape3D
{
	//V=4/3*pi*r3
	int r;
	Sphere(int r)
	{
		this.r=r;
	}
	double calculateVolume()
	{
		return (4/3)*3.14*r*r*r;
	}
	double calculateSurfaceArea()
	{
		return 4*3.14*r*r;
	}
}
class Cube extends Shape3D
{
	int a;
	Cube(int a)
	{
		this.a=a;
	}
	//v=a3
	double calculateVolume()
	{
		return a*a*a;
	}
	double calculateSurfaceArea()
	{
		//6a2
		
		return 6*a*a;
	}
}
public class test01 {
	public static void main(String[] args) {
		//sphere
		Sphere s=new Sphere(2);
		System.out.println("surface of the sphere:"+s.calculateSurfaceArea());
		System.out.println("volume of the sphere:"+s.calculateVolume());
		
		//Cube 
		Cube c=new Cube(6);
		System.out.println("volume of the cube:"+c.calculateVolume());
		System.out.println("surface of the cube:"+c.calculateSurfaceArea());
		
		
	}
	

}
