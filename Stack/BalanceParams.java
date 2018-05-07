package Stack;

public class BalanceParams {
	
	public static class Stack {
		
		char[] stack;
		int size;
		int top;
		
		Stack(int size) {
			top = -1;
			stack = new char[size];
			this.size = size;
		}
		
		
		public void push(char ch) 
		{
			if(isStackFull()) {
				System.out.println("Stack Full");
				return;
			}
			else
			{
				top++;
				stack[top] = ch;
			}
		}
		
		
		public char pop()
		{
			if(isStackEmpty()) {
				System.out.println("stack Empty");
				return '\0';
			}
			else {
				char ch = stack[top];
				top--;
				return ch;
			}
		}
		
		
		public boolean isStackFull() 
		{
			if(top + 1 == size)  {
				return  true;
			}
			else  {
				return false;
			}
		}
		
		public boolean isStackEmpty() {
			
			if(top == -1) {
				return true;
			}
			else {
				return false;
			}
		}
	}

	
	static boolean isExpressionBalanced(char[] exp) {
		
		Stack stack = new Stack(exp.length + 1);
		
		for(int i = 0; i < exp.length; i++) {
			if(exp[i] == '(' || exp[i] == '{' || exp[i] == '[') {
				if(!stack.isStackFull()) {
					stack.push(exp[i]);
				}
			}
			
			if(exp[i] == ')' || exp[i] == '}' || exp[i] == ']') {
				if(stack.isStackEmpty()) {
					return false;
				}
				else
				{
					char ch = stack.pop();
					
					if(!(ch == '(' && exp[i] == ')' || ch == '{' && exp[i] == '}' || ch == '[' && exp[i] == ']'))
					{
						return false;
					}
				}
			}
		}
		
		if(stack.isStackEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		
		String str = "(A+B)";
		char[] exp = str.toCharArray();
		if(isExpressionBalanced(exp))
		{
			System.out.println("Expression is balanced.");
		} else {
			System.out.println("Expression is not balanced.");
		}
		
	}

}
