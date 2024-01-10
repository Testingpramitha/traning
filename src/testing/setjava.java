package testing;

import java.util.HashSet;

public class setjava {
public static void main(String[] args) {
	HashSet<Integer> s=new HashSet<Integer>();
	System.out.println(s);
	//Adding element to the set
	s.add(1);
	s.add(12);
	s.add(45);
	s.add(19);
	s.add(19);
	System.out.println(s);
	//remove the data from the set
	System.out.println(s.remove(10));
	System.out.println(s);
	//verification of data
	System.out.println(s.contains(90));
	
	
}
}
