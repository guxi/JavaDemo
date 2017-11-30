package edu.wust.operators;

public class OverloadingTree {

	public static void main(String[] args) {
			Tree t=new Tree();
			t.info();
			for(int i = 0; i < 5; i++) {
			 t = new Tree(i);
			t.info();
			t.info("重载方法：");
			}	
			
			}
	}


