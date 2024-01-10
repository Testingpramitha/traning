package testing;
import java.util.*;
public class llistmethodss {
	public static void main(String[] args) {
		//Vector(c)
		//List<String> s=new ArrayList<String>();
		Vector v =new Vector();
		//1)Addition of elements into the list
		//a)add():used to add the element.
		v.add("pramitha");
		v.add("vihanshi");
		v.add(0,"akhi");
		Vector v1 =new Vector();
		v1.add("vibha");
		v1.add("vihan");
		Vector v2 =new Vector();
		v2.add("vibha");
		v2.add("vihan");
		//b)addAll();used to add collection of elements
		System.out.println(v);
		v.addAll(0,v1);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		//2)Retrieval of elements from list
		//c)get();used to retrieve the elements
		System.out.println(v.get(1));
		//3)Deletion of elements from the list
		//d)Remove():used to delete the element.
		v.remove(2);
		//e)removeAll():used to remove all the elements
		v.removeAll(v1);
		System.out.println(v);
		System.out.println(v);
		//f)Clear():used to clear all the elements from the list
		v.clear();
		System.out.println(v);
		//4)Verification of elements in the list
		//g)contains():used to checks weather a strings contains a sequence of characters.
		System.out.println(v1.contains(v2));
		System.out.println(v.contains("pramitha"));
		//h)containsall():used to checks if the list contains all the elements present in the collection.
	     boolean a=v1.containsAll(v2);
	     System.out.println(a);
	     //5)updation of elements in the list
	     //i)set():used to update the value 
	     v2.set(0, "anitha");
	     System.out.println(v2);
	     //j)indexof():used to find the index of element
	     System.out.println(v2.indexOf("anitha"));
		//Conversion of array
	    Object[] b= v2.toArray();
	    String s= Arrays.toString(b);
	    System.out.println(s);
		
		
		
	}

}
