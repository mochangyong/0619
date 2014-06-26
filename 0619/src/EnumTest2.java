class Student2{
	SchoolType school;//school 변수의 타입을 SchoolTyoe이라는 enum 형식으로 지정한다.
	public Student2(SchoolType school){//student2 클래스의 생성자를 정의한 부분이다. 파라미터 변수인 school 변수의 타입을 SchoolType으로 지정한다. 이렇게 
		this.school=school;//되면 인자 값은 SchoolType으로만 전송할 수 있고 일반 상수 값은 사용할 수 없다.
	}
}
enum SchoolType{
	ELEMENTARY,MIDDLE,HIGH,UNIVERSITY
}
public class EnumTest2 {
/**
 * 상수 사용
 */
	public static void main(String[] args) {
		Student2 st1 = new Student2(SchoolType.ELEMENTARY);//enum 타입을 인자로 던져주면서 객체를 생성하는 부분이다.
//		Student2 st2 = new Student2(2);//정수 값을 이용해서 객체를 생성하는 부분이지만 주석을 해제하면 컴파일 오류가 발생한다.
		
		System.out.println("상수 값을 출력한 경우");//객체의 school 변수 값을 출력하는 부분이다. 이부분에서 실제 enum에서
		System.out.println("st1.school =" +st1.school);//정의한 이름으로 값이 출력된다.
		
		if(st1.school == SchoolType.ELEMENTARY){//school 변수 값을 enum에서 정의한 상수 이름으로 비교하는 부분이다.
			System.out.println("st1.school == Student.ELEMENTARY로 비교했을때");
			System.out.println("당신은 초등학생입니다");
		}
		/*if(st1.school==1){//school 변수 값을 정수 값으로 비교하는 부분이지만 주석을 해제하면 에러가 발생한다.
			System.out.println("st1.school == 1로 비교했을때");
			System.out.println("당신은 초등학생입니다.");
		}*/
	}
}
