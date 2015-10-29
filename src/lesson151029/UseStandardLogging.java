package lesson151029;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SocketHandler;

public class UseStandardLogging {
	
	static Logger logger = Logger.getLogger("myTest");

	
	static class Task implements Runnable{
		int count = 0;
	
		@Override
		public void run() {
			long start = System.nanoTime();
			while(count < 100_000_000){
				count++;
					if(count % 10_000 == 0){
						logger.info(String.valueOf(count));
//						System.out.println(count);
					}
				
			}
			long stop = System.nanoTime();
			
			System.out.println("Elapsed: " + (stop - start));
			
		}}
	
	
	public static void main(String[] args) {
		
//		logger.setLevel(Level.SEVERE);
		try {
			logger.addHandler(new FileHandler());
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("start");
		new Task().run();
	}
}
