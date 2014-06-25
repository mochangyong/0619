
public class ExceptionTest2 {
/**
 * 예외 처리:정수를 0으로 나눔
 */
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		try{//예외가 발생할 만한 코드 부분을 try블록으로 싸주었다. 이 부분에서 예외가 발생하면 발생된 예외 객체가 catch구문으로 던져진다. 자바에서 발생할 만한 예외들을 클래스
			int result = 10/num;//형태로 정의해서 제공해 준다. 예외 클래스에 해당하는 예외가 try 블록에서 발생했을 때 해당 종류의 예외 클래스 객체가 생성되어 catch블록으로 
			System.out.println("result=" +result);//던져진다. 본 예제에서는 ArithmaticException 객체가 던져진다.
		}catch(ArithmeticException e){//try블록에서 예외가 던져졌을 때 catch 블록에서 발생한 예외 객체를 변수로 참조해서 예외를 처리해 주는 부분이다. 본예제에서는 
			System.out.println("정수를 0으로 나누면 안되요");//ArithmaticException을 처리하는 catch 블록이 정의되어 있다.
		}
		System.out.println("프로그램 계속 실행됨");
	}
}
