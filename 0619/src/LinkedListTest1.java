import java.util.LinkedList;


public class LinkedListTest1 {
/**
 * LinkedList 테스트
 */
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();//LinkedList 객체를 생성하는 부분이다.
		
		ll.add("SM5");//차례대로 LinkedList 객체에 요소를 추가하는 부분이다.
		ll.add("소나타");
		ll.add("그랜져");
		ll.add("아우디");
		ll.add("에쿠스");
		ll.add(2,"k9");//2번 인덱스에 요소를 추가하는 부분이다.
		ll.set(3, "라노스");//3번 인덱스의 요소를 "라노스"요소로 변경하는 부분이다.
		
		for(int i=0; i<ll.size(); i++){//LinkedList의 요소들을 출력하는 부분이다. 
			System.out.println(ll.get(i));
		}
	}
}
