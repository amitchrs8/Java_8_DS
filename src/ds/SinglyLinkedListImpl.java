package ds;

public class SinglyLinkedListImpl {

	// Head node of the list
	SinglyLinkedListNodeDS head;
	int length = 0;

	public synchronized SinglyLinkedListNodeDS getFirst() {
		return head;
	}

	public synchronized void insertAtBegin(int data) {
		SinglyLinkedListNodeDS node = new SinglyLinkedListNodeDS(data);
		node.setNextNode(this.head);
		this.head = node;
		length++;
	}

	public synchronized void insertAtEnd(int data) {
		SinglyLinkedListNodeDS node = new SinglyLinkedListNodeDS(data);
		if (head == null) {
			head = node;
		} else {

			SinglyLinkedListNodeDS temp = head;
			while (temp.getNextNode() != null) {
				temp = temp.getNextNode();
			}
			temp.setNextNode(node);
		}
		length++;
	}

	public void insertAtPosition(int data, int pos) {
		if (pos <= 0) {
			insertAtBegin(data);
		}
		if (pos >= length) {
			insertAtEnd(data);
		}
		if ((head != null) && (pos > 0) && (pos < length)) {

			SinglyLinkedListNodeDS node = new SinglyLinkedListNodeDS(data);
			SinglyLinkedListNodeDS temp = head;
			for (int i = 1; i < pos; i++) {
				temp = temp.getNextNode();
			}
			node.setNextNode(temp.getNextNode());
			temp.setNextNode(node);
		}
		length++;
	}

	public void removeFromBegin() {
		SinglyLinkedListNodeDS node = head;
		if (node == null) {
			return;
		}
		head = node.getNextNode();
		node.setNextNode(null);
		length--;
	}

	public void removeFromEnd() {
		SinglyLinkedListNodeDS temp, tempPrev;

		if (head == null) {
			return;
		}
		if (head.getNextNode() == null) {
			removeFromBegin();
		} else {
			temp = head.getNextNode();
			tempPrev = head;
			while (temp.getNextNode() != null) {
				tempPrev = temp;
				temp = temp.getNextNode();
			}
			tempPrev.setNextNode(null);
		}
		length--;
	}

	public void removeFromPos(int position) {
		if (head == null) {
			return;
		}
		if (position == 0) {
			removeFromBegin();
		} else if (position >= length - 1) {
			removeFromEnd();
		} else {

			SinglyLinkedListNodeDS temp, tempPrev;
			tempPrev = head.getNextNode();
			temp = head;
			for (int i = 0; i < position; i++) {
				tempPrev = temp;
				temp = temp.getNextNode();
			}

			tempPrev.setNextNode(temp.getNextNode());
			temp.setNextNode(null);
		}
		length--;
	}

	public synchronized void removeMatched(int data){
		
	}
	
	
	public static void main(String[] args) {
		SinglyLinkedListImpl obj = new SinglyLinkedListImpl();
		obj.insertAtBegin(15);
		obj.insertAtBegin(43);
		obj.insertAtBegin(31);
		obj.insertAtBegin(24);
		obj.insertAtEnd(81);
//		obj.insertAtBegin(19);
//		obj.insertAtEnd(99);
//		obj.insertAtPosition(45, 3);
//		obj.removeFromBegin();
//		obj.removeFromPos(3);
		System.out.println(obj);
	}

	@Override
	public String toString() {
		String result = "[";
		if (head == null) {
			return result + "]";
		}
		result = result + head.getData();
		SinglyLinkedListNodeDS temp = head.getNextNode();
		while (temp != null) {
			result = result + ", " + temp.getData();
			temp = temp.getNextNode();
		}
		return result + "]" + "  Length : " + length;
	}

}
