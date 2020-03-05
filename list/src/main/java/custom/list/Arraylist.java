package custom.list;

import java.util.Arrays;

public class Arraylist<E> {
	private int size=0;
	private static int capacity=10;
	private Object ele[];
	public Arraylist() {
		ele=new Object[capacity];
	}
	public void add(E e) {
		if(size==ele.length) {
			increasecapacity();
		}
		ele[size++]=e;
	}
	private void increasecapacity() {
		int newsize=ele.length*2;
		ele=Arrays.copyOf(ele, newsize);
	}
	@SuppressWarnings("unchecked")
	public E get(int i) {
		if(i<0 || i>=size) {
			throw new IndexOutOfBoundsException("Index out of range");
		}
		else {
			return (E) ele[i];
		}
	}
	@SuppressWarnings("unchecked")
	public E remove(int i) {
		if(i<0 || i>=size) {
			throw new IndexOutOfBoundsException("Index out of range");
		}
			Object x=ele[i];
			for(int k=i;k<size;k++) {
				ele[i]=ele[i+1];
			}
			size--;
		return (E)x;
	}
	public void print() {
		for(int i=0;i<size;i++) {
			System.out.print(ele[i]+" ");
		}
	}
}
