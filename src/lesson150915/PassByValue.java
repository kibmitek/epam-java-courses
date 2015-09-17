package lesson150915;

public class PassByValue {
	public static void main(String[] args) {
		int x = 10;
		change(x);
		System.out.println(x);
	}

	static void change(final int x) {
//		x = 20;
		
	}
}
