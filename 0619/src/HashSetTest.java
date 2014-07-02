import java.util.HashSet;
import java.util.Iterator;


public class HashSetTest {
/**
 * HashSet 테스트
 */
	public static void main(String[] args) {
		HashSet hs = new HashSet();//HashSet 객체를 생성한다. 
		
		if(hs.add("korea")){//HashSet 객체에 korea라는 문자열을 추가하면서 추가가 성공했는지 실패했는지 결과 메시지를 출력하는 부분이다.
			System.out.println("첫 번째 korea 추가 성공");//add 메소드에 의해서 요소가 성공적으로 추가되면 true가, 추가가
		}else{											//실패하면 false가 반환 된다.
			System.out.println("첫번째 korea 추가 실패 ");
		}
		if(hs.add("japan")){//japan 문자열 요소를 추가하는 부분이다.
			System.out.println("japan 추가 성공");
		}else{
			System.out.println("japan 추가 실패 ");
		}
		if(hs.add("america")){//america 문자열 요소를 추가하는 부분이다.
			System.out.println("america 추가 성공");
		}else{
			System.out.println("america 추가 실패");
		}
		if(hs.add("britain")){//britain 문자열을 추가하는 부분이다. 
			System.out.println("britain 추가 성공");
		}else{
			System.out.println("britain 추가 실패");
		}
		if(hs.add("korea")){//korea 문자열을 한 번 더 추가하는 부분이다. 이부분에서는 이미 HashSet 객체에 korea 문자열이 추가되어 
			System.out.println("두 번째 korea 추가 성공");//있으므로 추가가 실패되어 add메소드에 의해서 false가 반환 된다.
		}else{
			System.out.println("두 번째 korea 추가 실패 ");
		}
		
		Iterator it = hs.iterator();//Iterator 객체를 생성하는 부분이다. Iterator 인터페이스는 특정 컬렉션 요소에 접근해서 반복적으로 작업을
		//할 때 편리한 기능을 제공한다. 1.Iterator 인터페이스의 주요 메서드2.hasNext(): 다음 요소가 있는 지를 판단하는 메소드
		//3.next(): 다음 요소를 반환하는 메소드
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
