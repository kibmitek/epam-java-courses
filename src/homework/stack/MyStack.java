package homework.stack;

public class MyStack<T> {
	
	int maxSize;
	int nodesCount = 0;
	Node <T> top;
	
	public MyStack(){
		maxSize = 10;
	}
	public MyStack(int maxSize){
		this.maxSize = maxSize;
	}
	
	public void push(T data)throws StackOverflowError{
		if(nodesCount == maxSize){
			throw new StackOverflowError();
		}
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = top;
		top = node;
		nodesCount++;
	}
	
	public Node<T> peek(){
		return this.top;
	}

	public Node<T> pop(){
		Node<T> tmp = top;
		top = tmp.next;
		nodesCount--;
		return tmp;
	}
	
	
	@Override
	public String toString(){
		String s = "[";
		Node<T> temp = top;
		while(temp != null){
			s += temp.data;
			s += ", ";
			temp = temp.next;
		}
		s = s.substring(0, s.length()-2);		
		return s + "]";
	}
	

}
