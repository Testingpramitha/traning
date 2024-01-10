package testing;

 class Studentt
{
	private String studentname;
	private int studentroolnumber;
	private int studentid;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStudentroolnumber() {
		return studentroolnumber;
	}
	public void setStudentroolnumber(int studentroolnumber) {
		this.studentroolnumber = studentroolnumber;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	
}
 
public class EncapTest {
public static void main(String[] args) {
	Studentt s=new Studentt();
	s.setStudentname("vihanshi");
	s.setStudentroolnumber(1);
	s.setStudentid(12345);
	System.out.println(s.getStudentid());
	System.out.println(s.getStudentname());
	System.out.println(s.getStudentroolnumber());
	
}
}
