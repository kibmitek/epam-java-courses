package lesson151015;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

class Runner implements Runnable{
	private final Lock lock;
	private final Condition condition;
	public Runner(Lock lock, Condition condition){
		this.lock = lock;
		this.condition = condition;
	}
	
	@Override
	public void run() {
		lock.lock();//like syncronized(lock){
		System.out.println(Thread.currentThread().getName());
		try{
			condition.awaitUninterruptibly();//wait signal(condition) // like wait();
			System.out.println(Thread.currentThread().getName() + " awaiken");
			
		}finally{
			lock.unlock();//like }
		}
	}
	
}