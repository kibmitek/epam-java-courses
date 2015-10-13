package lesson151013;


import lesson151008.Utils;

public class WorkerThreadWithBlockingQueue{

	public class TaskRunner implements Runnable {
		@Override
		public void run(){
			while(true){
				tasks.take().run();
			}
		}
	}

	private final Thread thread;
	private final BlockingQueue<Runnable> tasks = new BlockingQueue<>();//mutex

	public WorkerThreadWithBlockingQueue(){
		thread = new Thread(new TaskRunner());
		thread.start();
	}
	
	private void execute(Runnable runnable) {
		tasks.put(runnable);
	}

	public static void main(String[] args) {
		System.out.println("start");
		WorkerThreadWithBlockingQueue worker = new WorkerThreadWithBlockingQueue();
		Utils.pause(3000);
		worker.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello from " + Thread.currentThread().getName());
				
			}
		});
	}

	
}
