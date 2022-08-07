package oop;

public class BankAccount {
	String accountNumber;
	//static belong to the class not to the object and final>>constant
	private static final String routingNumber="012323";
	
	//instance variable
	private String name;
	private String SSN;
	String accountType;
	double balance=0;
	
	//contructor definition uniqe methods
	BankAccount(){
		System.out.println("the bank account was created");
	}
	//overloading call same metho name with different arguments
	BankAccount(String accountType){
		System.out.println("new account: "+ accountType);
	}
	
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("new account: "+accountType);
		System.out.println("initial Deposit");
		String Msg=null;
		if (initDeposit<1000) {
			
			Msg = "error: minimum deposit must be at least 100";
			
		}else {
			System.out.println("thanks for your initial deposit of: $"+initDeposit);
		}
		System.out.println(Msg);
		balance=balance+initDeposit;
	}
	
	//GETTER AND SETTER
	//allow user to define name
	public void setName(String name) {
		this.name= "MR. "+name;
		
	}
	public String getName() {
		return name;
		
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	
	//interface methods
	public void setRate() {
		System.out.println("INCREASE Rate");
	}
	public void increaseRate() {
		System.out.println("DEPOSIT");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//define methods
	void deposit(double amount) {
		balance = balance+amount;
		showActivity("DEPOSIT");
		
		
	}
	void withdraw(double amount) {
		balance=balance+amount;
		showActivity("WITHDRWAR");
		
		
	}
	
	//private can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("showing recent activity");
		System.out.println("your recent transaction: \n" + activity);
		System.out.println("YOur new balance is: $"+balance);
		
	}
	
	
	
	void checkBalance() {
		System.out.println("Balance: "+balance);
	}
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name +". ACCOUNTS: "+accountNumber+ ". ROUTING: #"+routingNumber+". BALANCE: $"+balance+"]";
	}
}
