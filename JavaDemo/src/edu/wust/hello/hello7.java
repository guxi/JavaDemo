package edu.wust.hello;

public class hello7 {
	public static void main(String[] arguments) {
		String s = "Hello world7." + hi2.i; //用类访问静态方法和属性		
		hi2 h = new hi2();  //用对象访问非静态方法和属性
		h.setS(s);          //用对象访问非静态方法和属性
		prtl(hi2.getS());  //静态方法访问类的静态方法和属性	
	}
	static void prtl(String s){
		System.out.println(s);
		}
}
