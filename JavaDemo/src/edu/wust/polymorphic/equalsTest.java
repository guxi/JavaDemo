package edu.wust.polymorphic;

public class equalsTest {

	public static void main(String[] args) {
		Student s1=new Student(1,"dgfhdsgh");
		Student s2=new Student(1,"li");
		//s2=s1;
		String ss1="1";
		String ss2="1";
		
		System.out.println(""+s1.equals(s2) +";"+ ss1.equals(ss2));
	}
}
