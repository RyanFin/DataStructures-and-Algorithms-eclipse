package main;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	
	// Constructor
	public Person(String first, String last, int a) {
		this.firstName = first;
		this.lastName = last;
		this.age = a;
	}
	
	public void displayPerson() {
		System.out.print("   Last Name: " + this.lastName);
		System.out.print(", First Name: " + this.firstName);
		System.out.println(", Age: " + this.age);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
