package edu.wust.operators;

public class Leaf {
	private int i = 0;	
	public Leaf(int i) {
		this.i=i;
	}
	public Leaf() {
		this(4);
	}	
	Leaf increment() {
	i++;
	return this;
	}	
	public static void main(String[] args) {
	Leaf x = new Leaf();
	x.increment().increment().increment().print();
	}
	
	void print() {
		System.out.println("i = " + i);
	}
}
