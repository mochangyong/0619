class Student7{
	String name;
	int number;
	public Student7(String name, int number){
		super();
		this.name=name;
		this.number=number;
	}
	@Override
	public boolean equals(Object obj) {
		Student7 st = null;
		if(obj instanceof Student7){
			st=(Student7)obj;
		}
		return (st != null &&st.name.equals(name)&&st.number == number);
	}
	@Override
	public String toString() {
		return "이름:"+name+",번호:"+number;
	}
	
}
public class ToStringTest2 {
/**
 * Object의 toString()오버라이딩 테스트
 * @param args
 */
	public static void main(String[] args) {
		Student7 st1= new Student7("오정원", 1);//Student6클래스를 이용해서 객체 두개를  생성하는 부분이다.
		Student7 st2= new Student7("김영아", 2);
		
		System.out.println("st1.toString()");
		System.out.println(st1);//st1객체의 toString()메소드를 호출하는 부분이다. 객체가 system.out.println()메소드의 파라미터 값으로 지정
		//되거나 + 연산이 되면 해당 객체의 toString()메소드가 자동으로 호출된다.
		System.out.println("st2.toString()");
		System.out.println(st2);//st2의 toString() 메소드를 호출하여 반환 값을 출력하는 부분이다.ㄴ
		
	}
}
