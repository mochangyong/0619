class OverridingParent2{
	int money=20;//부모클래스에서 money변수를 int타입으로 정의한 부분이다.
	void parentMethod(){
		System.out.println("parent method");
	}
}
class OverridingChild2 extends OverridingParent2{
	String money="20원";//자식 클래스에서 money변수를 String 타입으로 다시 정의한 부분이다.
	void parentMethod(){
		System.out.println("overriding method");
	}
}
public class OverridingTest2 {
/**
 * 변수 재정의 테스트
 */
	public static void main(String[] args) {
		OverridingChild2 oc2= new OverridingChild2();//자식 클래스 객체를 생성한 부분이다.
		oc2.money="30원";//자식 클래스에서 money변수를 String타입으로 정의했기 때문에 money변수에 String 타입의 테이터를 할당하고 있다.
//		oc2.money=30;//부모 클래스에서 정의한 money변수 타입의 테이터를 변수에 할당하는 부분이다. 이부분을 주석을 제게하면 컴파일 오류가 발생한다.
		System.out.println("oc2.money =" +oc2.money);//money 변수값을 출력하는 부분이다
	}
}
