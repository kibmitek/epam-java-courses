package lesson150924;

public class MyList<T> {
//linked list
	Node<T> first;
	Node<T> last;
	
	public void addFirst(T data){
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = first;//add to the beginning of the list
		first = node;
	}
	public void addLast(T data){
		Node<T> node = new Node<T>();
		if(first == null){
			first = node;
		}
		node.data = data;
		node.next = null;
		last = node;
	}
	
	@Override
	public String toString(){
		String s = "[";
		Node temp = first;
		while(temp != null){
			s += temp.data;
			s += ", ";
			temp = temp.next;
		}
		s = s.substring(0, s.length()-2);		
		return s + "]";
	}
	
}
