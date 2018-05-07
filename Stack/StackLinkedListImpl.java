package stack;

class StackLinkedList {
	class Node {
		int data;
		Node next;
	}
	
	Node head;
	int size;
	
	StackLinkedList() {
		head = null;
		size = 0;
	}
	
	public void push(int item) {
		Node newNode = new Node();
		newNode.data = item;
		newNode.next = null;
		
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}
	
	public int pop() {
		if(head == null) {
			System.out.println("List is empty");
			return -1;
		}
		else
		{
			int data = head.data;
			head = head.next;
			return data;
		}
	}
	
	public int peek() {
		if(head == null) {
			return -1;
		}
		else{
			return head.data;
		}
	}
}



public class StackLinkedListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLinkedList stack1 = new StackLinkedList();
		stack1.push(10);
		stack1.push(15);
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
	}

}
