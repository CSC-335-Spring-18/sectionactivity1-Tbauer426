public class SortedList<E extends Comparable<E>> {

	private int size;
	private Node front;

	private class Node {
		private E data;
		private Node next;

		public Node() {
			data = null;
			next = null;
		}

		public Node(E objectReference) {
			data = objectReference;
			next = null;
		}

		public Node(E objectReference, Node nextReference) {
			data = objectReference;
			next = nextReference;
		}
	}

	// External reference to find
	// the first element in this list

	// Number of elements in this list

	public SortedList() {
		front = null;
		size = 0;
	}

	public void insertInOrder(E element) {
		Node track=front;
		if(size==0){
			front.data=element;
		}
		if(track.data.compareTo(element)==0){
			front.data=element;
			front.next=track;	
		}
		while(track.next!=null && track.next.data.compareTo(element)==0){
			Node temp=track.next;
			track.next.data=element;
			track.next.next=temp;
		}
		size++; // unless element existed
	}

	public int size() {
		return size;
	}

	// add remove here
	public void remove(){
		
	
	}
}