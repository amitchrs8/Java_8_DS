package ds;

public class DoublyLinkedListImpl {

	private DoublyLinkedListNodeDS head;
	private DoublyLinkedListNodeDS tail;
	private int length;

	// to create an Empty doublyLinkedList. Only head and tail pointer are
	// Initialized with placeholder values.
	public DoublyLinkedListImpl() {
		head = null;
		tail = null;
		length = 0;
		// head.setNext(tail);
		// head.setPrev(null);
		// tail.setPrev(head);
		// tail.setNext(null);
	}

	public static void main(String[] args) throws InterruptedException {
		// Initializing a DoublyLinkedList object
		DoublyLinkedListImpl dllimpl = new DoublyLinkedListImpl();
		System.out.println("Initialised DLL : " + dllimpl);

		// Adding new nodes at the head.
		dllimpl.insertAtBegin(32);
		dllimpl.insertAtBegin(43);
		dllimpl.insertAtBegin(84);
		dllimpl.insertAtBegin(80);
		System.out.println("After adding new nodes at the begin : ");
		System.out.println(dllimpl.printDoublyLinkedList(dllimpl));

		Thread.sleep(2000);
		// Adding new nodes at the tail.
		dllimpl.insertAtEnd(12);
		dllimpl.insertAtEnd(34);
		dllimpl.insertAtEnd(61);
		dllimpl.insertAtEnd(23);
		System.out.println("After adding new nodes at the end : ");
		System.out.println(dllimpl.printDoublyLinkedList(dllimpl));

		Thread.sleep(2000);
		dllimpl.insertAtPosition(45, 4);
		System.out.println("After adding new nodes at the given position : ");
		System.out.println(dllimpl.printDoublyLinkedList(dllimpl));

	}

	public void insertAtBegin(int data) {
		DoublyLinkedListNodeDS dllnode = new DoublyLinkedListNodeDS(data);
		if (head == null) {
			// The DLList was empty so head and tail both will point to the
			// newly added node.
			dllnode.setNext(head);
			head = dllnode;
			tail = head;
		} else {
			dllnode.setNext(head);
			head.setPrev(dllnode);
			dllnode.setPrev(null);
			head = dllnode;
		}
		length++;
	}

	public void insertAtEnd(int data) {
		DoublyLinkedListNodeDS dlNode = new DoublyLinkedListNodeDS(data);
		if (head == null) {
			dlNode.setNext(head);
			head = dlNode;
			tail = head;
		} else {
			tail.setNext(dlNode);
			dlNode.setPrev(tail);
			tail = dlNode;
		}
		length++;
	}

	// Indexing at Linked List will start from 0 so Length will be equal to last
	// position index + 1 .
	public void insertAtPosition(int data, int position) {
		System.out.println("insertAtPosition : data : " + data + " :: position : " + position);
		if (position >= (length - 1)) {
			// insert the node at the end.
			position = length;
			insertAtEnd(data);
			return;
		}
		if (position < 0) {
			// Insert the node at the beginning.
			position = 1;
			insertAtBegin(data);
			return;
		}

		DoublyLinkedListNodeDS dlNode = new DoublyLinkedListNodeDS(data);
		DoublyLinkedListNodeDS temp = head;
		for (int i = 0; i <= position; i++) {
			if (i == (position - 1)) {
				dlNode.setNext(temp.getNext());
				temp.getNext().setPrev(dlNode);
				temp.setNext(dlNode);
				dlNode.setPrev(temp);
				break;
			}
			temp = temp.getNext();

		}

	}

	public String printDoublyLinkedList(DoublyLinkedListImpl dimpl) {
		StringBuilder sb = new StringBuilder();
		sb.append("List Data : ");
		if (dimpl != null) {
			DoublyLinkedListNodeDS dlnode = dimpl.head;
			while (dlnode != null) {
				sb.append(dlnode.getData());
				sb.append(", ");
				dlnode = dlnode.getNext();
			}
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DoublyLinkedListImpl [head=");
		builder.append(head);
		builder.append(", tail=");
		builder.append(tail);
		builder.append(", length=");
		builder.append(length);
		builder.append("]");
		return builder.toString();
	}

}
