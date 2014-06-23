abstract class AbstractClass{
	//변수 선언
	int age;
	
	//구현된 메소드
	void generalMethod(){
		System.out.println("일반 메소드");
	}
	//추상 메소드
	abstract void abstractMethod();//추상 메소드를 정의하는 부분이다 메소드 구현부를 정의하지 않았을때는 반드시 메소드 
	//앞에 abstract를 지정해서 추상 메소드로 정의해야 한다. 또한 추상 메소드를 하나라도 포함하고 있는 클래스는 클래스
	//는 클래스 정의부에 abstract예약어를 지정하여 추상 클래스로 정의되어야 한다. 추상 클래스 내에는 추상 메소드뿐
	//만 아니라 변수나 구현된 메소드도 정의할수 있다
}
class AbstractChildClass extends AbstractClass{//추상클래스를 상속하는 지식클래스를 정의하는 부분이다. 
//추상 클래스를 상속받는 자식 클래스는 추상 클래스에 정의되어 있는 추상 메소드를 반드시 구현해 주어야 한다. 
//추상 클래스에서 상속받은 추상 메소드를 구현하지 않으면 자식 클래스 앞에도 abstract키워드를 지정해서 추상 클래스로 지정해야한다.	
	@Override
	void abstractMethod() {//추상 클래스에서 상속받은 추상 메소드를 구현하는 부분이다.
		System.out.println("추상 메소드 구현");
	}
	
}
public class AbstractTest1 {
/**
 * 추상클래스로 객체 생성하기
 */
	public static void main(String[] args) {
		//추상클래스로 객체 생성
		//AbstractClass ac = new AbstractClass();//추상 클래스를 사용해서 객체를 생성하는 부분이다. 추상 클래스는 구현이 되지
		//않는 메소드가 존재하므로 즉 환전한 클래스가 아니므로 추상 클래스를 사용해서 객체를 생성할 수 없다.
		//자식클래스로 객체 생성
		AbstractChildClass acc = new AbstractChildClass();//추상클래스를 상속받아서 추상 메소드를 완전히 구현한 자식 클래스로는 객체를 생성할수 있다.
		acc.abstractMethod();//추상 클래스에서 상속받은 변수나 메소드를 사용하는 부분이다. 
		System.out.println(acc.age);
		acc.generalMethod();
	}
}
