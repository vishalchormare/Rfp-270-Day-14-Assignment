package day14BasciA;

import java.util.Collections;
import java.util.List;

public class SortedLinkedList<T extends Comparable<T>> {

	Node<T> head;
	Node<T> tail;

	Node<T> temp;

	Node<T> tempCurrent = temp;
	Node<T> tempPrev = temp;

	public void push(T data) {
		Node<T> newNode = new Node<>(data);

		if (head == null) {
			head = newNode;// 56
			tail = newNode;// 56
		} else {

			newNode.next = head;
			head = newNode;

		}

	}

	public void append(T data) {
		Node<T> addNode = new Node<>(data);
		if (head == null) {
			head = addNode;
			tail = addNode;
		} else {
			addNode.next = head;
			head = addNode;

			sort();

		}

	}

	public void sort() {
		Node<T> currnet = head, index;
		T temp;

		if (head != null) {
			while (currnet != null) {
				index = currnet.next;
				while (index != null) {
					if ((currnet.data.compareTo(index.data)) > 0) {
						temp = currnet.data;
						currnet.data = index.data;
						index.data = temp;
					}
					index = index.next;

				}
				currnet = currnet.next;
			}
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

	public void search(T data) {
		Node<T> temp = head;
		while (temp != null) {
			if (temp.equals(data)) {
				System.out.println(temp.data);
			}
			temp = temp.next;
		}

	}

	public boolean insertAfter(T insertData, T searchData) {

		Node<T> newNode = new Node<T>(insertData);
		Node<T> searchedNode = new Node<T>(searchData);

		if (searchedNode != null) {
			Node<T> temp = searchedNode.next;
			searchedNode.next = newNode;
			newNode.next = temp;
			return true;
		}
		return false;

	}

	public void display() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;

		}
		System.out.println();
	}

	class Integer {

	}
}
