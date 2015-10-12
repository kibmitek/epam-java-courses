package lesson151012;

public class SyncStatic {
	
	private static long count;
	
	synchronized public static long getCount(){
		return count;
	}
	
	synchronized public static void inc(){//short syntax form
		count++;
	}
	
	public static void inc(int amount){
		synchronized (SyncStatic.class){//long syntax
			count += amount;
		}
	}
	
}
