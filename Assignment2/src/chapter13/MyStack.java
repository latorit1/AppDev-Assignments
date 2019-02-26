package chapter13;

import java.util.ArrayList;

public class MyStack implements Cloneable{
	
	private java.util.ArrayList<Object> list;

	public MyStack() {
		list = new java.util.ArrayList<Object>();
	}

	public void push(Object o) {
		list.add(0, o);
	}

	public Object peek() {
		return list.get(0);
	}
	
	@Override 
	public Object clone() throws CloneNotSupportedException {
		
	MyStack myStackClone = (MyStack)super.clone();
	myStackClone.list = copyList();
	return myStackClone;
	
	}
	
	private ArrayList<Object> copyList() {
		ArrayList<Object> newList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) 
			newList.add(list.get(i));
		return newList;
	}
	
	public Object pop() {
		Object o = list.get(0);
		list.remove(0);
		return o;
	}

	
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}
