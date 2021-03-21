package stackDS;

public class StackC {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public StackC(int s){
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char j){ // put item on top of stack
		stackArray[++top] = j; // increment top, insert item
	}
	
	public char pop(){ // take item from top of stack
		return stackArray[top--]; // access item decrement top
	}
	
	public char peek() {
		return stackArray[top]; // return item at the top of the stack
	}
	
	public boolean isEmpty(){ // return true  if stack is empty
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize -1); // return true if stack is full
	}

}
