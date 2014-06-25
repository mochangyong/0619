
public class ExceptionTest5 {
public void exceptionMethod(){
	
//	throw new ClassNotFoundException();//일반 Exception을 발생시키고 있다.
	
//	throw new NullPointerException();//RuntimeException 을 발생시키고 있기 때문에 예외 처리를 해주지 않아도 컴파일 시에는 오류가 발생하지 않는다.
}//그러나 해당 프로그램을 실행하면 예외가 발생한다.★throw 예약어는 예외 객체를 임의적으로 생성해서 발생 시켜 주는 예약어이다.
/**
 * Exception 테스트 
 */
public static void main(String[] args) {
	ExceptionTest5 et5 = new ExceptionTest5();
	et5.exceptionMethod();
}
}
