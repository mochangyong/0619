abstract class Vehicle{//Vehicle 추상 클래스를 정의한 부분이다.
	abstract void move();
}
class Car extends Vehicle{//Car 클래스를 정의한 부분이다.

	@Override
	void move() {
		System.out.println("차도로 다닌다.");
	}
	
}
class Ship extends Vehicle{//Ship클래스를 정의한 부분이다.

	@Override
	void move() {
		System.out.println("수로로 떠난다.");
	}
	
}
class Plane extends Vehicle{//Plane클래스를 정의한 부분이다.

	@Override
	void move() {
		System.out.println("하늘로 다닌다.");
	}
	
}
class VehicleUse{//VehicleUse 클래스에 Vehicle타입의 파라미터 값을 받는 getMoveStyle 메소드를 정의
	void getMoveStyle(Vehicle vehicle){
		vehicle.move();
	}
}
public class AbstractTest3 {
/**
 * 추상 클래스의 다형성 테스트
 */
	public static void main(String[] args) {
		Car car=new Car();//프로그램 실행에 팔요한 객체들을 생성한 부분이다.
		Ship ship= new Ship();
		Plane plane = new Plane();
		VehicleUse vUse = new VehicleUse();
		
		vUse.getMoveStyle(car);//각 객체를 파라미터로 전송하면서 getMoveStyle메소드를 호출하는
		vUse.getMoveStyle(ship);//부분이다. 메소드가 실행되면 각각 클래스에 정의되어 있는 
		vUse.getMoveStyle(plane);//move 메소드가 호출
	}
}
