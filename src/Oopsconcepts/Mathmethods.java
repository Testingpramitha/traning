package Oopsconcepts;


public class Mathmethods {

	public static void main(String[] args) {
		//Basic Arithmetic 
		int sum=Math.addExact(10, 3);
		System.out.println(sum);
		
		int difference=Math.subtractExact(20, 10);
		System.out.println(difference);
		
		int product=Math.multiplyExact(2, 6);
		System.out.println(product);
		System.out.println();
		//Exponential and Logarithmic:
		double expResult = Math.exp(2);  
		System.out.println(expResult);
		double logResult = Math.log(10); 
		System.out.println(logResult);
		double powerResult = Math.pow(3, 4);  
		System.out.println(powerResult);
		System.out.println();
		//Trigonometric:
		double sineValue = Math.sin(Math.toRadians(30));  
		System.out.println(sineValue);
		double cosineValue = Math.cos(Math.toRadians(45));  
		System.out.println(cosineValue);
		double tangentValue = Math.tan(Math.toRadians(60));
		System.out.println(tangentValue);
		System.out.println();
		
		//Rounding:
		double ceilResult = Math.ceil(5.3);  // Result: 6.0
		double floorResult = Math.floor(7.8);  // Result: 7.0
		long roundResult = Math.round(9.6);  // Result: 10
		System.out.println();
		
		//Square Root and Power Functions:
		double sqrtResult = Math.sqrt(25);  
		double cbrtResult = Math.cbrt(27);  
		double hypotResult = Math.hypot(3, 4);  
		
		//MinMax and Absolute:
		
		int maxResult = Math.max(8, 12); 
		System.out.println(maxResult);
		int minResult = Math.min(15, 10);  
		System.out.println(minResult);
		int absValue = Math.abs(-7);
		System.out.println(absValue);
		
		//Random Numbers:
		double randomValue = Math.random();
		System.out.println(randomValue);
	}

}
