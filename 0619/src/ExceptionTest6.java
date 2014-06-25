public class ExceptionTest6 {
	public void exceptionMethod() throws Exception{//throws 예약어를 사용해서 예외 처리를 main 메소드로 이양하고 있다.
		throw new Exception();//예외 객체를 생성해서 발생시키는 부분이다.
	}
	/**
	 * throws 테스트
	 */
	public static void main(String[] args) {
		ExceptionTest6 et6 = new ExceptionTest6();
		try{
			et6.exceptionMethod();//exceptionMethod()에서 던져준 메소드가 이 부분으로 던져진다.
		}catch(Exception e){
			System.out.println("호출한 메소드에서 예외 처리함");
		}
		
	}
}
