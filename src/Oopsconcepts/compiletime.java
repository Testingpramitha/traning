package Oopsconcepts;
class MathOperationss {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int h, int c) {
        return a + h + c;
    }

    public String add(String a,String g) {
        return ("pramitha"+"akhi");
    }
}

public class compiletime  {
    public static void main(String[] args) {
    	MathOperationss m=new MathOperationss();
    	System.out.println("adding two numbers: "+m.add(2, 3));
    	System.out.println("adding three numbers: "+m.add(2, 3, 100));
    	System.out.println("cancating strings:"+m.add("Hello", "world"));
    }
}
