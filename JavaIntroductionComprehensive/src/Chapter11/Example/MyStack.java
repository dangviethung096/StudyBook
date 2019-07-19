package Chapter11.Example;

import java.util.ArrayList;

public class MyStack {
	private ArrayList<Object> list = new ArrayList<Object>();
	
	public boolean isEmpty() {
		return list.size() == 0 ? true : false;
	}
	
	public int getSize() {
		return list.size();
	}
	
	public Object peek() {
		return list.get(list.size() -1);
	}
	
	public Object pop() {
		int index = list.size() -1;
		Object retVal = list.get(index);
		list.remove(index);
		return retVal; 
	}
	
	public void push(Object o) {
		list.add(o);
	}
	
	@Override
	public String toString() {
		return "Stack : " + list.toString();
	}
}
