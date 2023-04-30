package day14BasciA;



public class LinkListMain {

	public static void main(String[] args) {
		LinkList<Integer> linkedList1 = new LinkList<>(); // head = null, tail = null
		LinkList<Integer> linkedList2 = new LinkList<>(); // head = null, tail = null
		LinkList<Integer> linkedList3 = new LinkList<>();
		System.out.println("Add linked List");
		linkedList1.add(30);
		linkedList1.add(56);
		linkedList1.add(70);
		linkedList1.display();
		System.out.println("*************************************");

		System.out.println("Appending linked List");
		linkedList2.append(30);
		linkedList2.append(70);
		linkedList2.append(56);
		linkedList2.display();

		

//		System.out.println("*******************************");
//		System.out.println("First delete linked List");
//		Integer poppedElement = linkedList2.in(30);
//		System.out.println("First Popped Element => " + poppedElement);
//		linkedList2.display();

		System.out.println("*******************************");
		System.out.println("Last delete linked List");
		Integer popLastElement = linkedList1.popLast();
		System.out.println("Last Popped Element => " + popLastElement);
		linkedList1.display();
		System.out.println("*******************************");

		System.out.println("Search linked List");
		System.out.println(linkedList2.search(30));

		System.out.println("*******************************");

		System.out.println("After insert linked List");
		boolean isInserted = linkedList2.insertAfter(40, 30);
		System.out.println(isInserted);
		linkedList2.display();
		System.out.println("*******************************");

		linkedList2.firstElementDelete();
		linkedList2.display();
		
		linkedList2.lastElementDelete();
		linkedList2.display();
		
		
		if(linkedList1.search(30)==null) {
			System.out.println("Element Absent in Lined List");
		}else {
			System.out.println("Element Present in Linked List");
		}
	}
}