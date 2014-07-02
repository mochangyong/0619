import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class VectorTest {
/**
 * Vector 테스트
 */
	public static void main(String[] args) {
		Vector<String> vt=new Vector<String>();//Vector객체를 생성하는 부분이다.
		vt.add("서울");//Vector객체에 요소를 추가하는 부분이다.
		vt.add("춘천");
		vt.add("광주");
		vt.add("대구");
		vt.add("부산");
		
		for(int i=0; i<vt.size(); i++){//Vector객체에 저장되어 있는 요소들을 출력하는 부분이다.
			System.out.println("vt.get("+i+")="+vt.get(i));
		}
		System.out.println();
		
		System.out.println("Iterator로 요소 출력");
		Iterator<String> it = vt.iterator();
		while(it.hasNext()){//Vector 객체 요소들을 Iterator를  이용하여 출력하는 부분이다.
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println("Enumeration으로 요소 출력");
		Enumeration<String> e = vt.elements();
		while(e.hasMoreElements()){//Vector 객체의 요소들을 Enumeration을 이용해서 출력하는 부분이다. Enumeration 인터페이스는 Iterator의 구
			System.out.println(e.nextElement());//버전으로 Iterator와 같은 기능을 제공해 준다. 
		}
	}
}
