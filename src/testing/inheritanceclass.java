package testing;

 class Baseclass {
	void features()
	{
		System.out.println("Feature A");
		System.out.println("Feature B");
	}
}
 class Derivedclass extends Baseclass
{
	void ownfeature()
	{
		System.out.println("Feature C");
	
}
}
 class inheritanceclass
 {
	public static void main(String[] args) {
		
		Derivedclass c=new Derivedclass();
		c.features();
		c.ownfeature();
	}

}
