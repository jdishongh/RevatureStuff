package two;

public class Main {
	public static void main(String[] args) {
		PrivatePerson person = new PrivatePerson();
		
		person.setAge(22);
		person.setName("Jason");
		
		System.out.println("My name is " + person.getName() + " and I am " + person.getAge() + " years old.");
	}
}
