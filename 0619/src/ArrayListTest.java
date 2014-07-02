import java.util.ArrayList;


public class ArrayListTest {
/**
 * ArrayList 테스트
 */
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();//제네릭 기능을 사용해서 ArrayList 객체에 String 타입의  객체 요소만 추가할 수 있도록
		//ArrayList 객체를 생성한 부분이다. 
		
		array.add("korea");//ArrayList 객체에 요소를 추가하는 부분이다. 
		array.add("japan");
		array.add("america");
		array.add("britain");
		
		System.out.println("ArrayList에 요소 추가하고 출력");
		for( int i=0; i<array.size(); i++){//ArrayList객체에 존재하는 요소들을 출력하는 부분이다.
			System.out.println(array.get(i));
		}
		System.out.println();
		System.out.println();
		
		array.remove(0);//0번  인덱스에 저장되어 있는 요소를 제거하는 부분이다.
		array.remove("japan");//"japan" 요소를 제거하는 부분이다.
		
		System.out.println("ArrayList에서 요소 제거후 출력");
		for ( int i =0; i<array.size(); i++){//요소를 제거한 후의 ArrayList 객체의 요소를 출력하는 부분이다.
			System.out.println(array.get(i));
		}
	}
}
