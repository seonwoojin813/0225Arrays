package java0225;

enum MultiMedia{
	None, Text, Video, Audio;
	//Static����� �������� �������
}


public class EnunTest {

	public static void main(String[] args) {
		//Multimedia Ÿ������ ������ �����ϰ� ���� �Ҵ�
		//Multimedia�� ������ ���� ������ ����
		MultiMedia m = MultiMedia.Audio;
		//����� �ϸ� �̸� �״�θ� ���`
		System.out.println(m);
		//�ε��� ���
		System.out.println(m.ordinal());
        //Audio�� 0,1,2,3��° ��ġ�ؼ� 
	}

}
