package Stack;

public class InfixToPostfix {

	public static class Stack {
		char[] stack;
		int top;
		int size;

		public Stack(int size) {
			top = -1;
			this.size = size;
			stack = new char[size];
		}

		public void push(char ch) {

			if (isStackFull()) {
				System.out.println("Stack is Full");
				return;
			} else {
				top++;
				stack[top] = ch;
			}
		}

		public char pop() {
			if (isStackEmpty()) {
				System.out.println("Stack is Empty");
				return '\0';
			} else {
				char ch = stack[top];
				top--;
				return ch;
			}
		}

		public boolean isStackEmpty() {
			if (top == -1) {
				return true;
			} else {
				return false;
			}
		}

		public boolean isStackFull() {

			if (top + 1 == size) {
				return true;
			} else {
				return false;
			}
		}

		public char stackTop() {
			return (stack[top]);
		}

	}

	public static int precedence(char ch) {

		switch (ch) {

		case '+':
		case '-':
			return 1;

		case '/':
		case '*':
			return 2;

		case '^':
			return 3;
		}
		return -1;
	}

	public static String infixToPostfix(char[] exp) {
		String result = new String("");

		Stack stack = new Stack(exp.length + 1);

		for (int i = 0; i < exp.length; i++) {

			if (exp[i] == '(') {
				if (!stack.isStackFull()) {
					stack.push(exp[i]);
				} else {
					System.out.println("Stack Full");
				}
			}

			if (Character.isLetterOrDigit(exp[i])) {

				result = result + exp[i];
			}

			if (exp[i] == ')') {

				while (!stack.isStackEmpty() && stack.stackTop() != '(') {
					char ch = stack.pop();
					result = result + ch;
				}

				if (stack.isStackEmpty()) {
					return "Invalid expression.";
				}
				stack.pop();
			}

			if (exp[i] == '+' || exp[i] == '-' || exp[i] == '*' || exp[i] == '/' || exp[i] == '^') {

				int precExp = precedence(exp[i]);
				char chTop = stack.stackTop();
				if (chTop == '+' || chTop == '-' || chTop == '*' || chTop == '/' || chTop == '^') {

					/*
					 * Infix is (a+b*(c^d-e)^(f+g*h)-i) Postfix is
					 * abcd^e-fgh*+^*+i-
					 * 
					 * 
					 * 
					 */

					while (precedence(stack.stackTop()) >= precExp) {
						result = result + stack.pop();
					}
				}

				if (!stack.isStackFull()) {
					stack.push(exp[i]);
				}
			}
		}
		return result;

	}

	public static void main(String[] args) {

		String str = "(a+b*(c^d-e)^(f+g*h)-i)";
		char ch[] = str.toCharArray();
		String output = infixToPostfix(ch);
		System.out.println("Infix is " + str);
		System.out.println("Postfix is " + output);

	}

}
