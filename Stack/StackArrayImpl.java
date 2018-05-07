package stack;

class Stack {
	int top;
	int size;
	int stack[];
	Stack() {
		top = -1;
	}

	Stack(int size) {
		this.size = size;
		top = -1;
		stack = new int[size];
	}
	
	public void push(int data) {
		
		if(!isStackFull()) {
			top++;
			stack[top] = data;
		}
		else {
			
			System.out.println("Stack is Full.");
			return;
		}
			
	}
	
	public int pop() {
		if(!isStackEmpty()) {
			int data = stack[top];
			top--;
			return data;
		}
		else {
			System.out.println("Stack is empty.");
			return -1;
		}
	}
	
	public int peek() {
		if(!isStackEmpty()) {
			return stack[top];
		}
		else
		{
			System.out.println("Stack is empty.");
			return -1;
		}
	}
	
	public int stackSize() {
		return this.size;
	}
	
	public boolean isStackEmpty() {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isStackFull() {
		if(top == size) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void stackTraverse() {
		if(!isStackEmpty()) {
			for(int i = top; i >= 0; i--) {
				System.out.print(stack[i] + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("Stack is empty.");
			return;
		}
	}
}

//Queue using stacks 

class QueueUsingStacks {
	
	
	public void enQueue(int item) {
		
	}
}


public class StackArrayImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack1 = new Stack(10);
		stack1.push(5);
		stack1.push(10);
		stack1.stackTraverse();
		stack1.pop();
		stack1.pop();
		stack1.stackTraverse();
		stack1.pop();
		stack1.stackTraverse();
	}

}