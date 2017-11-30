package edu.wust.hello;

class hello4 {
	String s = "Hello world.";

	public String getS() // 有返回值(String类型)的方法
	{
		return s;	}

	public static void main(String[] arguments) {
		hello4 h = new hello4();
		System.out.println(h.getS());
	}
}
