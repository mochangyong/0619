abstract class AbClass1{//첫번째 추상 클래스를 정의한 부분이다.
	abstract void abMethod1();
	
}
abstract class AbClass2 extends AbClass1{//두번째 추상클래스를 정의하면서 첫번째 추상 클래스를 상속하고 있다 
	abstract void abMethod2();//이렇게 정의하면 첫번째 추상 클래스에 정의한 추상 메소드가 두번째 추상 클래스에 상속
}
class GeneralClass extends AbClass2{//일반 클래스를 정의하고 있다. 이클래스에서는 첫번째 추상 클래스에 정의된
//추상 메소드와 두번째 추상 클래스에 정의된 추상 메소드를 모두 구현해 주어야 하낟. 
	@Override
	void abMethod1() {
		System.out.println("abMethod1 메소드 구현");
	}

	@Override
	void abMethod2() {
		System.out.println("abMethod2 메소드 구현");
	}
	
	
}
public class AbstractTest2 {
/**
 * 추상 클래스 사이의 상속 테스트
 */
	public static void main(String[] args) {
		GeneralClass gc= new GeneralClass();//객체를 생성하여 메소드를 이용하는 부분이다. 
		
		gc.abMethod1();
		gc.abMethod2();
	}
}
