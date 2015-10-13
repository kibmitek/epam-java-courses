package lesson151013;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<T> {

	private final Queue<T> queue = new LinkedList<>();
	
	
	public T take(){
		synchronized (queue) {
			while (queue.isEmpty()){
				try {
					queue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return queue.poll();
		}
	}

	public void put(T item){
		synchronized (queue) {
			queue.offer(item);
			queue.notify();
		}
	}

	public int size() {
		// TODO Auto-generated method stub
		return queue.size();
	}
}
