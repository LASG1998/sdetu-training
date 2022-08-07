package basics;

public class Weather {
	public static void main (String[] args) {
		
		int temperature=20;
		String sunCondition= "sunny";
		
		if (temperature > 80) {
			System.out.println("its pleasant, wear shorts and t-shirts");
		}
		else if ((temperature > 60) && (sunCondition == "sunny")) {
			System.out.println("Its a little cooler");
			System.out.println("wear a hat to keep the sun out your eyes");
			
		}else {
			System.out.println("looks like a cold day, bring your sweater");
		}
			
		
	}
}
