package lesson151013;

import java.util.LinkedList;
import java.util.Queue;

import lesson151008.Utils;

public class WorkerThread{

	public class TaskRunner implements Runnable {
		@Override
		public void run(){
			while(true){
				Runnable task;
				synchronized (tasks) {
					while(tasks.isEmpty()){
						try {
							tasks.wait();
						} catch (InterruptedException e) {
							//ignore e.printStackTrace();
						}
					}
					task = tasks.poll();
				}
					
				if(task != null){
					task.run();
				}
			}
		}
	}

	private final Thread thread;
	private final Queue<Runnable> tasks = new LinkedList<>();//mutex

	public WorkerThread(){
		thread = new Thread(new TaskRunner());
		thread.start();
	}
	
	private void execute(Runnable runnable) {
		synchronized (tasks) {
			tasks.offer(runnable);
			tasks.notify();
		}
	}

	public static void main(String[] args) {
		System.out.println("start");
		WorkerThread worker = new WorkerThread();
		Utils.pause(3000);
		worker.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello from " + Thread.currentThread().getName());
				
			}
		});
	}

	
}
