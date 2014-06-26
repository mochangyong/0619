class Student4{
	String name;
	int number;
	public Student4(String name,int number){//Student3클래스의 각 멤버 변수 값을 초기화 시키는 생성자를 정의하는 부분이다.
		super();
		this.name=name;
		this.number = number;
	}
}
public class EqualsTest1 {
/**
 * Object의 equals 테스트
 */
	public static void main(String[] args) {
		Student4 st1 = new Student4("오정원", 1);//name 변수와 number변수 값을 동일하게 지정하면서 Student3 객체를 두개 생성한 부분이다.
		Student4 st2 = new Student4("오정원", 1);
		
		System.out.println("==으로 비교");
		System.out.println("st1 == st2 : "+(st1==st2));//두 객체를 비교 연산자 (==)로 비교하기 때문에 두변수의 레퍼런스 값을 비교하게 된어
		//결과는 false를 반환한다.
		System.out.println("equals로 비교");
		System.out.println("st1.equals(st2) : "+(st1.equals(st2)));//Object 클래스에 정의되어 있는 equals 메소드는 "=="연산자와 같은
		//기능을 제공해 주기 때문에 결과는 false를 반환한다.
		
	}
}
