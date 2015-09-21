package lesson150921;

public class Parrot extends Pet implements Chirikable{

	@Override
	public void chirik() {
		System.out.println("Sam Durak!");
	}
	
	private void special() {
		// TODO Auto-generated method stub
		chirik();
	}

}
