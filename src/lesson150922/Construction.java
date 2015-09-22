package lesson150922;

import java.util.ArrayDeque;
import java.util.Deque;

public class Construction {
//воспользовались кодом из двухголовой очереди и переопределили(плохо) 2 метода
	static class MyStack extends ArrayDeque{
		
		@Override
		public void push(Object o){
			addLast(o);
		}
		
		@Override
		public Object pop(){
			return removeLast();
		}
		
	}
	
	public static void main(String[] args) {
		
		Deque deque = new MyStack();
		process(deque);
	}

	private static void process(Deque deque) {
		deque.push("one");
		deque.push("two");
		deque.push("three");
		// three two one is expected for dequeue
		// actual: one two three
		System.out.println(deque.removeFirst());
	}
	
}
