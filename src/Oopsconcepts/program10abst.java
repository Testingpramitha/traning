package Oopsconcepts;
//Write a Java program to create an abstract class Shape2D with 
//abstract methods draw() and resize(). Create subclasses Rectangle 
//and Circle that extend the Shape2D class and implement the respective methods to draw and resize each shape
abstract class Shape2D
{
	abstract void draw();
	abstract void resize();
}
class Rectangle extends Shape2D
{
	private double length;
	private double width;
	private int relength;
	private int rewidth;
	Rectangle(double length,double width,int relength,int rewidth)
	{
		this.length=length;
		this.width=width;
		this.relength=relength;
		this.rewidth=rewidth;
	}
	 
	void draw()
	{
		System.out.println("measurments to draw the rectangle  "+"length="+length+" width="+width);
	}
	void resize()
	{		
		System.out.println("Resizing the rectangle with measurments of:" + "length="+relength+"  width="+rewidth);
	}
}
class Circlee extends Shape2D
{
	private double radius;
	private double reradius;
	Circlee(double radius,double reradius)
	{
		this.radius=radius;
		this.reradius=reradius;
	}
	void draw()
	{
		System.out.println("Measurments to draw the circle raiuds="+ radius);
	}
	void resize()
	{
		System.out.println("Resizing the circle with taking  another radius="+reradius);
	}
}
public class program10abst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Rectangle r=new Rectangle(2.1, 4.0, 5, 6);
       r.draw();
       r.resize();
       //Circle
       Circlee c=new Circlee(2,4.0);
       c.draw();
       c.resize();
	}

}
