package lesson150924;

public class UseList {
	public static void main(String[] args) {
		MyList<String> list = new MyList<>();
		
		list.addLast("One");
		list.addLast("Two");
		list.addLast("Three");
		
		System.out.println(list);
	}
}
