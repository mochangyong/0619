
public class ExceptionTest1 {
/**
 * 예외 처리: 정수를 0으로 나눔
 */
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);//인자로 숫자 하나를 받는 부분이다. 프로그램 실행 시 인자값을 하나 넘겨주어야 한다.
		int result=10/num;//인가로 넘어온 수자로 10을 나누어 주는 부분이다. 만약 이자로 0 값이 전송되어 오면 ArithmeticException을 발생시키면서 에러가 발생한
		//부분에서 프로그램이 종료된다.
		System.out.println("result="+result);
	}
}
