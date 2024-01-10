package testing;

import java.util.Arrays;
import java.util.List;

public class practice {
	public static void main(String[] args) {
		String name="my name is pramitha";
		int c=name.length();
		System.out.println(c);
		String[] count=name.split(" ");
		List<String> li= Arrays.asList(count);
		System.out.println(li.size());
		
		   
	}

}
