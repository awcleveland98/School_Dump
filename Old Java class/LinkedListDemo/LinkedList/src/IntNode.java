
public class IntNode {
	private int data;
	private IntNode link;
	
	public IntNode(int data, IntNode link) {
		this.data = data;
		this.link = link;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public IntNode getLink() {
		return link;
	}

	public void setLink(IntNode link) {
		this.link = link;
	}
	
	public void removeNodeAfter() {
		link = link.link;
	}
	
	public void addNodeAfter(int element) {
		link = new IntNode(element, link);
	}
	
	public static void print(IntNode head) {
		IntNode cursor;
		for (cursor = head; cursor != null; cursor = cursor.link) {
			System.out.print(cursor.link != null ? cursor.data + "-->" : cursor.data);
		}
	}
	
	public static void main(String[] args) {
		IntNode head = null;
		IntNode tail = null;
		
		for (int element = 10; element <= 20; element++) {
			//if head is null
			//	initialize head to a node with element 10 and assign head to tail
			//else add element after tail node
			//	and update tail reference to point to the new node
			
			if (head == null) {
				head = new IntNode(element, null);
				tail = head;
			} else {
				tail.addNodeAfter(element);
				tail = tail.link;
			}
		}
		
		IntNode.print(head);
		
		System.out.println("\nHead: " + head.data + "\tTail: " + tail.data);
	}
}

