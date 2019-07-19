package Chapter11.Exercise.Ex10;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyStack() {
		
	}
	
	public boolean isEmpty() {
		return this.size() == 0 ? true : false;
	}
	
	public void push(Object element) {
		this.add(element);
	}
	/**
	 * Get top element but not remove
	 * @return
	 */
	public Object peek() {
		return this.get(this.size());
	}
	
	public int getSize() {
		return this.size();
	}
	
	/**
	 * get top element in stack and remove it
	 * @return
	 */
	public Object pop() {
		Object retVal;
		if(this.size() > 0)
			 retVal = this.remove(this.size() - 1);
		else 
			retVal = null;
		return retVal;
	}
	
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("Hello");
		stack.push("Hi");
		stack.push("How do you do!");
		
		int length = stack.getSize();
		for(int i = 0; i < length; i++) {
			System.out.println(stack.pop().toString());
		}
	}
	
}	


