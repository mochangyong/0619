
public class OverridingTest3 {
/**
 * 두 번째 오버라이딩 테스트
 */
	public static void main(String[] args) {
		Employee employee = new Employee();
		Person1 person = employee;
		
		System.out.println("employee.x =" +employee.x);//변수 호출은 컴파일 시에 결정되기 때문에 Employee 클래스에서 정의한 x변수 값이 호출된다.
		System.out.println("person.x = " +person.x);//Person 클래스에서 정의된 x변수 값이 호출 된다.
		
		employee.sleep();//메소드 호출은 런타임 시 결정되므로 레퍼런스 변수 타입에 상관없이 항상 heap 영역에 실질적으로 생성되어
						//있는 객체의 메소드가 호출된다. 즉, 오버라이딩된 메소드가 호출된다.
		person.sleep();//역시 최종적으로 오버라이딩된 Employee클래스의 메소드가 호출된다.
	}
}
