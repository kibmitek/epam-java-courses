package lesson151005;

public class UseStack {

	public static void main(String[] args) {
		System.out.println("start");
		
		Stack<String> stack = new Stack<>(2);
		try {
			String s = stack.pop();
			System.out.println(s);
		} catch (StackUnderflowException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			stack.push("one");
			stack.push("two");
			stack.push("three");
			
		} catch (StackOverflowException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("finish");
	}
	
}
