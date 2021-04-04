package one;

public class Application {
	public static void main(String[] args) {
		Person person = new Person();
		person.age = 22;
		person.name = "Jason";
		
		System.out.println("My name is " + person.name + " and I am " + person.age + " years old.");
	}
}
