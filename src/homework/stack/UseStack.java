package homework.stack;

public class UseStack {

	public static void main(String[] args) {
		MyStack <Integer> st = new MyStack<>(10);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
	
		System.out.println(st);
		System.out.println(st.peek().data);
		
		System.out.println(st.pop().data);
		
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		
		System.out.println(st);
		
//		st.push(11); //throws StackOverflowError
	}
	
}
