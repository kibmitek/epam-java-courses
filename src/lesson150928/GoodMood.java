/**
 * 
 */
package lesson150928;

import lesson150928.Dog.BadMood;
import lesson150928.Dog.BrainState;

class GoodMood implements BrainState{
	public static final int MAX_STROKES = 3;
	int count;
	@Override
	public void feed(Dog dog) {
		dog.eat();
		dog.wag();			
	}
	@Override
	public void stroke(Dog dog) {
		dog.wag();
		dog.bark();			
		count++;
		if(count>= MAX_STROKES){
			dog.brainState = dog.new BadMood();
		}
	}
}
