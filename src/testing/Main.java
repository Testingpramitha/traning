package testing;

class laptop
{
	private String lapname;
	private int price;
	
		
	
	public String getLapname() {
		return lapname;
	}
	public void setLapname(String lapname) {
		this.lapname = lapname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
class fridge extends laptop
{
	private String fridgname;
	private int price;
	
	public String getFridgname() {
		return fridgname;
	}
	public void setFridgname(String fridgname) {
		this.fridgname = fridgname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
public class Main {
	public static void main(String[] args) {
		laptop l=new laptop();
		l.setLapname("hp");
		l.setPrice(50000);
		System.out.println("laptop name:"+l.getLapname());
		System.out.println("laptop price:"+l.getPrice());
		fridge f=new fridge();
		f.setFridgname("L.G");
		f.setPrice(5000000);
		System.out.println("fridge name:"+f.getFridgname());
		System.out.println("fridge price:"+f.getPrice());
		
		
	}

}
