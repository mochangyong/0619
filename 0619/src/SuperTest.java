/*
 * 자식클래스에서 부모 클래스에서 상속받은 변수와 같은 이름으로 변수를 다시 정의하면 부모 클래서에서 정
 * 의한 변수는 은닉되고 자식 클래스에서 다시 정의한 변수가 인식된다.
 */
class Sawon{
	String name;
	String dept;
	int salary;
	
	String displayInfo(){//상위클래스의 displayInfo()메소드에서 이름,부서,연봉 정보를 리턴해 주는 부분을 정의하였다.
		return "이름:"+name+",부서:"+dept+",연봉:"+salary;
	}
}
class Sales extends Sawon{
	int commition;
	/*String dispayInfo(){
	 	return "이름:"+name+",부서:"+dept+",연봉:"+salary
			+",commition="+commition;
	}*/
	String displayInfo(){//Super레퍼런스 변수를 이용하여 상위 클래스의 메소드를 호출하고 상위 클래스에 정의되어 있는 메소드의 기능를 이용하고 있다.
		return super.displayInfo()+",수당:"+commition;//super를 메소드 앞에 지정하지 않으면 기본적으로 this가 적용된다 즉, this.displayInfo()가
	}//되어 자기 자신메소드를 호출하게 된다. 자바 클래스에서 인스턴스 메소드 안에서 호출되는 변수나 메소드 앞에는 this가 생략되어 있다 따라서 상위 클래스의
}//변수나 메소드를 호출하려면 반드시 super를 앞에 붙여주어야 한다. 물론,위 주석부분의 코드로 정의해도 실해은 되지만, 중복 코드를 양산한다.
public class SuperTest {
/**
 * Super 테스트
 */
	public static void main(String[] args) {
		Sales sales = new Sales();
		System.out.println(sales.displayInfo());//displayInfo()메소드를 호출하는 부분이다.
	}
}
