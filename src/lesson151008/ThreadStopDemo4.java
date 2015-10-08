package lesson151008;

public class ThreadStopDemo4 {

	static class Task implements Runnable{

		@Override
		public void run() {
			long i = 0;
			while(!Thread.interrupted()){//checks all the time - slowly. see bench result
				i++;
			}
			System.out.println(i);
			
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		Task task = new Task();
		Thread thread = new Thread(task);
		thread.start();
		Utils.pause(5000);
		thread.interrupt();
		System.out.println("finish");
	}
	
}
