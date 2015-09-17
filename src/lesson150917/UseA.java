package lesson150917;

public class UseA {
	public static void main(String[] args) {
		A.staticMethod();
		A a = new A();
		A.staticMethod(a);//for mass work with class instances
//		a.x = 10;
//		A.globalCount = 0;
		A a2 = new A(90);
		A.printCount();
	}
}
