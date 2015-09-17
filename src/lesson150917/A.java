package lesson150917;

public class A {
	private static final int NONE = -1;
	private int x;
	private static int globalCount;
	
	public A(int x){
		this.x = x;
		globalCount++;
	}
	
	public A() {
		this(NONE);//call constructor 
	}

	public static void staticMethod(){
		System.out.println("static");
//		this.x = 10; ERROR
	}
	
	public static void staticMethod(A a){
		a.x = 10;
	}

	public static void printCount() {
		System.out.println("count = " + globalCount);
		
	}
}
