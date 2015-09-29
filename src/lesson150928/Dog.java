package lesson150928;

public class Dog {
	interface BrainState {
		void feed(Dog dog);
		void stroke(Dog dog);
	}

	class BadMood implements BrainState{
		@Override
		public void feed(Dog dog) {
			Dog.this.eat();
			Dog.this.brainState = new GoodMood();
		}
		@Override
		public void stroke(Dog dog) {
			Dog.this.bite();
		}
		
	}
	
	BrainState brainState = Dog.this.new BadMood();
	
	public void feed(){
		System.out.println("--> feed");
		brainState.feed(this);
	}
	public void stroke(){
		System.out.println("--> stroke");
		brainState.stroke(this);
	}
//
	private void bite() {
		System.out.println("bites");
	}
	void eat() {
		System.out.println("eating");
	}
	void bark() {
		System.out.println("barks");
	}
	void wag() {
		System.out.println("wags");
	}
}
