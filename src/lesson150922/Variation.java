package lesson150922;

public class Variation {
//мышка и тачпад - результат одинаковый
	
	static class HuntDog{
		public void trackFox(){
			
		}
		
	}
	
	static class HuntDucksDog extends HuntDog{
		public void trackDuck(){
			//something - say dog that duck is a fox
			trackFox();
		}
	}
	
}
