package lesson151029;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import lesson151008.Utils;

public class Sprinter implements Runnable{

	static Random random = new Random();
	private final CyclicBarrier barrier;
	
	public Sprinter(CyclicBarrier barrier){
		this.barrier = barrier;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this + "started walking");
		Utils.pause(random.nextInt(5000) + 3000);
		System.out.println(this + "finished and awaits others");
		try {
			barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this + "finally free");
	}
	

}
