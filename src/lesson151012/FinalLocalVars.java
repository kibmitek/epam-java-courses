package lesson151012;

import lesson151008.Utils;

public class FinalLocalVars {

	public static void main(String[] args) {
		
		final int x = 10;//outer.x
		
		new Thread(new Runnable() {
			// int x = outer.x;
			@Override
			public void run() {
				Utils.pause(3000);
				System.out.println("x = " + x);
			}
		}).start();
		System.out.println("finished");
		
	}
	
}
