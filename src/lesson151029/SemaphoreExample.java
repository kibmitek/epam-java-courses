package lesson151029;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

import lesson151008.Utils;

public class SemaphoreExample {

	static Random random = new Random();
	
	static class Skater implements Runnable{
		private final Semaphore sem;

		public Skater(Semaphore sem) {
			// TODO Auto-generated constructor stub
			this.sem = sem;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("starts");
			Utils.pause(random.nextInt(5000) + 5000);
			System.out.println("finished");
			sem.release();
		}}
	
	public static void main(String[] args) {
		
		Semaphore sem = new Semaphore(5); // if 1 => equals lock //if 0 => wait and notify // if -n => countdownlatch// if 0 and at the end of thread work (release another semaphore) call aquire. 
		ExecutorService ex = Executors.newCachedThreadPool();
		
		while(true){
			sem.acquireUninterruptibly();
			ex.execute(new Skater(sem));
		}
		
	}
	
}
