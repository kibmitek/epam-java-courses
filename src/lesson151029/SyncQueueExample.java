package lesson151029;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;

import lesson151008.Utils;

public class SyncQueueExample {

	static Random random = new Random();
	
	static class Chef implements Runnable{

		private final SynchronousQueue<String> window;

		public Chef(SynchronousQueue<String> window){
			this.window = window;
		}
		
		@Override
		public void run() {
			
			while(true){
				// TODO Auto-generated method stub
				System.out.println("cooking...");
				Utils.pause(5000 + random.nextInt(5000));
				System.out.println("ready!");
				try {
					window.put("Tartar");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	static class Waiter implements Runnable{
		private final SynchronousQueue<String> window;
		public Waiter(SynchronousQueue<String> window){
			this.window = window;
		}

		@Override
		public void run() {
			while(true){
				// TODO Auto-generated method stub
				System.err.println("Waiting");
				try {
					String dish = window.take();
					System.err.println("Take " + dish);
					Utils.pause(5000 + random.nextInt(5000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}}
	
	public static void main(String[] args) {
		ExecutorService ex = Executors.newCachedThreadPool();
		SynchronousQueue<String> window = new SynchronousQueue<>();
		
		Chef chef = new Chef(window);
		Waiter waiter = new Waiter(window);
		
		ex.execute(chef);
		ex.execute(waiter);
	}
	
}
