package lesson150922;

public class Extention {
//расширение - похоже на специализацию и спецификацию - добавляем но не меняем родительское поведение
	static class Dog {
		
	}
	
	static class HuntDog extends Dog {
		
		public void trackFox(){
			System.out.println("tracking fox");
		}		
		
	}
	
}
