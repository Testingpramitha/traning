package Oopsconcepts;

//Abstract class representing a university person
abstract class UniversityPerson {
String name;
int id;

// Constructor
public UniversityPerson(String name, int id) {
   this.name = name;
   this.id=id;
}

// Abstract method to display information about the person
abstract void display();
}

//Concrete class representing a professor
class Professor extends UniversityPerson {
String department;

// Constructor
public Professor(String name, int id, String department) {
	super(name,id);
   this.department = department;
}

// Implementation of the abstract method to display professor information
void display() {
   System.out.println("Professor - Name: " + name + ", ID: " + id + ", Department: " + department);
}
}

//Concrete class representing an administrative staff
class AdministrativeStaff extends UniversityPerson {
String role;

// Constructor
public AdministrativeStaff(String name, int id, String role) {
   super(name,id);
   this.role=role;
}

// Implementation of the abstract method to display staff information
@Override
void display() {
    System.out.println("Administrative Staff - Name: " + name + ", ID: " + id + ", Role: " + role);
}
}

//Concrete class representing a student
class Studentt extends UniversityPerson {
String major;

// Constructor
public Studentt(String name, int id, String major) {
	super(name,id);
    this.major = major;
}

// Implementation of the abstract method to display student information
void display() {
    System.out.println("Student - Name: " + name + ", ID: " + id + ", Major: " + major);
}
}
public class Abstractionnnnnn {
	public static void main(String[] args) {
	    // Creating objects of concrete classes
		Professor rr= new Professor("pramitha", 100, "software trainee");
	   rr.display();
	   AdministrativeStaff staff = new  AdministrativeStaff("varsha", 101, "software");
	   staff.display();
	   Studentt std = new Studentt("lavanaya", 102, "xxx");
	   std.display();

	    

}
}
