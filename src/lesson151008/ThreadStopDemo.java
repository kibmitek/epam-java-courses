package lesson151008;

public class ThreadStopDemo {

	static class Task implements Runnable{

	
		volatile private boolean stopped;//change cpu cache L1 value - faster than interrupted checking.see bench results.
		@Override
		public void run() {
			long i = 0;
			while(!stopped){//checks all the time
				i++;
				
				if(i % 10000 == 0){
					Thread.yield();//oblolete method to release cpu by this thread and to stand to calculation queue
				}
				
			}
			System.out.println(i);
			
		}
		
		public void stop(){stopped = true;}
		
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		Task task = new Task();
		new Thread(task).start();
		Utils.pause(5000);
		task.stop();
		System.out.println("finish");
	}
	
}
