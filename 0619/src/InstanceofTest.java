
public class InstanceofTest {
/**
 * instanceof 연산자 테스트
 */
	public static void main(String[] args) {
		President president1 = new President();
		
		//president1 객체를 상위 클래스인 Person 클래스 레퍼런스 변수에 참조시킴
		//president1객체가  자동으로  Person 타입으로 UpCasting 되면서 참조됨
		Person1 person1=president1;
		
		//person1 레퍼런스 변수의 참조 값을 President 타입의 레퍼런스 변수에 할당함
		//부모 클래스 타입의 참조 값을 자식 클래스 타입의 참조 변수에 할당하므로 명시적 캐스팅
		if(person1 instanceof President){
			President president2 =(President)person1;
			System.out.println("person1을 President타입으로 캐스팅 성공");
		}else{
			System.out.println("person1을 캐스팅 할 수 없다.");
		}
		//Person 객체 생성
		Person1 person2 = new Person1();
		
		//Person 객체를 President 타입의 레퍼런스 변수에 참조시킴
		if(person2 instanceof President){
			President president3=(President)person2;
			System.out.println("person2를 President 타입으로 캐스팅 성공");
		}else{
			System.out.println("person2를 캐스팅 할 수 없다. ");
		}
		//같은 부모 클래스를 상속받는 클래스 타입끼리 캐스팅
		//Student student =(Student)president2;
	}
}
