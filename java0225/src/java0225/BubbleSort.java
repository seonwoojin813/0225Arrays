package java0225;

public class BubbleSort {

	public static void main(String[] args) {
	     //버블정렬
		double [ ] ar = { 30.8,   40.2,  50.3,  10.9,  20.4 };
		//배열의 길이를 size에 저장
		double len  = ar.length;
		//최대 n-1회전동안
		for (int i = 0; i < len-1; i=i+1) {
			//인접한 데이터와 비교
			int flag = 0;
			for (int j = 0; j < len-1-i;  j=j+1) {
				//앞의 데이터가 더 크면 위치변경
				if(ar[j] > ar [j+1]) {
					double temp = ar [j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					flag = 1;
				}
			}
			//위치 이동이 없으면 종료
			if (flag == 0) {
				break;
			}
			//중간 결과를 출력
			for (double imsi : ar) {
				System.out.printf(" %.1f\t ", imsi);
			}
			System.out.printf(" \n ");
		}
	        //결과를 출력
        	for (double imsi : ar) {
	       	System.out.printf(" %.1f\t ", imsi);
         }
        	System.out.printf(" \n ");
        	
        	
        	//버블정렬
        	String [ ] names = { "손흥민", "박지성", "이영표", "기성용", "이청용" };
    		
    		 len = names.length;
    		
    		for (int i = 0; i < len - 1; i = i + 1) {
    			//인접한 데이터와 비교
    			int flag = 0;
    			
    			for (int j  = 0; j < len - 1 - i;  j = j + 1) {
    				//앞의 데이터가 더 크면 위치변경
    				if(names[j].compareTo(names[j+1]) > 0) {
    					String temp = names[j];
    					names[j] = names[ j + 1 ];
    					names[ j + 1 ] = temp;
    					flag = 1;
    				}
    			}
    			//위치 이동이 없으면 종료
    			if (flag == 0) {
    				break;
    			}
    			//중간 결과를 출력
    			for (String imsi : names) {
    				System.out.printf(" %s ", imsi);
    			}
    			System.out.printf("\n");
    		}
    	        //결과를 출력
            	for (String imsi : names) {
    	       	System.out.printf(" %s ", imsi);
             }
            	System.out.printf("\n");
        	
      }
}