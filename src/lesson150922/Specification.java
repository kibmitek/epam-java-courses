package lesson150922;

public class Specification {
//в классе родителе описано что должен делать потомок но не описано как   Реализация в потомке
	static abstract class Pet{
		
		abstract void wash();
		
	}
	
	static class Dog extends Pet{
		
		@Override
		void wash(){
			System.out.println("washing dog");
		}
		
	}
}
