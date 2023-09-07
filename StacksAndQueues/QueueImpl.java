package StacksAndQueues;

class Queue {
	int head = -1;
	int tail = -1;
	int arr[] = new int[3];
	
	public void enqueue(int x) {
		if(isEmpty()) {
			tail =0;
		} else if(isFull()) {
			System.out.println("Queue is Full while inserting "+x);
			return;
		} 
		else {
			tail = tail+1;
		}
		arr[tail] =x;
	}
	
	public int deque() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		} else if(head == tail) {
			System.out.println("Queue is Empty");
		} 
		else {
			head = head+1;
			return arr[head];
		}
		return 0; 
	}
	
	public boolean isEmpty() {
		return (head ==-1 && tail==-1);
	}
	
	public boolean isFull() {
		return tail == arr.length-1;
	}
}


public class QueueImpl {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
	//	queue.enqueue(40);
		
		int num = queue.deque();
		int num1 = queue.deque();
		int num2 = queue.deque();
		int num3 = queue.deque();
		System.out.println(num+ " "+ num1 + " "+ num2+ " ");
	
	}

}
