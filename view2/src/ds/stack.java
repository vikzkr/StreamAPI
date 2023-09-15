package ds;

import java.util.Iterator;

public class stack {
	
	
	int[] array;
	int maxSize;
	int top ;
	
	public stack(int maxSize) {
		this.maxSize = maxSize;
		this.array = new int[maxSize];
		this.top = -1; 
	}
	
	public void push(int data)
	{
		if(isFull())
		{
			System.out.println("Stack size is full");
		}
		else
		{
			array[++top] = data;
		}
		
		;
	}
	private boolean isFull() {
		return (top == maxSize-1);
	}

	public int peek()
	{
		
		if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a sentinel value to indicate an empty stack
        } else {
            return array[top];
        }
		
	}
	
	public int pop()
	{
		 if (isEmpty()) {
	            System.out.println("Stack is empty. Cannot pop.");
	            return -1; // Return a sentinel value to indicate an empty stack
	        } else {
	            return array[top--];
	        }
		
	}
	private boolean isEmpty() {
		return (top ==-1) ;
	}

	public void displayStack()
	{
		for (int i = 0; i <= top; i++) {
			System.out.println(array[i]);
			
		}
	}
	
	public static void main(String[] args) {
		
		stack s = new stack(10);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		s.displayStack();
		int peekData  = s.peek();
		int popdata = s.pop();
		System.out.println("popdata "+popdata);
		s.displayStack();
		
	}

}
