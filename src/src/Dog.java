package src;

public class Dog {

	String dog;
	int age;
	
	
	Dog(String dogName, int dogAge){
		this.dog = dogName;
		this.age = dogAge;
	}
	
	public String getDogName() {
		return dog;
	}
	
	public int getDogAge() {
		return age;
	}
}
