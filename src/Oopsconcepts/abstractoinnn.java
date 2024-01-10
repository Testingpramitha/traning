package Oopsconcepts;
//(Abstraction: An abstraction is a class which can contain the abstract methods and is defined with the keyword abstract. 
//we can put the abstract methods in abstract class abstract method means it is unimplemented method
//when we can not implement full interface then we will go for abstraction
//common implementation ,we can't create instance of abstraction class 
//abstract method: the method which is not having implementation only having declaration child class has the responsible to implementation
//abstract modifier we can applicable for method,class
//abstract means not clear /not complete /partially completed.
//Abstract method: when we do not know the implementation then we declare the abstract method
//it ends with semicolon not curly braces.it can not have body
//if a class contain atleast one abstract method class should be declare as abstract)
//Abstract class: if the implementation is not complete then we declare abstract class we can not create the object for class
//it may contain abstract methods or it may contain methods implemented but not completely implemented
// abstract class can contain any method with zero abstraction methods also.
//use of declaring methods in parent class :child class every time must be provide implementation 2)polymorphism
abstract class vehicle
{
	public abstract int getwheels();
}
class bus extends vehicle
{
	public int getwheels()
	{
		return 6;
	}
}
class Auto extends vehicle
{
	public int getwheels()
	{
		return 3;
	}
}

 abstract class abstractoinnn {
	public static void main(String[] args) {
		bus s=new bus();
	System.out.println(s.getwheels());
	Auto a=new Auto();
int	n=a.getwheels();
System.out.println(n);
		
	}
 
}
