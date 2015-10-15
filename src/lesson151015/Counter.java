package lesson151015;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

	private int count;
//	private Object lock = new Object();// mutex
	private final Lock lock = new ReentrantLock();// mutex
	
	public void inc(){
//		synchronized (lock) {
//			count++;
//		}
		
		lock.lock();//lock
		try{//try
			count++;//do work
		}finally{
			lock.unlock();//unlock
		}
	}
	
	public int get() {
//		synchronized (lock) {
//			return count;
//		}
		
		lock.lock();
		try{
			return count;
		}finally{
			lock.unlock();
		}
	}
}
