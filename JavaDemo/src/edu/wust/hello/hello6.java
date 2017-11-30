package edu.wust.hello;

class hello6 {

	public static void main(String[] arguments) {
		hi h = new hi(); 				// 实例化类hi为对象h
		String s = "Hello world."; 		// 定义String类型变量s，并赋值
		h.setS(s); 						// 调用对象h的setS方法
		System.out.println(h.getS()); 	// 调用对象h的getS方法
	}
}
