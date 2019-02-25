package java0225;

enum MultiMedia{
	None, Text, Video, Audio;
	//Static멤버가 기울어져서 만들어짐
}


public class EnunTest {

	public static void main(String[] args) {
		//Multimedia 타입으로 변수를 선언하고 값을 할당
		//Multimedia에 설정된 값만 대입이 가능
		MultiMedia m = MultiMedia.Audio;
		//출력을 하면 이름 그대로를 출력`
		System.out.println(m);
		//인덱스 출력
		System.out.println(m.ordinal());
        //Audio가 0,1,2,3번째 위치해서 
	}

}
