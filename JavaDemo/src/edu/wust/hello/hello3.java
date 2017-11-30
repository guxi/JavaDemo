package edu.wust.hello;

public class hello3 {

	String s = "Hello world."; // 类属性

	public void helloShow() {
		System.out.println(s); // 类方法使用类属性
	}

	public static void main(String[] arguments) {
		hello3 h = new hello3();
		h.helloShow(); // 调用对象方法

	}
}
