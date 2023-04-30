package day14BasciA;

import java.util.Collections;
import java.util.List;

public class SortedLinkedListMain {
	
	public static void main(String[] args) {
		
		SortedLinkedList<Integer>sortedLinkedList = new SortedLinkedList<>();
		sortedLinkedList.append(56);
		sortedLinkedList.append(30);
		sortedLinkedList.append(40);
		sortedLinkedList.append(70);
		
		
		sortedLinkedList.display();
	}
}
