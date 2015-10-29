package lesson151029;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class NoECS { // ECS - ExecutionCompletionService
	
	private static final int N = 100;
	static Random rand = new Random();
	
	static class Task implements Callable<Double>{

		@Override
		public Double call() throws Exception {
			double r = 0;
			for (int i = 0; i < rand.nextInt(1_000_000); i++) {
				r += Math.pow(Math.E, Math.PI);
			}
			return r;
		}
		
	}
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(Runtime
				.getRuntime().availableProcessors() / 2);
		
		ThreadPoolExecutor tpe = (ThreadPoolExecutor) executor;
		
		/**
		 * without ECS
		 */
//		List<Future<Double>> futures = new ArrayList<>();
//		
//		for (int i = 0; i < N; i++) {
//			Future<Double> f = executor.submit(new Task());
//			futures.add(f);
//		}
//		
//		for (Future<Double> future : futures) {
//			try{
//				Double r = future.get();
//				System.out.println(r);
//			}catch(InterruptedException | ExecutionException e){
//				e.printStackTrace();
//			}
//		}
		
		/**
		 * with ECS
		 */
		CompletionService<Double> ecs = new ExecutorCompletionService<>(executor);
		for (int i = 0; i < N; i++) {
			ecs.submit(new Task());
		}
		int taskCount = (int) tpe.getTaskCount();
		System.out.println(taskCount );
		
		for (int i = 0; i < taskCount; i++) {// N + 1
			try {
				double r = ecs.take().get();
				System.out.println(r);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		executor.shutdown();
	}
}
