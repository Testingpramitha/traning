package Oopsconcepts;
//Write a Java program to create an abstract class Person with abstract methods eat() 
//and exercise(). Create subclasses Athlete and LazyPerson that extend the Person class 
//and implement the respective methods to describe how each person eats and exercises.
abstract class Person
{
	private String name;
	private String foodname;
	Person(String name,String foodname)
	{
		this.name=name;
		this.foodname=foodname;
	}
	
	public String getName() {
		return name;
	}

	public String getFoodname() {
		return foodname;
	}

	abstract void eat();
	abstract void exercise();
}
class Athlete extends Person
{
	
	Athlete(String name,String foodname) {
		super(name,foodname);
		
	}

	void  eat()
	{
		System.out.println("Athlete name:"+getName());
		System.out.println("Athlete "+getName()+" is eating :"+getFoodname());
	}
	void exercise()
	{
		System.out.println(getName()+" Is doing exercise daily morning");
	}
}
class Lazyperson extends Person
{
	Lazyperson(String name,String foodname)
	{
		super(name,foodname);
	
	}
	void eat()
	{
		System.out.println(getName()+" Is a lazy girl will eat always "+getFoodname());
	}
	void exercise()
	{
		System.out.println(getName()+" will not do any exercise daily she will always wants to sleep");
	}
}
public class program08abst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Athlete a=new Athlete("Sowmya", "salads");
		a.eat();
		a.exercise();
        
		//Lazyperson
		Lazyperson l=new Lazyperson("Lavanya", "chicken");
		l.eat();
		l.exercise();
	}

}
