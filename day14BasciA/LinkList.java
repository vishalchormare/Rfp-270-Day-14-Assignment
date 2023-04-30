package day14BasciA;

public class LinkList<T> {
	Node<T> head;
	Node<T> tail;
	int size = 0;
	public Object deleteAt;

	public void add1(T data) {
		Node<T> nodenew = new Node<T>(data);
		nodenew.data = (T) data;
		if (head == null) {
			head = nodenew;
			size++;
		}

		else {
			Node<T> n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = nodenew;
			size++;
		}
	}

	public void add(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			size++;

		} else {
			newNode.next = head;
			head = newNode;
			size++;

		}
	}

	public void append(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void display() {
		Node<T> currentNode = head;
		if (head == null) {
			System.out.println("Linked List is Empty");
		}
		while (currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	public String show1() {
		String str = "";
		Node<T> n = head;
		if (head == null) {
			return "No Data";
		} else {
			while (n.next != null) {
				str = str + n.data + " ";
				n = n.next;
			}
			str += n.data;

		}
		return str;
	}

	public void showTail() {
		System.out.println(tail.data);
	}

	public void firstElementDelete() {
		if (head == null) {
			System.out.println("Linked list is Empty");
		}
		head = head.next;
	}

	public void lastElementDelete() {
		if (head == null) {
			System.out.println("Linked list is Empty");
		} else if (head == tail) {
			head = null;
			tail = null;
		} else {
			Node<T> currentNode = head;
			while (currentNode.next != tail) {
				currentNode = currentNode.next;
			}
			currentNode.next = null;
			tail = currentNode;
		}
	}

	public Node<T> search(T data) {
		Node<T> currentNode = head;
		while (currentNode != null) {
			if (currentNode.equals(data)) {
				return currentNode;
			}
			currentNode = currentNode.next;
		}
		return null;
	}

	public void insertElement(T searchNode, T insertElement) {
		Node newNode = new Node<>(insertElement);
		Node searchedNode = search(searchNode);
		boolean condition = false;
		if (searchedNode != null) {
			newNode.next = searchedNode.next;
			searchedNode.next = newNode;
			condition = true;
		}
		if (condition == true) {
			System.out.println("Successfully added the element");
		} else {
			System.out.println("Element Absent in Linked list");
		}
	}

	public void searchElementThenDelete(T data) {
		Node<T> secondLastNode = head;
		Node<T> lastNode = head.next;
		while (lastNode.data != data) {
			lastNode = lastNode.next;
			secondLastNode = secondLastNode.next;
		}
		secondLastNode.next = lastNode.next;
	}

	// addd
	public void push(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;

		}
	}

	public T pop() {
		T popData = head.data;
		head = head.next;
		return popData;
	}

	public T popLast() {
		T data = tail.data;
		Node<T> temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}

		temp.next = null;
		tail = temp;
		return data;
	}

	public boolean insertAfter(T insertData, T searchData) {
		Node<T> newNode = new Node<>(insertData);
		Node<T> serchedData = search(searchData); // error is Type mismatch: cannot convert from void to Node<T>

		if (serchedData != null) {
			Node<T> temp = serchedData.next;
			serchedData.next = newNode;
			newNode.next = temp;
			return true;
		}
		return false;

	}

	public T deleteLast() {
		T value = null;
		Node<T> temp = head;
		if (head == tail) {
			value = head.data;
			head = null;
			tail = null;
		} else {
			while (temp.next != tail) {
				temp = temp.next;
			}
			value = tail.data;
			tail = temp;
			tail.next = null;
		}
		return value;
	}

	public int calculateSize() {
		Node temp = head;
		Integer elementCount = 0;
		if (head == tail && head != null && tail != null) {
			elementCount = 1;
		} else {
			while (temp != null) {
				elementCount = elementCount + 1;
				temp = temp.next;
			}
		}
		return elementCount;
	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node<T> n = head;
			Node<T> n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
//			System.out.println("Node deleted is: " + n1.data);
			n1 = null;
		}
		size--;

	}

	public int searchNode(T key, int seiz) {
		boolean isFound = false;
		int counter = -1;
		Node<T> n = head;
		while (n.next != null) {

			counter++;
			if (n.data.equals(key)) {
				isFound = true;
				break;
			}

			n = n.next;
		}
		if (isFound) {
			System.out.println("key found and deleting...");
			deleteAt(counter);
		} else if (n.data.equals(key)) {
			System.out.println("key found at last and deleting...");
			counter++;
			deleteAt(counter);
			size--;
		} else {
			System.out.println("key not found and inserting...");
			size++;
			add(key);
		}
		return size;
	}

	public <T extends Comparable<T>> void sort(int size) {

		Node<T> n = (Node<T>) head;
		Node<T> n1 = n.next;
		T temp;

		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j <= size - 1 - i - 1; j++) {

				if (n.data.compareTo(n1.data) > 0) {
					temp = n.data;
					n.data = n1.data;
					n1.data = temp;
				}
				n1 = n1.next;
			}
			n = n.next;
			n1 = n.next;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addAtStart(T data) {
		Node<T> nodenew = new Node<T>(data);
		nodenew.data = data;
		nodenew.next = null;
		nodenew.next = head;
		head = nodenew;
		size++;

	}

	public void deleteAtStart() {
		head = head.next;
		size--;

	}

	public void deleteAtEnd() {
		if (!isEmpty()) {
			Node<T> n = head;

			while (n.next != null) {
				n = n.next;
			}

			n.next = null;

		} else {
			System.out.println("Linked list is empty nothing to delete");
		}
		size--;

	}

	public T get(int index) {
		if (index == 0)
			return head.data;
		else {
			Node<T> n = head;
			for (int i = 0; i < index; i++) {
				if (n.next != null) {
					n = n.next;
				} else {
					return null;
				}

			}
//			n = n.next;
			return n.data;

		}

	}
	
	

}
