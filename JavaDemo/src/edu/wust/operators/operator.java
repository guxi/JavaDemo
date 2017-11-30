package edu.wust.operators;

import java.util.Random;
/**
 * @version 1.0
 * @author yy
 */
public class operator {

	public static void main(String[] args) {
		prtl("----递增和递减------");
		AutoInc();
		prtl("----算数运算符 ------");
		arithmetic();	
		prtl("----类型转换------");
		typeTransform();
		prtl("---- 比较------");
		equivalence();
		prtl("---- 逻辑操作------");
		logical();
		prtl("---- &和&&与短路操作------");
		shortCircuiting();
		prtl("---- 三元运算 与次序------");
		ternary();
//		prtl("---- 数学方法------");
//		mathTest();
	}
	
	/**
	 * 递增和递减
	 */
	static void  AutoInc() {
		int i = 1;
		prtl("i : " + i);
		prtl("++i : " + ++i); // Pre-increment
		prtl("i++ : " + i++); // Post-increment
		prtl("i : " + i);
		prtl("--i : " + --i); // Pre-decrement
		prtl("i-- : " + i--); // Post-decrement
		prtl("i : " + i);

	}
	
	/**
	 * 算数运算符
	 */
	static void arithmetic() {
		int i= 7 + 2 * 3; 
		i= i/ 2;
		double d= i/2; 
		d= d/2; 
		//i= d;             //报错
		i= (int) d;    //必须强转
		prtl("整型浮点运算："+i);
	}
	
	
	/**
	 * 类型转换
	 */
	static void typeTransform() {
		int i = 13;
		i = i / 2;
		prtl("13/2 整形除不尽 ：" + i);
		double d = i / 2;
		prtl("7/2 浮点除整形有误：" + d);
		d = d / 2;
		prtl("3/2 浮点除浮点正确：" + d);
		i = (int) d; // 窄化，必须强转
		prtl("窄化强转：" + i);
	}

	/**
	 * 比较
	 */
	static void equivalence() {
		int i = 47;
		int j = 47;
		prtl("基本类型比较：" + (i == j));
		Number n1 = new Number(i);
		Number n2 = new Number(i);
		prtl("对象比较：" + (n1 == n2));
		n1=n2;
		n1.i=27;
		prtl("引用改值：" + n2.i);

	}

	/**
	 * 逻辑操作
	 */
	static void logical() {
		Random rand = new Random();
		int i = rand.nextInt(10);
		int j = rand.nextInt(10);
		prtl("" + i + ">" + j + " is " + (i > j));
	}

	/**
	 * &和&&与短路操作
	 */
	static void shortCircuiting() {
		boolean i = false;
		boolean j = true;
		prt("false & true:");
		prtl("" + (SC(i) & SC(j)));
		prt("false && true:");
		prtl("" + (SC(i) && SC(j)));
	}

	static boolean SC(boolean s) {
		prt("" + s + ",");
		return s;
	}

	/**
	 * 三元运算 与次序
	 */
	static void ternary() {
		int a = 5, b = 6, c = 7;
		prtl("三元计算: " + (a = b > c ? 160 : 180));
		prtl("abc的值：" + a + "," + b + "," + c);
	}

	/**
	 * 数学方法
	 */
	static void mathTest() {
		prtl("cos(30):"+Math.cos(30));
		prtl("Math.PI:"+Math.PI);


	}
	static void prtl(String str) {
		System.out.println(str);
	}

	static void prt(String str) {
		System.out.print(str);
	}
}