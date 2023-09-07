package StacksAndQueues;

// Pseudo code
/*
 * STACK-EMPTY(S)
1 if S.top == -1
2 	return TRUE
3 	else return FALSE

PUSH(S,x)
1 	S.top = S.top + 1
2 	S[S.top] = x

POP(S)
1 if STACK-EMPTY(S)
2 	error “underflow”
3 else S.top = S.top - 1
4 	return S[S.top + 1]
 */


class Stack {
	int arr[] =new int[4];
	int top =-1;
	
	
	public void push(int element) {
		if(isFull()) {
			System.out.println("Stack is full");
			return ;
		}
		top = top+1;
		arr[top] = element;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return 0;
		} else {
			top = top-1;
			return arr[top+1];
		}
	}

	private boolean isEmpty() {
		return top==-1;
	}
	
	private boolean isFull() {
		return (top== arr.length-1);
	}
}


public class StackImpl {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		int num = stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(num);
	}

}
