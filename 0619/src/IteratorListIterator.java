import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class IteratorListIterator {
/**
 * Iterator와 ListIterator 테스트
 */
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();//소스로 사용할 ArrayList 객체를 생성한 부분이다.
		
		al.add("축구");//ArrayList 객체에 요소를 추가하는 부분이다.
		al.add("야구");
		al.add("레슬링");
		al.add("권투");
		al.add("이종격투기");
		
		System.out.println("Iterator를 이용한 출력");
		Iterator<String> it = al.iterator();//Iterator 객체를 생성하는 부분이다. Iterator 객체는 전 방향으로만 이동하면서 요소를 처리할 수 있다.
		while(it.hasNext()){//Iterator 객체가 전 방향으로 이동하면서 요소들을 출력하는 부분이다.
			System.out.println(it.next());
		}
		System.out.println();
		
		System.out.println("ListIterator를 이용한 전 방향 출력");
		ListIterator<String> lt=  al.listIterator();//ListIterator 객체를 생성하는 부분이다.
		while(lt.hasNext()){//ListIterator 객체가  전 방향으로 이동하면서 요소를 출력해 주는 부분이다. hasNext() 메소드는 다음 요소가 존재
			//하는지를 판단해 주는 메소드이며 , next()메소드는 다음 요소를 반환해 주는 메소드이다.
			System.out.println(lt.next());
		}
		System.out.println();
		
		System.out.println("ListIterator를 이용한 후 방향 출력");
		while(lt.hasPrevious()){//ListIterator 객체가 후 방향으로 이동 하면서 요소를 출력해 주는 부분이다.
			System.out.println(lt.previous());
		}
	}
}
