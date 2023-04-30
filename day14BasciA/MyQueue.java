package day14BasciA;

public class MyQueue<T> {

	LinkList linkList;

	public MyQueue() {
		this.linkList = new LinkList<T>();
	}

	public void enqueue(T data) {
		linkList.append(data);
	}

	public void printQueue() {
		if (linkList.calculateSize() > 0) {
			System.out.print("Queue elements are: ");
			linkList.display();
		} else {
			System.out.println("Queue is empty. Cannot display elements");
		}
	}

	public void dequeue() {
		if (linkList.calculateSize() > 0) {
			System.out.print("Removed front element from queue is: ");
			System.out.println(linkList.pop());
		} else {
			System.out.println("Queue is empty. Cannot remove element");
		}
	}

}
