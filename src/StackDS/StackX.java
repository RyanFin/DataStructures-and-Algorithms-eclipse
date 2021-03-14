package StackDS;

public class StackX {
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public StackX(int s){
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}
	
	public void push(long j){ // put item on top of stack
		stackArray[++top] = j; // increment top, insert item
	}
	
	public long pop(){ // take item from top of stack
		return stackArray[top--]; // access item decrement top
	}
	
	public long peek() {
		return stackArray[top]; // return item at the top of the stack
	}
	
	public boolean isEmpty(){ // return true  if stack is empty
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize -1); // return true if stack is full
	}

}
