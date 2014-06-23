class Sawon2{
	String name;
	String dept;
	int salary;
	
	public Sawon2(String name, String dept, int salary){
		super();
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	String displayInfo(){
		return "이름:"+name+",부서:"+dept+",연봉:" +salary;
	}
}
class Sales2 extends Sawon2{
	int commition;
	public Sales2(String name, String dept, int salary, int commition){
		//super()
		super(name,dept,salary);//자식 클래스의 생성자에서 부모 클래스의 인자 있는 생성자를 명시적으로 호출해 주는 부분이다.
		//이부분이 정의되지 않고 위주석 부분이 자동으로 호출되면 컴파일 오류를 발생한다 부모 클래스에 빈 생성자가 없기때문이다.
		this.commition=commition;
	}
	/*
	 String displayInfo(){
		return "이름:"+name+",부서:"+dept+",연봉:" +salary
		+",commition="+commition;
	}
	 */
	String displayInfo(){
		return super.displayInfo()+ ",수당:"+commition;
	}
}
public class SuperConstructorTest {
/**
 * super()테스트
 */
	public static void main(String[] args) {
		Sales2 sales2 = new Sales2("오정원","영업부",100000000,70000000);//인자 있는 생성자를 호출해서 객체를 생성하는 부분이다.
		System.out.println(sales2.displayInfo());
	}
}
/**
 *상속관계에 있는 자식 클래스의 생성자를 호출하면 자식 클래스  생성자의 첫 줄에 super()가 자동으로 삽입되면서 부모 클래스의 생성자부터 호출(현실 세계에서 
 *부모가 존재하지 않는 자식은 있을 수 없듯이)한다. 그런데 super()에 의해서 부모의 빈 생성자가 자동으로 호출되는데 부모 클래스에 인자 있는 생성자만 있다면 
 *컴파일러가 자동으로 빈 생성자를 만들어 주지 않기 때문에 컴파일 오류가 발생한다. 바로 이경우에 super()생성자를 이용해서 명시적으로 부모 클래스의 
 *인자 있는 생성자를 호출해야 된다. 
 */

