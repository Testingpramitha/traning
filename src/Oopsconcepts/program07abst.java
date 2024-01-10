package Oopsconcepts;
// Write a Java program to create an abstract class Vehicle with abstract methods startEngine() 
//and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and 
//implement the respective methods to start and stop the engines for each vehicle type.
abstract class vehicle1
{
	abstract void startEngine();
	abstract void stopEngine();
}
class Car extends vehicle1
{
	void startEngine()
	{
		System.out.println("car engine started");
	}
	void stopEngine()
	{
		System.out.println("car engine stoped");
	}
}
class Motorcycle extends vehicle1
{
	void startEngine()
	{
		System.out.println("Motorcycle engine started");
	}
	void stopEngine()
	{
		System.out.println("Motorcycle engine stopped");
	}
}

public class program07abst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car
		Car c=new Car();
		c.startEngine();
		c.stopEngine();
		
		//Motorcycle
		Motorcycle m=new Motorcycle();
		m.startEngine();
		m.stopEngine();

	}

}
