package homework151006;

public class UseDeepCopyBySerialize {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		A copyA = DeepCopyBySerialize.deepCopy(a);
		System.out.println(a);
		System.out.println(copyA);
		
		B copyB = DeepCopyBySerialize.deepCopy(b);
		System.out.println(b);
		System.out.println(copyB);
	}
	
}
