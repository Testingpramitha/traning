package testing;

class charani1 {
 private String empname;
 private int empID;
 private int empsal; 
 charani1(String empname,int empID,int empsal)
 {
	 this.empname=empname;
	 this.empID=empID;
	 this.empsal=empsal;
 }
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
public int getEmpsal() {
	return empsal;
}
public void setEmpsal(int empsal) {
	this.empsal = empsal;
}
 
}
class emp extends charani1
{
	emp()
	{
	super("pramitha",10,30000);
	}
	
	
}
public class charani 
{
	public static void main(String[] args) {
		emp e=new emp();
		System.out.println(e.getEmpID());
		System.out.println(e.getEmpsal());
		System.out.println(e.getEmpname());
		
	}

}
