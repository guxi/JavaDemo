package edu.wust.array;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
//import edu.wust.array.score;

public class simpleArrayLst {
	String[] str={"zero","one","two","three","four"};
	ArrayList<String> myList=new ArrayList<String>();
	int[][] i=new int[3][];
	
	void add(){
		for(String i:str){
			myList.add(i);
		}		
	}	
		
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		simpleArrayLst ListSample =new simpleArrayLst();
		ListSample.add();
		
		ArrayList<String> cloneList=(ArrayList<String>) ListSample.myList.clone();		
		for(int i=0;i<cloneList.size();i++)
			System.out.println(i+":"+cloneList.get(i));
			System.out.println("返回序号："+cloneList.indexOf("one"));	
		
	List<String> features =  Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
	features.forEach(n -> System.out.println(n));
	features.forEach(System.out::println);
	}
	
	
}
