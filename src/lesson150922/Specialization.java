package lesson150922;

public class Specialization {
 //child class is subtype of parent class
	static class Pet{
		
		public void feed(){
			System.out.println("feeding pet");
		}
		
	}	
	
	static class Cat extends Pet{
		
		@Override
		public void feed(){
			super.feed();
			murr();
		}
		
		public void combBehindEar(){
			murr();
		}

		private void murr() {
			System.out.println("murr");
		}
		
	}
	
}
