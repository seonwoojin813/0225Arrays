package java0225;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
     /*
		String str = "Hello";
      int length = str.length();
      for(int i=0; i<length; i=i+1) {
    	  char ch = str.charAt(i);
    	  System.out.printf("%c", ch);
    	    }
    	    */
		//대문자로 바꿔보기
	/*
		String str = "Hello";
	   int length = str.length();
       String upper = "  ";
       for (int i=0; i<length; i=i+1) {
    	   char ch = str.charAt(i);
    	   if(ch >= 'a'&&ch<='z') {
    		   char x = (char)(ch-32);
    		   upper = upper+x;
    	   }
    	   else {
    		   upper =upper+ch;
    	   }
       }  
       System.out.printf("%s", upper);
      */
    
		//소문자로 바꿔보기  
		/*
		String str = "Hello";
		   int length = str.length();
		   String upper = "  ";
		   for (int i=0; i<length; i=i+1) {
	    	   char ch = str.charAt(i);
	    	   if(ch >= 'A'&&ch <='Z') {
	    		   char x = (char)(ch+32);
	    		   upper = upper+x;
	    	   }
	    	   else {
	    		   upper =upper+ch;
	    	   }
	       }  
	       System.out.printf("%s", upper);
	   */
		
		
       //String.format 메소드는 System.out.printf 와 동일한 방법으로 사용
       //출력하지 않고 문자열로 리턴한다는 점이 다릅니다.
		int x = 100;
		int y = 200;
		String msg = String.format("x:%d y:%d\n", x, y);
		System.out.printf("%s", msg);
		
		String str = "Hello";
		int length = str.length();
		String dae = "";
		for(int i=0; i<length; i=i+1) {
		char ch = str.charAt(i);
		if(ch >= 'a' && ch <= 'z') {
		char temp = (char)(ch - 32);
		//dae = dae + temp; ----> +는 메모리 소비가 심하기 때문에 format으로 바꿔서
		dae=String.format("%s%c", dae, temp);
			}else {
			//dae = dae+ch;
			dae=String.format("%s%c", dae, ch);
			}
		}
		System.out.printf("대문자:%s\n", dae);
		
		//dae라는 문자열의 E의 위치를 확인
		int idx = dae.indexOf( 'E' );
		System.out.printf("E의 위치:%d\n", idx);
		
		//dae라는 문자열의 K의 위치를 확인
		idx = dae.indexOf( 'K' );
		System.out.printf("K의 위치:%d\n", idx);
		//없으면 음수가 나옴 보통은-1
		
		
		/*
		//비밀번호 만들어 보기
		String password = "SunWooJin1234!"; 	
		int len = password.length();
		int dae = 0;
		int so = 0;
		int su =0;
		int etc = 0;
		//문자열 순회
		for (int i=0; i<len; i=i+1) {
	    	   char ch = password.charAt(i);
	    	   //대문자확인
	    	   if(ch >= 'A'&&ch<='Z') {
	    		   dae = dae + 1;
	    		   }
	    	   else if(ch >='a' && ch<='z') {
                          so =so + 1;	    		   
	    	   }  else if(ch >='0' && ch<='9') {
                   su =su + 1;	    	
	       }  else {
	    	   etc = etc + 1;  
	       }

	   	}
		   if( dae > 0 && so > 0 && su > 0 && etc > 0) {
			   System.out.printf("사용가능한 비밀번호입니다. \n");
		   }
		   else {
			   System.out.printf("사용불가능한 비밀번호입니다. \n");
	}		
	*/
	}
}
