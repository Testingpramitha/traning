package testing;

class player
{
	private String pname;
	private int page;
	private String gametype;
	player(String pname,int page,String gametype)
	{
		this.pname=pname;
		this.page=page;
		this.gametype=gametype;
	}
	public String getPname() {
		return pname;
	}
	
	public int getPage() {
		return page;
	}
	
	public String getGametype() {
		return gametype;
	}
}

public class playertest {
	public static void main(String[] args) {
		player p=new player("dhoni",42,"cricket");
		System.out.println(p.getGametype());
		System.out.println(p.getPage());
		System.out.println(p.getPname());
	}

}
