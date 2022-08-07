package basics;

public class Strings {
	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle="The Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word Ring");
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("THe browser is chrome");
		}
		
		
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "200983";
		
		System.out.println("There are "+ SSN.length() + " digits in your SSN.");
		
		System.out.println(firstName.substring(0,1));
		System.out.println(lastName.substring(0,1));
		System.out.println(SSN.substring(5));
		
	}
}
