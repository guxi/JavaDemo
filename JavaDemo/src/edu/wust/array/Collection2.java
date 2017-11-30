package edu.wust.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Iterator
	static void IteratorTest() {		
		Collection<String> c= Arrays.asList("香蕉","苹果","大鸭梨");  //工具类 Arrays		
		 Iterator<String> it = c.iterator();
		 while(it.hasNext())
		prtl(it.next());
	}
	static void prtl(String str) {
		System.out.println(str);
	}

	static void prt(String str) {
		System.out.print(str);
	}

}
