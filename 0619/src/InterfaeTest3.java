interface In1{
	int x = 10;
	void in1Method();
}

interface In2{
	int x =20;
	void in1Method();
	void in2Method();//두번째 인터페이스에서 새로운 메소드를 하나 더 정의한 부분이다.
}

interface In3 extends In1,In2{//세번째 인터체이스를 정의한 부분이다. 자바에서 인터페이스는 다중상속이 가능하다.
	
}
class ExtendsTest1 implements In3{//In3 인터페이스를 구현하는 클래스를 정의한 부분이다. In3 인터페이스가 In1 인터페이스와 in2인테페이스를
//상속받았기 때문에 ExtendsTest1클래스는 In1인터페이스와 In2 인터페이스에서 정의된 모든 메소드를 구현해 주어야 한다.
	@Override
	public void in2Method() {
		
	}

	@Override
	public void in1Method() {
		
	}
	
}
public class InterfaeTest3 {
/**
 * 인터페이스 사이의 상속
 */
	public static void main(String[] args) {
		ExtendsTest1 et = new ExtendsTest1();
		
		et.in1Method();//ExtendsTest 클래스에서 구현한 메소드를 호출하는 부분이다.
		et.in2Method();
		
		System.out.println(In1.x);//x상수를 In1인터페이스와 In2 인터페이스에서 모두 정의하였지만 상수는 인터페이스에 속하므로 해당 인터체이스
		System.out.println(In2.x);//이름을 통해서 상수에 접근할 수 있다. 
		
	}
}

