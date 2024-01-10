package testing;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MAPP {
public static void main(String[] args) {
	//creation of a map
	Map<Integer, String> m=new Hashtable<Integer, String>();
	//addition of elements into the map
	m.put(403004, "Goa");
	m.put(799005, "Tripura");
	m.put(688001, "kerala");
	System.out.println(m);
	//3)Retrieval of keys from the map:
    Set<Integer> keys=m.keySet();
    for (Integer key : keys) {
		System.out.println(key);
	}
  //3)Retrieval of values from the map:
    Collection<String> values=m.values();
    for (String value : values) {
    	System.out.println(value);
		
	}
    System.out.println();
    //Retrieval of value from the map based on a key:
   String s= m.get(688001);
	//System.out.println(s);
	for (Integer key : keys) {
		System.out.println(key+ "------->"+ m.get(key));
		
	}
	System.out.println();
	//Deletion of element from the map:
	//m.remove(403004);
	System.out.println(m);
	//7)Verification of keys in the map:
	System.out.println(m.containsKey(799005));
	//verification of value from the map:
	System.out.println(m.containsValue("hyderabad"));
	//9)Updation of elements:
	System.out.println(m);
	m.put(403004, "hyderabad");
	System.out.println(m);
}
}
