package ds.LinkedList;

public class DoublyLinkedListNodeDS {

	private int data;
	private DoublyLinkedListNodeDS prev;
	private DoublyLinkedListNodeDS next;

	public DoublyLinkedListNodeDS(int data, DoublyLinkedListNodeDS prev, DoublyLinkedListNodeDS next) {
		super();
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	public DoublyLinkedListNodeDS(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoublyLinkedListNodeDS getPrev() {
		return prev;
	}

	public void setPrev(DoublyLinkedListNodeDS prev) {
		this.prev = prev;
	}

	public DoublyLinkedListNodeDS getNext() {
		return next;
	}

	public void setNext(DoublyLinkedListNodeDS next) {
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DoublyLinkedListNodeDS [data=");
		builder.append(data);
//		builder.append(", prev=");
//		builder.append(prev);
//		builder.append(", next=");
//		builder.append(next);
		builder.append("]");
		return builder.toString();
	}

}
