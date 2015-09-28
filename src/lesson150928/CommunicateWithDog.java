package lesson150928;

public class CommunicateWithDog {
	public static void main(String[] args) {
		Dog dog = new Dog();
		//Patterns: strategy, state
		dog.stroke();
		dog.feed();
		dog.stroke();
		dog.stroke();
		dog.stroke();
		dog.stroke();
		dog.stroke();
		dog.stroke();
	}
}
