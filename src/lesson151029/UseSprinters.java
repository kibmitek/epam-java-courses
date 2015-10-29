package lesson151029;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UseSprinters {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();

		CyclicBarrier barrier = new CyclicBarrier(4, new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("winner is...");
			}
		});
		executor.execute(new Sprinter(barrier));
		executor.execute(new Sprinter(barrier));
		executor.execute(new Sprinter(barrier));
		executor.execute(new Sprinter(barrier));
		
		System.out.println("all started");
	}
	
	
	
}
