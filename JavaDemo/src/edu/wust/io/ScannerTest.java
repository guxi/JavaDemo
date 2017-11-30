package edu.wust.io;

import java.io.File;
import java.io.FileNotFoundException;
//import java.nio.file.Files;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws FileNotFoundException {
	//getKB();
		getStrings() ;
		getFile() ;
	}

	/**
	 * 获取键盘输入
	 */
	static void getKB() {
		Scanner s = new Scanner(System.in);
		prtl("请输入字符串：");
		while (true) {
			String line = s.nextLine();
			if (line.equals("exit")) {
				prtl("bye!");
				break;
			}
			else prtl(">>>" + line);
		}
		s.close();
	}

	/**
	 * 从字符串创建
	 */
	static void getStrings() {
		Scanner s = new Scanner("1 fish 2 fish red fish blue fish");//默认使用空格分隔
		//s.useDelimiter("\\s*fish\\s*");  //去掉注释，可自定义分隔符
		while (s.hasNext()) {
			prtl(s.next());
		}
		s.close();
	}
	
	/**
	 * 从文件创建
	 * @throws FileNotFoundException 
	 */
	static void getFile() throws FileNotFoundException {
		Scanner s = new Scanner(new File("src/ScannerTest.txt"));
		while (s.hasNext()) {
			prtl(s.next());
		}
		s.close();
	}

	static void prtl(String str) {
		System.out.println(str);
	}

	static void prt(String str) {
		System.out.print(str);
	}

}
