package edu.wust.polymorphic;

public class B1 extends A1{
	  int x=100;
	    int doPlus(){
			x=x+2;
	        x+=  super.doPlus()+super.x  ;
	        return x;
	    }
	    
	public static void main(String[] args) {
		B1 b=new B1();
		System.out.println(b.doPlus());
		//System.out.println(b.doPlus()+b.getClass().getName());	
	  
	}
}
