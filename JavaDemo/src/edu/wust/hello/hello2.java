package edu.wust.hello;

public class hello2 {

	public void helloShow() // 增加类hello2的一个方法
	{
		System.out.println("Hello world.");
	}

	public static void main(String[] arguments) {
		hello2 h = new hello2(); // 实例化 类hello2为 对象h
		h.helloShow(); // 调用对象
	}
}
