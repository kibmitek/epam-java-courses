package lesson151001;

import java.util.Iterator;

public class UseMyList {

	public static void main(String[] args) {
		MyList<String> list = new MyList<String>(){{
			addFirst("one");
			addFirst("two");
			addFirst("three");
		}};
		
		
//		System.out.println(list);
		
		for (String item : list) {
			System.out.println(item);
		}
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String item = it.next();
			System.out.println(item);
		}
		
	}
	
}
