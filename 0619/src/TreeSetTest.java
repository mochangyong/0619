import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetTest {
/**
 * TreeSet테스트
 */
	public static void main(String[] args) {
		TreeSet hs = new TreeSet();
		
		if(hs.add("korea")){
			System.out.println("첫번째 korea 추가 성공");
		}else{
			System.out.println("첫 번째 korea 추가 실패 ");
		}
		if(hs.add("japan")){
			System.out.println("japan 추가 성공");
		}else{
			System.out.println("japan 추가 실패 ");
		}
		if(hs.add("america")){
			System.out.println("america 추가 성공");
		}else{
			System.out.println("america 추가 실패");
		}
		if(hs.add("britain")){
			System.out.println("britain 추가 성공");
		}else{
			System.out.println("britain 추가 실패");
		}
		if(hs.add("korea")){
			System.out.println("두 번째 korea 추가 성공");
		}else{
			System.out.println("두 번째 korea 추가 실패");
		}
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//상단의 코드는 HashSetTest 코드에서 HashSet 부분을 TreeSet 으로만 변경한 부분이다. TreeSet 클래스에 정렬 기능이 제공되기
		//때문에 출력 결과를 보면 요소들이 순서대로 출력되는 것을 확인할 수 있다
		
	}
}
