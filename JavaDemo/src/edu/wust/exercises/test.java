package edu.wust.exercises;


import edu.wust.exercises.services.ExcelService;

import java.util.List;

//import java.awt.List;

public class test {

	public static void main(String[] args) {
		
		
		ExcelService ges=new ExcelService("C:\\Course\\数据库技术\\学期\\2017-2018（1）\\平时成绩登记表（数据库 工业工程2015级（精益）1班）.xls");
		//ExcelService ges=new ExcelService("C:\\Course\\数据库技术\\学期\\2011-2012(1)\\平时成绩登记表.xls");
		ges.saveToDB();
		
		
		
		
		
		//int i=ges.saveCourseInfo();
		//System.out.println(i);
//		List<student> list=ges.getStudents();
//		courseInfo ci=ges.getCInfo();	
//		
//		System.out.println(ci.toString());
//		System.out.println(list.size());
//		for(student s:list) {
//		System.out.println(s.toString());	
//		}		
	}

}
