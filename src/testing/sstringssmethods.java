package testing;

public class sstringssmethods {
 public static void main(String[] args) {
	 //1)Equal():Comparing two strings
	String name="PramiTHa";
	String name1="Pramitha";
	if(name.equals(name1))
	{
		System.out.println("both are equal strings");
	}
	else
	{
		System.out.println("both are not equal strings");
	}
    //2)Equalignorance():used to compare two strings by ignoring the case 
	String name2="akhi";
	String name3="AKHi";
	if(name2.equalsIgnoreCase(name3))
	{
		System.out.println("both are equal");
	}
	else
	{
		System.out.println("both are not equal");
	}
	//3)Strats with(): used to find staring letter
	//return type is boolean
	System.out.println(name.startsWith("p"));
	//4)tolowercase():used to covert any case letter in to lowercase
	System.out.println(name.toLowerCase());
	//5)touppercase():used to convert any case letter in to uppercase
	System.out.println(name.toUpperCase());
	//6)Endswith():
	System.out.println(name.endsWith("A"));
	//7)trim(): this method is used to remove the spaces to the starting of the string and ending of the string
	String s="   pramtiha ";
	System.out.println(s.trim());
	//8)substring(): used to create string into another string by indexing
	System.out.println(name.substring(2));
	System.out.println(name.substring(2, 6));
	//9)split():used to split the words or break the words.
	String str="Hi good morning";
	String[] str1=str.split(" ");
	for (String strr : str1) {
		System.out.println(strr);
		
	}
	System.out.println();
	//10) replace():used to one charater
	String s1="harry";
	System.out.println(s1.replace("r", "iam"));
	//11)indexof():used to find the position of the character
	System.out.println(s1.indexOf("a"));
	//12)lastindexof():return last index of the string
	System.out.println(s1.lastIndexOf("y"));
	//13)replaceall:it will repalce all the entire text
	String str2="pramitha";
	System.out.println(str2.replaceAll(str2, name2));
	System.out.println(str2.length());
	
	
	
	
}
}
