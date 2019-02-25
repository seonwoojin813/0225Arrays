package java0225;

public class StringSplit {

	public static void main(String[] args) {
		// Hello.java ��� ���ڿ����� Ȯ����(.������ ���ڸ� ����)�� �����ϱ�
		//���ڿ����� Ư�� ��ȣ�� ��ġ������ ���ڿ��� ���������� �ϴ� ���
		//split �޼ҵ�� lastIndexOf�� substring ������ �̿��մϴ�.
		//split�� �Է��� ��ȣ�� ���ִ��� �ؼ� ���ڿ��� ������ �� String �迭��
		//�����ϴ� �޼ҵ�
		//lastIndexOf�� ���ڳ� ���ڿ��� �ڿ������� ã�Ƽ� ã�� ù��° ��ġ�� ����
		//substring�� ����1���� �����ϸ� ���� ������ ���ڿ��� ����
		//���� 2���� �����ϸ� ù��° ���� ���ĺ���
		//�ι�° ���� �ձ����� ���ڿ��� �����մϴ�.
		
		String filename = "Hello.java";
		//split�� �̿��ؼ� java�� �����ϱ�
		//String [] ar = filename.split("."); �Ǵ� �ֵ��� �ְ� �ȵǴ� �ֵ��� �־�
		//Ư������ ���� ��ȣ�� �ٷ� �翩\�ˤ��ϸ� �ȵǰ� \\�� �ٿ��� �����ؾ� �ϴ� ��찡 �ֽ��ϴ�.
		String [] ar = filename.split("\\.");
		System.out.printf("%s\n", ar[ar.length-1]);
		
		//substring�� �̿��ؼ� java�� �����ϱ�
        int idx = filename.indexOf( '.' );
        String ext = filename.substring(idx+1);
        System.out.printf("%s\n", ext);
        
        //�޼ҵ�� ��ɸ� �ȴٰ� �Ǵ°� �ƴ϶� Ȱ���ؾ���
        
        
        StringBuilder sb = new StringBuilder("Hello");
        System.out.printf("sb:%d\n", sb.hashCode());
        sb.append("StringBuilder");
        System.out.printf("sb:%d\n", sb.hashCode());
        String m = sb.toString(); 
        System.out.printf("m:%s\n", m);
	}
}
