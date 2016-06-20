package ds;

public class SinglyLinkedListNodeDS {
	
	private int data;
	private SinglyLinkedListNodeDS nextNode;
	
	public SinglyLinkedListNodeDS(int data){
		this.data=data;
		
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public SinglyLinkedListNodeDS getNextNode() {
		return nextNode;
	}
	public void setNextNode(SinglyLinkedListNodeDS nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SinglyLinkedListNodeDS [data=");
		builder.append(data);
		builder.append(", nextNode=");
		builder.append(nextNode);
		builder.append("]");
		return builder.toString();
	}
}
