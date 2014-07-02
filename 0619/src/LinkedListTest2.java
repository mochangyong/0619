import java.util.LinkedList;
import java.util.Queue;


public class LinkedListTest2 {
/**
 * Queue 테스트
 */
	public static void main(String[] args) {
		Queue<String> queue= new LinkedList<String>();//Queue 타입으로 LinkedList객체를 생성하는 부분이다.
		
		queue.offer("강남구");//LinkedList 객체에 요소를 추가하는 부분이다. 
		queue.offer("노원구");
		queue.offer("은평구");
		queue.offer("도봉구");
		queue.offer("서초구");
		
		while(!queue.isEmpty()){//LinkedList 객체에 추가되어 있는 요소를 출력하는 부분이다. 추가한 순서대로 요소가 출력된다.
			System.out.println(queue.poll());
		}
	}
}

	