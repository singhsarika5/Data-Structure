package Stack;

//import java.util.*;
class Stack
{
	int stack[];
	int minStack[];
	int size;
	int top;
	int minTop;
	
	Stack(int size) {
		this.size = size;
		top = -1;
		minTop = -1;
		stack = new int[size];
		minStack = new int[size];
	}
	
	public int pop()
	{
		if(isStackEmpty())
		{
			System.out.println("Stack is empty.");
			return -1;
		}
		else
		{
			int data;
			if(stack[top] == minStack[minTop])
			{
				data = minStack[minTop--];
				top--;
			}
			else
			{
				data = stack[top--];
			}
			return data;
		}
	}
	
	public void push(int data)
	{
		if(isStackFull()) 
		{
			System.out.println("Stack is full");
			return;
		}
		else 
		{
			if(minTop == -1)
			{
				minTop++;
				minStack[minTop] = data;
			} else if(data < minStack[minTop]) 
			{
				minTop++;
				minStack[minTop] = data;
			}
			top++;
			stack[top] = data;
		}
	}
	
	public boolean isStackEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isStackFull()
	{
		if(top + 1 == size)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int peek() {
		return stack[top];
	}
	
	public int minimum()
	{
		if(minTop == -1)
		{
			return -1;
					
		}
		else
		{
			return minStack[minTop];
		}
	}
	
}


public class MinStack {

	public static void main(String[] abc) {
		// TODO Auto-generated method stub
		Stack s1 = new Stack(10);
		s1.push(0);
		s1.push(5);
		s1.push(3);
		s1.push(10);
		s1.push(1);
		System.out.println(s1.minimum());
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.minimum());
		System.out.println(s1);
	}

};
