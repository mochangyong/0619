interface Interface1{//인터페이스를  정의한 부분이다. 인터페이스 안에서 정의되는 변수는 상수로 인식되기 때문에 interVar변수
	int interVar=10;//에 값을 초기화 시키고 있다. 변수에 값을 초기화시키지 않으면 컴파일 오류가 발생한다.
	void interface1Method();
}
class Interface1Impl implements Interface1{//인터페이스를 구현하는 클래스를 정의하는 부분이다. 인테페이스에서 정의한 메소드를 구현하지 않으면 
	@Override//해당 클래스는 추상 클래스로 정의되어야 한다. 또한 인터페이스에 정의된 메소드는 무조건 public 으로 인식되기 때문에 인터페이스에 정의된
	public void interface1Method() {//메소드를 구현 클래스에서 정의해 줄때 접근 제한자를 반드시 public으로 지정해야 한다. 메소드 오버라이딩 규칭에서 
		System.out.println("interface1Method구현");//오버라이딩하는 메소드는 접근 제한자가 좁아질 수 없기 때문이다.
	}
	
}

public class InterfaceTest1 {
/**
 * 인터페이스 구현 테스트
 * 
 */
	public static void main(String[] args) {
		//Interface1 in1 = new Interface1();//인테페이스로는 객체를 생성할 수 없다. 해당 라인의 주석을 제거하면 컴파일 오류가 발생
		
		Interface1Impl in1Impl = new Interface1Impl();//인터체이스를 구현한 클래스로 객체를 생성하는 부분이다.
		System.out.println("in1Impl.interVar =" +in1Impl.interVar);//In1Impl 레퍼런스 변수로 상수를 호출하는 부분이다.
		System.out.println("Interface1.interVar =" +Interface1.interVar);//interface1 인터페이스 타입으로 상수를 호출하는 부분이다.
		in1Impl.interface1Method();//In1Impl레퍼런스 변수로 메소드를 호출하는 부분이다. 
	}
}
