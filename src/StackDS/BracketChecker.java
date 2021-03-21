package stackDS;

public class BracketChecker {
	private String input;
	
//	constructor
	public BracketChecker(String in) {
		input = in;
	}
	
	public void check() {
		int stackSize = input.length();
		StackC theStack = new StackC(stackSize);
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			switch(ch) {
			case '{':
			case '[':
			case '(':
				theStack.push(ch);
				break;
				
			case '}':
			case ']':
			case ')':
				System.out.println("ch: " + ch);
			
				if(!theStack.isEmpty()) {
					char chx = theStack.pop();
					System.out.println("chx: " + chx);
					if	((ch == '}' && chx != '{') || (ch == ']' && chx !='[') || (ch == ')' && chx != '(')) {
						System.out.println("Error: " + ch + " at " + i);
					} else {
						System.out.println("Error: " + ch + " at " + i);
						break;
					}
				}
			default:
				break;
			}
			
			if(!theStack.isEmpty()) {
				System.out.println("Error: missing right delimiter");
			}
		}
		
	}
	
	
	
}
