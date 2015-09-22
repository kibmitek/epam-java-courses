package lesson150922.inheritance.vs.composition;

public class UseAB {

	public static void main(String[] args) {
		B b = new B();
		b.change();
		System.out.println(b.state);
		
//		Changable ch = new C();
//		ch.change();//NPE, no real changer
		
		C c = new C();
		c.setChanger(new D(50));
		c.change();
		c.change();
		c.setChanger(new E(300));
		c.change();
		
	}
	
}
