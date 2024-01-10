package testing;

class Adition{
	private int n;
	private int m;
 Adition(int n,int m)
 {
	 this.n=n;
	 this.m=m;
	 
 }
public int getN() {
	return n;
}
public void setN(int n) {
	this.n = n;
}
public int getM() {
	return m;
}
public void setM(int m) {
	this.m = m;
}
 
}
class multiplicationn extends Adition{
	private int s;
	private int p;
	multiplicationn(int s,int p)
	{
		super(s, p);
		this.s=s;
		this.p=p;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	
}
class subtractionn extends multiplicationn
{
	private int u;
	private int d;
	subtractionn(int u,int d)
	{
		super(u,d);
		this.u=u;
		this.d=d;
		
	}
	public int getU() {
		return u;
	}
	public void setU(int u) {
		this.u = u;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	
}
public class assg02 {
	public static void main(String[] args) {
		//Subtraction
		subtractionn s=new subtractionn(30,10);
		int n1=s.getU()-s.getD();
	    System.out.println("before updation sub:"+n1);
	    //updating the value:
	    s.setD(100);
	    s.setU(40);
	    int n2=s.getD()-s.getU();
	    System.out.println("after updation sub:"+n2);
	    //Addition 
	    Adition a=new Adition(5, 3);
	    int n3=a.getM()+a.getN();
	    System.out.println("before updation sum:"+n3);
	    //updating the value:
	    a.setM(8);a.setN(2);
	    int n4=a.getM()+a.getN();
	    System.out.println("After updation sum:"+n4);
	    //multiplication
	    multiplicationn m=new multiplicationn(2, 3);
	    int n5=m.getS()*m.getP();
	    System.out.println("before updation multiplication:"+n5);
	    //updating the value:
	    m.setP(2); m.setS(8);
	    int n6=m.getP()*m.getS();
	    System.out.println("After updation of multiplication:"+n6);
	}

}
