package lesson150922;

public class VisibilityUpLeveling {

	public static class A{
		
		protected void method(){
			
		}
	}
	
	public static class B extends A{
		@Override
		public void method(){
			super.method();
		}
	}
	
}
