package lesson151029;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UseRunner {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		CountDownLatch latch = new CountDownLatch(3);
		
		executorService.execute(new Runner(latch));
	}
}
