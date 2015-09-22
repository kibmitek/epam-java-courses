package lesson150922.inheritance.vs.composition;

public class D extends A implements Changable{
	
	public D (int initialState){
		// by default compiler calls super();
		super(initialState);
	}
	
	
	@Override
	public void change() {
		
		state /= 2;
		System.out.println("D");
	}
}
