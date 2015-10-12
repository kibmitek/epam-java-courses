package lesson151012;

import lesson151008.Utils;

public class RaceConditionExample {

	static int count = 0;
	static Object mutex = new Object();
	
	static class Counter implements Runnable{

		@Override
		public void run() {
			while(true){
				inc();
				Utils.pause(1000);
			}
			
		}

		private void inc() {
			synchronized (mutex) {// block sync = critical section
				int tmp = count;
				tmp = tmp + 1;
				count = tmp;
	//				count++;
				System.out.println(count);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		Counter counter2 = new Counter();
		Thread t1 = new Thread(counter);
		Thread t2 = new Thread(counter2);
		
		t1.start();
		t2.start();
		
	}
	
}
