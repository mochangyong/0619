class PersonInfo{
	void showSleepingType(Person1 person){
		 person.showSleepStyle();
	}
}
public class ParameterPolyTest {
/**
 * Parameter 다형성 테스트
 */
	public static void main(String[] args) {
		PersonInfo pf= new PersonInfo();
		Person1 person = new Person1();//파라미터로 전송될 각 객체들을 생성
		Employee employee = new Employee();//파라미터로 전송될 각 객체들을 생성
		Student student = new Student();//파라미터로 전송될 각 객체들을 생성
		President president = new President();//파라미터로 전송될 각 객체들을 생성
		
		pf.showSleepingType(person);//각 객체들을 인자로 던져주면서 showSleepingTyoe 메소드를 호출하였다.
		pf.showSleepingType(employee);//각 객체들을 인자로 던져주면서 showSleepingTyoe 메소드를 호출하였다.
		pf.showSleepingType(student);//각 객체들을 인자로 던져주면서 showSleepingTyoe 메소드를 호출하였다.
		pf.showSleepingType(president);//각 객체들을 인자로 던져주면서 showSleepingTyoe 메소드를 호출하였다.
		
	}
}
