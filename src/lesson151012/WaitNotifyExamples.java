package lesson151012;

import java.util.ArrayList;
import java.util.List;

import lesson151008.Utils;

public class WaitNotifyExamples {
	static class Runner implements Runnable{

		private final Object trigger;
		private final String name; 
		
		public Runner(Object trigger, String name){
			this.trigger = trigger;
			this.name = name;
		}
		
		@Override
		public void run() {
			System.out.println(this + ": I am ready to run");
			// TODO Auto-generated method stub
			synchronized (trigger) {
				try {
					trigger.wait();
					System.out.println(this + " awaken");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			while(true){
				Utils.pause(1000);
				System.out.println(this.name + " running");
			}
			
		}
		@Override
		public String toString(){
			return name;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("prepare runners");
		List<Runner> runners = new ArrayList<>();
		Object trigger = new Object();
		
		runners.add(new Runner(trigger, "1"));
		runners.add(new Runner(trigger, "2"));
		runners.add(new Runner(trigger, "3"));
		runners.add(new Runner(trigger, "4"));
		
		for (Runner runner : runners) {
			new Thread(runner).start();
		}

		Utils.pause(1000);
		System.out.println("ready");
		Utils.pause(1000);
		System.out.println("steady");
		Utils.pause(1000);
		System.out.println("go");
		
		synchronized (trigger) {
			trigger.notifyAll();
			System.out.println("notified");
			Utils.pause(30000);
		}
	}
}
