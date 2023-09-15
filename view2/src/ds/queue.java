package ds;

public class queue {

	int[] array;
	int top = 0 ;
	int count;
	int maxSize;

	public queue(int maxSize) {
		super();
		this.count = -1;
		this.maxSize = maxSize;
		array = new int[maxSize];
	}

	public void offer(int element) {
		if (isFull()) {
			System.out.println("Queue is Full");
		} else {
			array[++count] = element;
			
		}

	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		} else {
			return array[top];
		}

	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		} else {
			int popElement = array[top];
			top++;
			return popElement;
		}

	}

	public boolean isFull() {
		return false;
	}

	public boolean isEmpty() {
		return false;
	}
	
	public void displayQueue()
	{
		for (int i = 0; i <= count; i++) {
			
			System.out.print(array[i]+ ",");
		}
	}

	public static void main(String[] args) {
		
		queue q = new queue(10);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		q.displayQueue();
		int peek = q.peek();
		System.out.println();
		int pop = q.pop();
		q.displayQueue();

	}

}
