package lesson150924;

public class UseList {
	public static void main(String[] args) {
		MyList<String> list = new MyList<>();
		
		list.addFirst("One");
		list.addFirst("Two");
		list.addFirst("Three");

		
		System.out.println(list);
	}
}
