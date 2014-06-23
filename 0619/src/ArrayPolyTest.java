
public class ArrayPolyTest {
/**
 * 배열의 다형성 테스트
 */
	public static void main(String[] args) {
		Person1[] pArray=new Person1[3];//배열 객체를 생성할 때 여러 클래스들이 공통적으로 상속하고 있는 상위 클래스 타입으로 배열의 타입을 지정한 부분
		pArray[0]=new Employee();//배열의 타입으로 지정한 클래스를 상속하고 있는 객체들을 배열에 요소로 추가하는 부분이다.
		pArray[1]=new Student();
		pArray[2]=new President();
		
		for(int i=0; i<pArray.length; i++){//배열을 인덱스 처음부터 끝까지 반복하면서 각 인덱스의 영역에서 레퍼런스하고 있는 객체들의 showSleepStyle()메소드를 호출하는 부분이다.
			pArray[i].showSleepStyle();
		}
	}
}
