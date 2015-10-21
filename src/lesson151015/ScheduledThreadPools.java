package lesson151015;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPools {

	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
	service.scheduleAtFixedRate(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("asdf");
		}
	}, 0, 1, TimeUnit.SECONDS);
	
	service.schedule(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("!!!!!!!!!");
		}
	}, 10, TimeUnit.SECONDS);
	}
	
}
