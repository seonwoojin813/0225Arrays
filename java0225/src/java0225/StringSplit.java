package java0225;

public class StringSplit {

	public static void main(String[] args) {
		// Hello.java 라는 문자열에서 확장자(.이후의 문자만 추출)만 추출하기
		//문자열에서 특정 기호나 위치이후의 문자열을 가져오고자 하는 경우
		//split 메소드는 lastIndexOf와 substring 조합을 이용합니다.
		//split은 입력한 기호를 기주느로 해서 문자열을 분할한 후 String 배열로
		//리턴하는 메소드
		//lastIndexOf는 문자나 문자열을 뒤에서부터 찾아서 찾은 첫번째 위치를 리턴
		//substring은 정수1개를 대입하면 정수 이후의 문자열을 리턴
		//정수 2개를 대입하면 첫번째 정수 이후부터
		//두번째 정수 앞까지의 문자열을 리턴합니다.
		
		String filename = "Hello.java";
		//split을 이용해서 java만 추출하기
		//String [] ar = filename.split("."); 되는 애들이 있고 안되는 애들이 있어
		//특수문자 들은 기호를 바로 사여\ㅛㅇ하면 안되고 \\를 붙여서 분할해야 하는 경우가 있습니다.
		String [] ar = filename.split("\\.");
		System.out.printf("%s\n", ar[ar.length-1]);
		
		//substring을 이용해서 java만 추출하기
        int idx = filename.indexOf( '.' );
        String ext = filename.substring(idx+1);
        System.out.printf("%s\n", ext);
        
        //메소드는 기능만 안다고 되는게 아니라 활용해야해
        
        
        StringBuilder sb = new StringBuilder("Hello");
        System.out.printf("sb:%d\n", sb.hashCode());
        sb.append("StringBuilder");
        System.out.printf("sb:%d\n", sb.hashCode());
        String m = sb.toString(); 
        System.out.printf("m:%s\n", m);
	}
}
