class Student1{
	int school;//해당 학생의 학교 종류를 저장할 school 변수를 정의한 부분이다.
	public Student1(int school){
		this.school=school;
	}
	public static int ELEMENTARY =1;//school 변수에 저장할 학교 종류로 사용될 상수들을 정의한 부분이다.
	public static int MIDDLE = 2;
	public static int HIGH = 3;
	public static int UNIVERSITY = 4;
}
public class EnumTest1 {
/**
 * 상수 사용
 */
	public static void main(String[] args) {
		Student1 st1 = new Student1(Student1.ELEMENTARY);//상수를 이용하여 school변수 값을 초기화시키면서 객체를 생성하는 부분이다.
		Student1 st2 = new Student1(2);//Student에서 정의한 상수가 아닌 일반 정수 상수 값을 이용해서 school 변수 값을 초기화시키면서 객체를 생성하는부분
		
		System.out.println("상수 값을 출력한 경우");
		System.out.println("st1.school =" +st1.school);//Student 클래스에 할당되어 school 변수 값을 출력하는 부분이다. Student에서
		System.out.println("st2.school = "+st2.school);//정의한 상수명이 출력되는 것이 아니고 , 일반 정수 상수 값이 출력된다
		
		if(st1.school == Student1.ELEMENTARY){//Student 클래스에서 정의한 상수 이름을 이용해서 학교 종류를 비교하는 부분이다.
			System.out.println("st1.school == Student.ELEMENTARY로 비교했을때");
			System.out.println("당신은 초등학생입니다");
		}
		if(st1.school==1){//일반 상수 값을 이용해서 학교 종류를 비교하는 영역이다. Student 클래스에서 정의한 상수 이름으로 비교하지 
			System.out.println("st1.school == 1로 비교했을때");//않아도 비교가 잘 된다. 
			System.out.println("당신은 초등학생입니다.");
		}
	}
}
