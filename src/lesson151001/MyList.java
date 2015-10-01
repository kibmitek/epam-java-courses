package lesson151001;

import java.util.Iterator;

public class MyList<T> implements Iterable<T>/*, Iterator<T>*/{
//linked list
	Node<T> first;
	Node<T> last;
	Node<T> current;
	
	private static class Node<T> {
		T data;
		Node<T> next;
		Node<T> prev;
	}
	
	public void addFirst(T data){
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = first;//add to the beginning of the list
		first = node;
	}
	public void addLast(T data){
		Node<T> node = new Node<T>();
		node.data = data;

//		add first node
		if(first == null){
			first = node;
		}
//		add intermediate nodes
		else{
			node.prev = last;
			last.next = node;
		}
//		link last-var to added node
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
	
	@Override
	public Iterator<T> iterator() {

		return new Iterator<T>(){
			Node<T> current = first;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return current !=null;
			}
			@Override
			public T next() {
				T data = current.data;
				current = current.next;
				return data;
			}
			@Override
			public void remove(){
				
			}
		};
		
//		current = first;
//		return this;
	}

}
