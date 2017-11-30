package edu.wust.array;

import java.util.*;

public class SimpleCollection {

	public static void main(String[] args) {
		prtl("---- 数组 ------");
		arr1();
		prtl("---- 对象数组 ------");
		objArr() ;
		prtl("---- 二维数组 ------");
		arr2();
		prtl("---- list ------");
		listTest();
	}

	static void arr1() {
		// int[] arr= {0,1,2,3,4};
		int[] arr ;
		arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = i + 1;
			prtl("arr[" + i + "]=" + arr[i]);
		}
	}
	// 对象数组
		static void objArr() {
			Score[] sc = new Score[3];
			sc[0] = new Score(1, 1, 80);
			sc[1] = new Score(2, 2, 75);
			sc[2] = new Score(3, 3, 94);
//			for(int i=0;i<sc.length;i++) {
//				score t=sc[i];
//				prtl(t.toString());
//			}
			for (Score s : sc) {
				prtl(s.toString());
			}
		}
	static void arr2() {
		int[][] a = { { 1, 2 }, { 3, 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				prtl("a[" + i + "][" + j + "] = " + a[i][j] + "  ");
			}
			prtl("");

		}
	}
	
	// List
	static void listTest() {
		String[] str={"香蕉","苹果","大鸭梨"};		
		
		List<String> list=new ArrayList<String>();
		for(String s:str) {
			list.add(s);
		}
		prtl("成员数量：·	"+list.size());
		for(String strs:list) {
			prt(" "+strs);
	
		}
	}
	
	
	static void prtl(String str) {
		System.out.println(str);
	}

	static void prt(String str) {
		System.out.print(str);
	}

}
