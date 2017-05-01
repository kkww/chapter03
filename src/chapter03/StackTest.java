package chapter03;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("도우너");
		
		String s = stack.pop();
		System.out.println(s);
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
		
		System.out.println(stack.peek()); //pop하지 않고 top을 확인함
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		//System.out.println(stack.pop()); //stack이 비어있는 경우 exception 발생
	}

}
