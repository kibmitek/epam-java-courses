package lesson150921;

public class Raven extends Pet implements Chirikable{

	@Override
	public void chirik() {
		System.out.println("Karrr!!!");
	}

	private void special() {
		// TODO Auto-generated method stub
		chirik();
	}
}
