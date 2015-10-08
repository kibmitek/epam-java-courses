package lesson151008;

import java.util.Random;

public class HomeWork {

	public static void main(String[] args) {
		double[][] matrix = generate();
		long start = System.nanoTime();
		process(matrix);
		long stop = System.nanoTime();
		System.out.println("Elapsed: " + (stop-start));
	}

	private static void process(double[][] matrix) {
		Thread[] threads = new Thread[matrix.length];
		
		// TODO Auto-generated method stub
		for (int i = 0; i < matrix.length; i++) {
			final double[] row = matrix[i];
			threads[i] = new Thread(){
				@Override
				public void run() {
					process(row);					
				};
			};
			threads[i].start();
		}
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private static void process(double[] ds) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ds.length; i++) {
			Math.pow(ds[i], ds[i]);
		}
		
	}

	private static double[][] generate() {
		Random random = new Random();
		double[][] matrix = new double[10][1_000_000];
		
		for (int i = 0; i< matrix.length;i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextDouble();
			}
		}
		System.out.println("generated");
		return matrix;
	}
	
}
