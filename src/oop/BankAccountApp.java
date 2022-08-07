package oop;

public class BankAccountApp {
	public static void main(String[] args) {
		BankAccount acc1=new BankAccount();
		
		/*
		acc1.accountNumber="0928392";
		acc1.name= " Luis Angel ";
		acc1.balance= 1000;*/
		
		//WITH ENCANSULPATION hide variables inside class
		acc1.setName("Luis Angel");
		System.out.println(acc1.getName());
		
		acc1.setSSN("323");
		System.out.println("SSN: "+acc1.getSSN());
		
		acc1.accountNumber="0928392";
		acc1.balance= 1000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		
		
		
		
		System.out.println(acc1.toString());
		
		
		
		//POLYMORPISM THROUGH OVERRIDING
		BankAccount acc2 = new BankAccount("checking account");
		acc2.accountNumber="323232";
		
		BankAccount acc3 = new BankAccount("saving account", 50000);
		acc3.accountNumber="3232";
		
		/*
		acc3.checkBalance();
		
		//demo for inheritance
		CDAccount cd1=new CDAccount();
		cd1.interestRate ="4.5";
		cd1.balance=3000;
		cd1.name="Juan";
		cd1.accountType="CD Account";
		System.out.println(cd1.toString());
		cd1.compunt();
		*/
		
	}
}
