public class LinkedList {
	Node head;
	
	public void push(String data) {
		Node temp = head;
		head = new Node(data);
		head.next = temp;
	}
	
	public void append(String data) {
		Node end = new Node(data);
		Node node = head;
		while (node.next != null) {
			node = node.next;
		}
		node.next = end;
	}
	
	public Node remove(String key) {
		Node node = head;
		Node prev;
		while (node.name != key) {
			prev = node;
			node = node.next;
			if (node.name == key) {
				prev.next = node.next;
				return node;
			}
		}
		return node;
	}
	
	public void insertAfter(Node previousNode, String data) {
		if (previousNode == null) {
			System.out.println("The given node cannot be null.");
			return;
		}
		Node newNode = new Node(data);
		newNode.next = previousNode.next;
		previousNode.next = newNode;
	}
	
	public void populateList(String[] dataElements) {
		Node node = head;
		for (int i = 0; i < dataElements.length; i++) {
			if (node != null) {
				node.next = new Node(dataElements[i]);
				node = node.next;
			} else {
				node = new Node(dataElements[i]);
				head = node;
			}
		}
	}
	
	public void printList() {
		Node node = head;
		while (node != null) {
			System.out.println(node.name);
			node = node.next;
		}
	}
}
