
public class ExceptionTest4 {
/**
 * 예외 처리: finally테스트
 */
	public void exceptionMethod(String[] args){//main 메소드로부터 인자 값을 문자열의 배열 객체로 받아서 넘어온 인자값에 따라서 예외 처리를 해주는 
		try{//부분이다. 메소드 안에서 try블록과 catch블록 마지막에 return 예약어를 지정했다 메소드 안에서 return 예약어를 만나면 메소드 실행이
			int num =Integer.parseInt(args[0]);//종료 된다. 따라서 23라인의 코드가 실행되지 않는다
			int result = 10/num;
			System.out.println("result = " +result);
			return;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("인자를 하나 입력해 주세요");
			return;
			
		}catch(NumberFormatException e){
			System.out.println("인자를 정수 타입으로 입력해 주세요");
			return;
		}catch(ArithmeticException e){
			System.out.println("정수를 0으로 나누면 안되요");
			
		}
		finally{//반드시 실행되어야 하는 코드 블록을 finally 블록으로 묶어 주었다 finally 블록이 있으면 return 예약어를 만나도 fimally 블록이 먼저 
		System.out.println("반드시 실행될 영역");//실행하고 return 부분으로 되돌아와서 메소드 실행이 마무리 된다.
		}
	}
	public static void main(String[] args) {
		ExceptionTest4 et4 = new ExceptionTest4();
		et4.exceptionMethod(args);
	}
}
