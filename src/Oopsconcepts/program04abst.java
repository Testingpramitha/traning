package Oopsconcepts;

abstract class Animall
{
	abstract String eat();
	abstract String sleep();
}
class Lionn extends Animall
{
	String s="Goat";
	String s1="lions house";
	String eat()
	{
		return s;
	}
	String sleep()
	{
		return s1;
	}
}
class Tigerr extends Animall
{
	String s3="Rabbit";
	String s4="jungle";
	String eat()
	{
		return s3;
	}
	String sleep()
	{
		return s4;
	}
}
public class program04abst {

	public static void main(String[] args) {
		Tigerr t=new Tigerr();
		System.out.println("Tiger eats:"+t.eat());
		System.out.println("The tiger sleeps in:"+t.sleep());
		
		
		Lionn l=new Lionn();
		System.out.println("Lion eats:"+l.eat());
		System.out.println("Lion sleeps in:"+l.sleep());
		
	}

}
