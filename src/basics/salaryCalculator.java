package basics;

public class salaryCalculator {
	public static void main(String[]args) {
		String career;
		System.out.println("program is starting");
		career = "Software developer";
		System.out.println("My career "+career);
		
		int hoursPerWeek = 40;
		int weekPerYear=50;
		double rate=42.50;
		
		double salary= hoursPerWeek * weekPerYear * rate;
		
		System.out.println("my salary as a "+ career+" at the rate of $"+ rate+ " per hour is: $"+ salary + " per year");
	}

}
