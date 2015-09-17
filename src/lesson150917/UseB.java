package lesson150917;

public class UseB {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");
		B empty;
		
		Thread.sleep(500);
		
		B b = new B();
		B b2 = new B();
		
		System.out.println(b.getClass());
		System.out.println(b);
		
	}
	
}
