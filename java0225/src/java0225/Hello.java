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
		//�빮�ڷ� �ٲ㺸��
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
    
		//�ҹ��ڷ� �ٲ㺸��  
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
		
		
       //String.format �޼ҵ�� System.out.printf �� ������ ������� ���
       //������� �ʰ� ���ڿ��� �����Ѵٴ� ���� �ٸ��ϴ�.
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
		//dae = dae + temp; ----> +�� �޸� �Һ� ���ϱ� ������ format���� �ٲ㼭
		dae=String.format("%s%c", dae, temp);
			}else {
			//dae = dae+ch;
			dae=String.format("%s%c", dae, ch);
			}
		}
		System.out.printf("�빮��:%s\n", dae);
		
		//dae��� ���ڿ��� E�� ��ġ�� Ȯ��
		int idx = dae.indexOf( 'E' );
		System.out.printf("E�� ��ġ:%d\n", idx);
		
		//dae��� ���ڿ��� K�� ��ġ�� Ȯ��
		idx = dae.indexOf( 'K' );
		System.out.printf("K�� ��ġ:%d\n", idx);
		//������ ������ ���� ������-1
		
		
		/*
		//��й�ȣ ����� ����
		String password = "SunWooJin1234!"; 	
		int len = password.length();
		int dae = 0;
		int so = 0;
		int su =0;
		int etc = 0;
		//���ڿ� ��ȸ
		for (int i=0; i<len; i=i+1) {
	    	   char ch = password.charAt(i);
	    	   //�빮��Ȯ��
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
			   System.out.printf("��밡���� ��й�ȣ�Դϴ�. \n");
		   }
		   else {
			   System.out.printf("���Ұ����� ��й�ȣ�Դϴ�. \n");
	}		
	*/
	}
}
