public class IntLinkedListCollection implements Cloneable {
	private IntNode head;
	private int numberOfNodes;

	public IntLinkedListCollection() {
		this.head = null;
	}

	public void add(int element) {
		if (element <= 0)
			throw new IllegalArgumentException("Invalid input");

		head = new IntNode(element, head);
		numberOfNodes++;
	}

	public void addMany(int... elements) {

		for (int i = 0; i < elements.length; i++) {
			add(elements[i]);
		}
	}

	public int grab() {

		int position = (int) (Math.random() * numberOfNodes) + 1;
		IntNode cursor;
		int index;
		int item = 0;

		for (cursor = head, index = 1; cursor != null; index++, cursor = cursor
				.getLink()) {
			if (position == index) {
				item = cursor.getData();
				break;
			}
		}

		return item;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public int size() {
		return numberOfNodes;
	}

	public void search(int target) {

	}

	public boolean remove(int target) {

		IntNode cursor;
		IntNode precursor;

		for (cursor = head, precursor = null; cursor != null; precursor = cursor, cursor = cursor
				.getLink()) {
			if (cursor.getData() == target) {
				if (precursor == null) {
					head = head.getLink();
					return true;
				}
				
				precursor.removeNodeAfter();
				numberOfNodes--;
				return true;
			}
		}

		return false;
	}

	@Override
	public IntLinkedListCollection clone() {
		IntLinkedListCollection copy = null;
		IntNode tcopy = null;
		IntNode hcopy = null;

		IntNode cursor;
		
		for (cursor = head; cursor != null; cursor = cursor.getLink()) {
			if (tcopy == null) {
				tcopy = new IntNode(cursor.getData(), null);
				hcopy = tcopy;
			} else {
				tcopy.setLink(new IntNode(cursor.getData(), null));
				tcopy = tcopy.getLink();
			}
		}

		try {
			copy = (IntLinkedListCollection) super.clone();
			copy.head = hcopy;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return copy;
	}

	@Override
	public String toString() {
		String info = "";
		IntNode cursor;

		for (cursor = head; cursor != null; cursor = cursor.getLink()) {
			info += cursor.getData();

			if (cursor.getLink() != null)
				info += "-->";
		}

		return info;
	}

	public static void main(String[] args) {
		IntLinkedListCollection list = new IntLinkedListCollection();
		list.add(8);
		list.add(4);
//		list.addMany(6, 7, 8);
		
		IntLinkedListCollection list2 = list.clone();
		
		System.out.println(list.toString());
		list2.remove(8);
		

		System.out.println(list2.toString());

	}

}
