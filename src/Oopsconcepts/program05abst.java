package Oopsconcepts;
abstract class Employee
{
	private String name;
	private int EmpId;
	Employee(String name,int EmpId)
	{
		this.name=name;
		this.EmpId=EmpId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	abstract double calculatesalary();
	abstract void displayinfo();
}
class manager extends Employee
{
	private double salry;
	private double bonus;
	manager(String name,int EmpId,double salary,double bonus)
	{
		super(name,EmpId);
		this.salry=salary;
		this.bonus=bonus;
	}
	double calculatesalary()
	{
		return salry + bonus;
	}
	void displayinfo()
	{
		System.out.println("employeename:"+ getName());
		System.out.println("employeeId:"+getEmpId());
		System.out.println("employee total salary:"+calculatesalary());
	}
}
class programer extends Employee
{
	private int salary;
	private int bonus;
	programer(String name,int EmpId,int salry,int bonus)
	{
		super(name,EmpId);
		this.salary=salry;
		this.bonus=bonus;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
  double calculatesalary()
  {
	  return salary + bonus;
  }
  void displayinfo()
  {
	  System.out.println("programmer name:"+getName());
	  System.out.println("employe Id:"+ getEmpId());
	  System.out.println("total salary:"+ calculatesalary());
  }
}
public class program05abst {

	public static void main(String[] args) {
		manager m=new manager("pramitha", 100, 50000, 10000);
		m.displayinfo();
       //programmer
		programer p=new programer("varsha", 101, 60000, 10000);
		//System.out.println(p.calculatesalary());
		p.displayinfo();
	}

}
