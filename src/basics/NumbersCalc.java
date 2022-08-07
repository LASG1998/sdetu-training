package basics;

public class NumbersCalc {
	public static void main(String[] args) {
		System.err.println("Program starting...\n");
		printName();
		int numA =10;
		int numB=20;
		addNumbers(numA,numB);
		int product = multiplyNumbers(numA, numB);
		System.out.println("the producr of numbers"+ numA+" and "+numB+" is "+ product );
		
	}
	
	
	
	
	static void printName() {
		System.out.println("My name is Luis");
	}
	
	static void addNumbers(int numberA,int numberB) {
		int sum=numberA+numberB;
		System.out.println("the sum of numbers "+numberA+" and "+numberB + " are "+ sum);
		
		
	}
	static int multiplyNumbers(int valueA, int valueB) {
		int product=valueA*valueB;
		addNumbers(product+ 50,product);
		return product;
	}
}
