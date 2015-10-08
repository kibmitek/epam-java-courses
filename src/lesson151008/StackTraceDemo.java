package lesson151008;

public class StackTraceDemo {

	public static void main(String[] args) {
		a();
	}

	private static void a() {
		// TODO Auto-generated method stub
		int x = 0;
		b();
	}

	private static void b() {
		// TODO Auto-generated method stub
		int y = 10;
		c();
	}

	private static void c() {
		// TODO Auto-generated method stub
		int k = 20;
		d();
	}

	private static void d() {
		// TODO Auto-generated method stub
		int v = 30;
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);
		for(StackTraceElement el :currentThread.getStackTrace()){
			System.out.println(el.getClassName() + " " + el.getMethodName() + " : " + el.getLineNumber());
		}
	}
	
	
}
