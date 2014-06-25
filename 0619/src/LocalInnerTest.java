class OuterClass3{
	private int outerVar =30;//OuterClass클래스의 멤버 변수를 정의한 부분이다.
	private static int staticOuterVar =40;
	void printInfo(){//외부 클래스에 printInfo()라는 메소드를 정의한 부분이다.
		int localVar=3;//메소드 안에 로컬변수를 정의한 부분이다.
		final int finalLocal = 4;
		class LocalInnerClass{//메소드 안에 로컬 내부 클래스를 정의한 부분이다. 로컬 내부 클래스는 메소드 내에서만 인식된다.
			void displayInfo(){//내부 클래스에 각 정보를 출력할 displayInfo라는 메소드를 정의한 부분이다.
				System.out.println("outerVar ="+outerVar);//외부 클래스의 변수를 출력하는 부분이다. 
				System.out.println("staticOuterVar="+staticOuterVar);
				//System.out.println("localvar =" +localVar);//로컬 내부 클래스에서 로켤 변수를 사용할 수는 없다. 로컬 변수는 메소드 실행이 끝나면
				//자동으로 메모리에서 소멸되기 때문이다. 주석을 해제하면 컴파일 오류가 발생한다.
				System.out.println("fimalLocal =" +finalLocal);//final이 지정된 상수는 상수 영역에 별도로 저장되기 때문에 로컬 내부 클래스에서 사용할수있다.
			}
		}
		LocalInnerClass lc = new LocalInnerClass();//로컬 내부 클래스 객체를 생성하고 displayInfo()메소드를 호출하는 부분이다.
		lc.displayInfo();
	}
}
public class LocalInnerTest {
/**
 * 로컬 내부 클래스 테스트 
 */
	public static void main(String[] args) {
		OuterClass3 oc = new OuterClass3();//외부 클래스 객체를 생성하고 외부 클래스의 메소드를 호출하는 부분이다.
		oc.printInfo();
	}
}
