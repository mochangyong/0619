import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionTest3 {
/**
 * 예외 처리 : 여러 개의 예외 처리
 */
	public static void main(String[] args) {
		boolean sss;
		do{
		try{
			sss=false;
			//			int num = Integer.parseInt(args[0]);
			int num;
			Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
			int result = 10/num;
			System.out.println("num 값을 입력하세요");
		
			System.out.println("result = " +result);
		
		}catch(ArrayIndexOutOfBoundsException e){//인자를 입력하지 않고 실행 했을 때 발생하는 예외를 처리해 주는 부분이다.
		 sss=true;
			System.out.println("인자를 하나 입력해 주세요");
		}catch(NumberFormatException e){//문자 타입을 인자로 입력했을때 발생하는 예외를 처리하는 부분이다.
			sss=true;
			System.out.println("인자를 정수 타입으로 입력해 주세요");
			sss=true;
		}catch(ArithmeticException e){//인자를 0값으로 입력하고 프로그램을 실행 했을 때  발생하는 예외 를 처리해 주는 부분이다.
			sss=true;
			System.out.println("정수를 0으로 나누면 안되요");
		}catch(InputMismatchException e){
			sss=true;
			System.out.println("숫자를 입력하세요");
		}
		
		System.out.println("프로그램 계속 실행됨");
		}while(false);
		
		
		}
	
}

