package Oopsconcepts;

import testing.Main;

abstract class Animal
{
	public abstract String sound();
	
}
class Lion extends Animal
{
	public String sound()
	{
		String s="roar";
		return s;
	}
}
class Tiger extends Animal
{
	String s1="Growl";
	public String sound()
	{
		return s1;
	}
	
}
public class program01abst {
	public static void main(String[] args) {
		Lion l=new Lion();
		System.out.println("The lion sound like:"+l.sound());
		Tiger t=new Tiger();
		System.out.println("The Tiger sounds like:"+t.sound());
		
	}

}
