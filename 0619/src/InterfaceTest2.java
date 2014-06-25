class Vehicle1{//운송 수단에 대해서 정의하는 Vehicle1 클래스를 정의한 부분이다
	void move(){
		System.out.println("움직인다.");
	}
}
interface Flyable{//나는 기능을  정의하는 Flyable 인터페이스를 정의한 부분이다.
	void fly();
}
class Interface2Impl extends Vehicle1 implements Flyable{
//Vehicle 클래스를 상속받고 Flyable 인터페이스를 구현하는 클래스를 정의한 부분이다.
	@Override
	public void fly() {//인터페이스에 정의되어 있는 fly()메소드를 구현한 부분이다.
		System.out.println("난다.");
	}
}
public class InterfaceTest2 {
/**
 * 클래스 상속과 동시에 인터페이스 구현
 */
	public static void main(String[] args) {
		Interface2Impl in2Impl = new Interface2Impl();//클래스에서 상속받은 베소드와 인터페이스에서 정의한 메소드를 사용하는 부분이다.
		in2Impl.fly();
		in2Impl.move();
	}
}
