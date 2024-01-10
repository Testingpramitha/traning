package Oopsconcepts;
class Rectangleee
{
// Declare instance variables as private in the class. 
   private int length; 
   private int breadth; 

// Declare a constructor Rectangle and define parameters of constructor. 
 Rectangleee(int breadth,int length)
 { 
	 this.length=length;
     this.breadth = breadth; 
 } 
 
 
// Create a getter method for each private variable. 

public int getBreadth()
{ 
 return breadth; 
}

public void setLength(int length) {
	this.length = length;
}


public void setBreadth(int breadth) {
	this.breadth = breadth;
}


public int getLength()
{
	return length;
}
}
public class RectangleTest{
	public static void main(String[] args) {
	Rectangleee r=new Rectangleee(30, 20);
	float lth = r.getLength(); 
	 int bth = r.getBreadth(); 
	  float Area = lth * bth; 
	  System.out.println("Area :"+Area);

	   r.setBreadth(66); 

	   int ln = r.getLength(); 
	   int br = r.getBreadth(); 
	   int newArea = ln * br; 
	  System.out.println("newArea: "+newArea);
	}
}

