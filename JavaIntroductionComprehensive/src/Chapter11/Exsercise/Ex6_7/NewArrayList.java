package Chapter11.Exsercise.Ex6_7;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import Chapter11.Example.Circle;

public class NewArrayList {
	
	public static void main(String[] args) {
		NewArrayList list = new NewArrayList();
		list.add(new Date());
		list.add("Hello");
		list.add(new Circle());
		list.shuffle();
		
		System.out.println(list.toString());
	}
	
	
	private ArrayList<Object> list;
	
	public void shuffle() {
		Random random = new Random();
		
		for(int i = list.size() - 1; i >= 0; i--) {
			int indexSwap = random.nextInt(i + 1);
			//Swap
			Object temp = list.get(i);
			list.set(i, list.get(indexSwap));
			list.set(indexSwap, temp);
		}
	}
	
	public NewArrayList() {
		list = new ArrayList<Object>();
	}
	
	public void add(Object obj) {
		this.list.add(obj);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		for(int i = 0; i < list.size(); i++) {
			sb.append(this.list.get(i).toString() + "\n");
		}
		String retVal = sb.toString();
		
		return retVal;
	}
}
