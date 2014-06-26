class Student5{
	String name;
	int number;
	public Student5(String name, int number){
		super();
		this.name=name;
		this.number=number;
	}
	@Override
	public boolean equals(Object obj) {// equals 메소드가 학생의 이름과번호가 같으면 두 학생이 같은 학생으로 판단되도록 equals메소드를 재정의
		Student5 st= null;//하는 부분이다.
				if(obj instanceof Student5){//비교할 객체가 Student5 타입의 객체인지를 확인하는 부분이다.
					st=(Student5)obj;//파라미터로 전송되어 온 객체가 Student5 타입의 객체이면 객체를 Student5 타입으로 다운 캐스팅 해주는 부분이다
				}//Object 클래스에는 name 변수와 number 변수가 정의되어 있지 않기 때문에 값을 비고할 수 없다.
		return (st != null &&st.name.equals(name)&&st.number==number);//비교대상으로 전송되어 온 객체가 Student5타입이고(만약 Student5 타입이
	}//아니었으면 if문이 만족되지 않아서 st변수에 값이 할당되지 않아서 st 값이 계속 null일 것이다. )이름과 번호가 같으면 true를 반환해 주게 처리한부분이다.
	
}
public class EqualsTest2 {
/**
 * Object의 equals 오버라이딩 테스트
 */
	public static void main(String[] args) {
		Student5 st1=new Student5("오정원", 1);
		Student5 st2=new Student5("오정원", 1);
		
		System.out.println("==으로 비교");
		System.out.println("st1 == st2 : "+(st1==st2));
		
		System.out.println("equals로 비교");
		System.out.println("st1.equals(st2) : "+(st1.equals(st2)));//이름과 번호가 같은 두 Student5클래스 객체를 비교하기 때문에 결과는 true를 반환
	}
}
