package lesson151029;

public class CasCounter {
	//demonstrates fast working of atomics and concurrency structures
	private SimulateCompareAndSwap value;
	public int getValue(){
		return value.get();
	}
	
	public int increment(){
		int v;
		do{
			v = value.get();//5
			// someone else did something 6
		}while(v != value.compareAndSwap(v, v+1));
		return v+1;
	}
	
}
