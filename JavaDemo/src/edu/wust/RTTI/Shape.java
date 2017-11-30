package edu.wust.RTTI;

public interface Shape {
	void draw();
	default void prtl(String s){
		System.out.println(s);
		}

}
