package lesson150922.inheritance.vs.composition;

public class B extends A{
	
	@Override
	public void change() {
		// TODO Auto-generated method stub
		super.change();
		state *= 2;
	}
	
	
}
