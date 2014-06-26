public class AutoBoxingTest {
/**
 * 오토박싱, 언박싱 테스트
 */
 public static void main(String[] args) {
	//1.4이하
	 int var_int1=3;//jdk1.4이하버전에서 기본 타입의 테이터를 객체 타입의 변수에 할당하는 방식이다. 따라서Wrapper클래스
	 Integer intObj1 = new Integer(var_int1);//의 생성자를 이용해서 기본 타입의 데이터를 객체 타입으로 변환한 후에 값을 할당하고 있다.
	 
	 //1.5이상
	 intObj1 = var_int1;//jdk1.5버전 이상에서는 오토박싱 기능이 제공되기 때문에 기본타입의 데이터를 객체 타입의 변수에 할당하면
	 System.out.println("intObj1 =" +intObj1);//자동으로 기본 타입의 데이터가 객체 타입으로 변경되어 값이 할당 된다.
	 
	 //1.4이하
	 Integer intObj2 = new Integer("4");//jdk1.4이전 버전의 방식으로 객체 타입의 데이터를 기본 타입의 변수에 할당하는 부분이다.
	 int var_int2 = intObj2.intValue();//이줄에서 Wrapper Class에서 제공되는 intValue()라는 메소드를 사용해서 객체 타입의 테이터를 기본타입
	 //의 데이터로 변경한 후에 값을 기본 타입의 변수에 할당하고 있다.
	 //1.5이상
	 var_int2 = intObj2;//jdk1.5버전 이상의 방식으로 객체 타입의 데이터를 기본 타입의 변수에 할당하는 부분이다. jdk1.5이상 버전부터는 오토언박싱
	 System.out.println("var_int2 =" +var_int2);//기능이 제공되므로 객체 타입의 데이터를  기본 타입의 변수에 할당하면 객체 타입의 테이터가
}//자동으로 기본 타입의 데이터로 변경되면서 할당된다.
}
