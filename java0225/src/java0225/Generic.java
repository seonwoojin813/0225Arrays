package java0225;

public class Generic<T> {

}
/*
Generic <int> t1 = new Generic<int>();
=> ���ʸ��� �ڷ����� Reference Ÿ�Ը� ����
=>int �� value�� �̶� �ȵ˴ϴ�.
=>Integer�� �ٲ����

Generic <Integer> t1 = new Generic<Integer>();

public class Generic<T, V> {
//2���϶�
}
Generic1  <String, Integer> t2 = new Generic1<String, Integer>();
//<String, Integer> ���� �̸��� �ƹ��ų� �ٲ㵵 �������
*/