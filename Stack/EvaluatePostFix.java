package Stack;

import java.util.Stack;

public class EvaluatePostFix {
	
	public static int evaluatePostFix(String exp) {
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0 ; i < exp.length(); i++) {
			char ch = exp.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
					stack.push(ch - '0');
			}
			else { 
					 int op1 = stack.pop();
					 int op2 = stack.pop();
					 switch(ch) 
					 {
						 case '+':
							   stack.push(op1 + op2);
							   break;
						 case '-':
							   stack.push(op2 - op1);
							   break;
						 case '*':
							   stack.push(op1 * op2);
							   break;
						 case '/':
							   stack.push(op2 / op1);
							   break;
						 case '^':
							   stack.push(op1 ^ op2);
							   break;	   
					 }
				}		
			}
			return stack.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="231*+9-";
		System.out.println(" Result = " + evaluatePostFix(str));
		
	}
}
