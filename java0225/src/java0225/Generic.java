package java0225;

public class Generic<T> {

}
/*
Generic <int> t1 = new Generic<int>();
=> 제너릭의 자료형은 Reference 타입만 가능
=>int 는 value형 이라서 안됩니다.
=>Integer로 바꿔야해

Generic <Integer> t1 = new Generic<Integer>();

public class Generic<T, V> {
//2개일때
}
Generic1  <String, Integer> t2 = new Generic1<String, Integer>();
//<String, Integer> 여기 이름은 아무거나 바꿔도 상관없음
*/