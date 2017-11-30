package edu.wust.exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class exceptionTest {

	public static void main(String[] args)  {
		try {
			throwTest();
		} catch (Exception e) {
			e.printStackTrace();
				//e.getMessage();
			prtl("????");
		}
		
		//tryCatchTest();
		//IOtryCatchTest();
			
	}
	
	static void throwTest() throws Exception{
		int i = 1;
		int j = 0;
		if(i==1) throw new Exception("j不能为0！！！！");			
		//int z = i / j;		
	}
	
	static void tryCatchTest() {		
		try {
			/**************** 除零 ********************/			
			int i=1;int j=0;int k=i/j;
			/**************** 越界 ********************/			
			int[]arr={1,2,3}; int brr=arr[3];
		}
		catch (ArrayIndexOutOfBoundsException|ArithmeticException e) {
			prtl("something error!");
			prtl( e.getMessage());			
			e.printStackTrace();
		} 		
	}
	
	static void IOtryCatchTest() {
		Path pr = Paths.get("c:\\a\\HelloR11.txt");
		Path pw = Paths.get("c:\\a\\HelloR12.txt");
		BufferedWriter writer = null;
		try(BufferedReader reader = Files.newBufferedReader(pr, StandardCharsets.UTF_8))
		{
			String temp = reader.readLine();			
			writer = Files.newBufferedWriter(pw, StandardCharsets.UTF_8);
		}catch(Exception e) {
			prtl("error ");
			e.printStackTrace();}
		finally {
			prtl("关闭writer");
			if(writer!=null)
				try {					
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	
	
	
	static void prtl(String str) {
		System.out.println(str);
	}

	static void prt(String str) {
		System.out.print(str);
	}
}
