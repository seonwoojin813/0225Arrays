package java0225;

public class BubbleSort {

	public static void main(String[] args) {
	     //��������
		double [ ] ar = { 30.8,   40.2,  50.3,  10.9,  20.4 };
		//�迭�� ���̸� size�� ����
		double len  = ar.length;
		//�ִ� n-1ȸ������
		for (int i = 0; i < len-1; i=i+1) {
			//������ �����Ϳ� ��
			int flag = 0;
			for (int j = 0; j < len-1-i;  j=j+1) {
				//���� �����Ͱ� �� ũ�� ��ġ����
				if(ar[j] > ar [j+1]) {
					double temp = ar [j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					flag = 1;
				}
			}
			//��ġ �̵��� ������ ����
			if (flag == 0) {
				break;
			}
			//�߰� ����� ���
			for (double imsi : ar) {
				System.out.printf(" %.1f\t ", imsi);
			}
			System.out.printf(" \n ");
		}
	        //����� ���
        	for (double imsi : ar) {
	       	System.out.printf(" %.1f\t ", imsi);
         }
        	System.out.printf(" \n ");
        	
        	
        	//��������
        	String [ ] names = { "�����", "������", "�̿�ǥ", "�⼺��", "��û��" };
    		
    		 len = names.length;
    		
    		for (int i = 0; i < len - 1; i = i + 1) {
    			//������ �����Ϳ� ��
    			int flag = 0;
    			
    			for (int j  = 0; j < len - 1 - i;  j = j + 1) {
    				//���� �����Ͱ� �� ũ�� ��ġ����
    				if(names[j].compareTo(names[j+1]) > 0) {
    					String temp = names[j];
    					names[j] = names[ j + 1 ];
    					names[ j + 1 ] = temp;
    					flag = 1;
    				}
    			}
    			//��ġ �̵��� ������ ����
    			if (flag == 0) {
    				break;
    			}
    			//�߰� ����� ���
    			for (String imsi : names) {
    				System.out.printf(" %s ", imsi);
    			}
    			System.out.printf("\n");
    		}
    	        //����� ���
            	for (String imsi : names) {
    	       	System.out.printf(" %s ", imsi);
             }
            	System.out.printf("\n");
        	
      }
}