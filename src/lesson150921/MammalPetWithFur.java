package lesson150921;

abstract public class MammalPetWithFur extends Pet {
	abstract public void comb();
	
//	@Override
//	public void care() {
//		super.care();
//		comb();
//	}
	
	private void special() {
		comb();
	}
}
