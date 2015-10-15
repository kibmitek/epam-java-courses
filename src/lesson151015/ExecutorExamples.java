package lesson151015;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import lesson151008.Utils;

public class ExecutorExamples {
	
	static class Task implements Callable<Double>{

		@Override
		public Double call() throws Exception {
			double d = 0;
			for (long i = 0; i < 1_000_000_000L; i++) {
				d += Math.pow(Math.PI, Math.E);
			}
			return d;
		}
		
	}

	public static void main(String[] args) {
		ExecutorService worker = Executors.newSingleThreadExecutor();
		worker.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hi there!");
			}
		});
		
		try {
			Future <Double> future = worker.submit(new Task());
			worker.shutdown();
			System.out.println("waiting for result");
			while(!future.isDone()){
				System.out.println("do something useful ");
				Utils.pause(1000);
			}
			double d = future.get();
			System.out.println(d);
		} catch (ExecutionException | InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
