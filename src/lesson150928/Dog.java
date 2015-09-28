package lesson150928;

public class Dog {
	interface BrainState {
		void feed();
		void stroke();
	}

	class GoodMood implements BrainState{
		public static final int MAX_STROKES = 3;
		int count;
		@Override
		public void feed() {
			Dog.this.eat();
			Dog.this.wag();			
		}
		@Override
		public void stroke() {
			Dog.this.wag();Dog.this.bark();			
			count++;
			if(count>= MAX_STROKES){
				Dog.this.brainState = Dog.this.new BadMood();
			}
		}
	}
	class BadMood implements BrainState{
		@Override
		public void feed() {
			Dog.this.eat();
			Dog.this.brainState = Dog.this.new GoodMood();
		}
		@Override
		public void stroke() {
			Dog.this.bite();
		}
		
	}
	
	BrainState brainState = Dog.this.new BadMood();
	
	public void feed(){
		System.out.println("--> feed");
		brainState.feed();
	}
	public void stroke(){
		System.out.println("--> stroke");
		brainState.stroke();
	}
//
	private void bite() {
		System.out.println("bites");
	}
	private void eat() {
		System.out.println("eating");
	}
	private void bark() {
		System.out.println("barks");
	}
	private void wag() {
		System.out.println("wags");
	}
}
