package day14BasciA;

public class MyStack<T> {

	LinkList linkList;

	public MyStack() {
		this.linkList = new LinkList();
	}

	public void push(T data) {
		linkList.add(data);
		System.out.println(data + "is a pushed in stack	");
	}

	public T peak() {
		if (linkList.calculateSize() > 0) {
			System.out.println("Top stack is :");

			linkList.showTail();
		} else {
			System.out.println("Stack is empty.Cannot display Top of stack");

		}
		return null;

	}

	public void pop() {
		if (linkList.calculateSize() > 0) {
			System.out.println("Popped element from stack is:");
			System.out.println(linkList.deleteLast());
		} else {
			System.out.println("Stack is empty.Cannot pop elemt");
		}
	}

	public void printStack() {
		if (linkList.calculateSize() > 0) {
			System.out.print("Stack elements are: ");
			linkList.display();
		} else {
			System.out.println("Stack is empty.Cannot display element");
		}
	}
	
	public boolean isEmpty() {

		return linkList.isEmpty();
	}
}
