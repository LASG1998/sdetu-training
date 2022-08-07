package oop;


public class Demo {
	public static void main(String[] args) {
		//installing project
		Person person1 = new Person();
		
		//define propeties
		person1.name="Luis";
		person1.email="test@test.com";
		person1.phone="39393939";
		
		//Abstraction (get info from that object)
		person1.walk();
		person1.sleep();
		person1.eat();
	}
}


class Person{
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name+ " is "+  " walking ");
	}
	void eat() {
		System.out.println(email);
		
	}
	void sleep() {
		System.out.println(name + " is sleeping ");
		
	}
}