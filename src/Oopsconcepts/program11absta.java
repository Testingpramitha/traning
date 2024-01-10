package Oopsconcepts;
//Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound(). 
//Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods to 
//describe how each bird flies and makes a sound.
abstract class Bird
{
	abstract void fly();
	abstract void makesound();
}
class Eagle extends Bird
{
	void fly()
	{
		System.out.println("Eagle is flying in tha air");
	}
	void makesound()
	{
		System.out.println("eagle is making sound");
	}
}
class Hawk extends Bird
{
	void fly()
	{
		System.out.println("Hawl is flying in the air");
	}
	void makesound()
	{
		System.out.println("Hawk is making sound");
	}
}

public class program11absta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Eagle e=new Eagle();
 e.fly();
 e.makesound();
 
 //Hawk
 Hawk h=new Hawk();
 h.fly();
 h.makesound();
		 
	}

}
