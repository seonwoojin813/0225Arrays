package java0225;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int [] intAr = {100, 765, 77, 14, 29, 99};
		Arrays.sort(intAr);
		 for(int temp : intAr) {
			 System.out.printf("%d\t", temp);
		 }
		 System.out.printf("\n");
		 
		 String [] strAr = {"호날두", "메시", "음바페"};
		 Arrays.sort(strAr);
		 for(String temp : strAr) {
			 System.out.printf(" %s\t ", temp);
		 }
		 System.out.printf(" \n ");
     }

}
