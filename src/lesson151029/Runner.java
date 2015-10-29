package lesson151029;

import java.util.concurrent.CountDownLatch;

public class Runner implements Runnable{

		private final CountDownLatch latch;
		public Runner(CountDownLatch latch){
			this.latch = latch;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("awaiting for latch");
			try {
				latch.await();
				System.out.println("");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

}
