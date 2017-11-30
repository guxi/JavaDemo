package edu.wust.operators;
/**
 * 
 * @author yy
 *
 */
public class controlling {

	public static void main(String[] args) {
//		prtl("----if / else------");
//		ifElseTest(56);
//		prtl("----switch------");
//		daysInMonth(6);
//		prtl("----乘法表------");		
		MultiTable();
//		prtl("----逗号运算------");
//		comma();
//		prtl("---- while ------");
//		whileTest();
//		prtl("----乘法表 break and lable------");
//		MultiTableUseBreak();
//		prtl("---- continue ------");		
//		continueTest();
	}
	
	/**
	 * if / else 分数分级
	 * @param score
	 */	
	static void ifElseTest(int score) {
		char grade;
		if (score >= 90) {	grade = 'A';} 
		else if (score >= 80) {grade = 'B';} 
		else if (score >= 70) {grade = 'C';} 
		else if (score >= 60) {grade = 'D';} 
		else {grade = 'E';}
		prtl("Grade = " + grade);
	}

	/**
	 * switch 
	 * @param month
	 */
	
	static void daysInMonth(int month) {
		int days;
		switch (month) {
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 31;
		}
		prtl(month + "月：" + days);
	}
	
	/**
	 *  乘法表
	 */
	public static void MultiTable() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++)
				prt("  " + i + "*" + j + "=" + i * j);
			prtl("");
		}
	}
	
	/**
	 * 逗号运算	
	 */
	public static void comma() {
		for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
			prtl("i= " + i + " j= " + j);
		}
	}
	
	
	/**
	 * while
	 */
	static void whileTest() {
		int i=1, sum1=0;
 		while(i<=10) {
      	     sum1+=i;
      	     i++;        
       }
      prtl("sum1="+sum1);
      
      int j=1, sum2=0;
      while(true) {
		     if(j>10)break;
   	     sum2+=j++;	
    }
      prtl("sum2="+sum2);

	}
	/**
	 *  乘法表（break and lable）
	 */
	public static void MultiTableUseBreak() {
		for (int i=1; i<=9;i++) {
            for (int j=1; j<=9;j++){
                if (j > i)  break;
               prt("  "+i+"*"+j+"="+i*j);
            }
            prtl("");
	     }
		prtl("use lable:");
			outer:      //标号的语法	
			for (int i=1; i<=9;i++) {
	          for (int j=1; j<=9;j++){
	               if (j > i)   break;
	               if (i==6)  break outer; 
	               
	               prt("  "+i+"*"+j+"="+i*j);
	            }
	            prtl("");

		}
	}
	 /**
	  *     continueTest
	  */
	public static void continueTest() {
		  for (int i=2; i<=9; i+=2)
		    {
			     if (i==6)  continue;
		        prtl(""+i*i);
		     }

		prtl("MultiTable use continue and lable:");
		outer: 	  
		      for (int i=1; i<10; i++){
	 	        inner: 
	 	        for (int j=1; j<10; j++){
	 	            if (i<j){
			           prtl("");                       
	 	              continue outer;
	 	            }
			          prt("  "+i+"*"+j+"="+i*j);		     
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
