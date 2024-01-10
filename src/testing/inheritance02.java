package testing;
class Student
{
	String name;
	int age;
	String location;
	Student(String name,int age,String location)
	{
		this.name=name;
		this.age=age;
		this.location=location;
	}
	
}

class pancard extends Student
{
	int number;

	pancard(String name, int age, String location,int number) {
		super(name, age, location);
		// TODO Auto-generated constructor stub
	this.name=name;
	this.age=age;
	this.location=location;
	this.number=number;
	
}
}
public class inheritance02 {
	public static void main(String[] args) {
		pancard p=new pancard("vihanshi",4,"hyderabad",4597512);
		System.out.println(p.age);
		System.out.println(p.location);
		System.out.println(p.name);
		System.out.println(p.number);
	}

}
