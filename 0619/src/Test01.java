public class Test01 {
	public static void main(String[] args) {
		/**
		 * 비트 연산자 테스트
		 * 
		 */
		int x =8;
		int y =3;
		int result = 0;
		boolean bResult = false;
		
		/*비트로  변경
		 * 8:00000000 00000000 00000000 00001000  주석 부분에 8과 3 값을 비트로 변경한 예가 나와 있다 비트 연산 시에는 대항 데이터 값이 int형으로 변경되어 
		 * 3:00000000 00000000 00000000 00000011 연산되므로 4바이트로 표현되어 있다
		 */
		
		//&
		result=x&y;
		System.out.println("x&y"+result);
		bResult =true&false;
		System.out.println("true&false"+bResult);
		
		//|
				result=x|y;
				System.out.println("x|y"+result);
				bResult =true|false;
				System.out.println("true|false"+bResult);
				
		//^
		result=x^y;//8값과 3 값을 exclusive or 연산을 실행했기 때문에 결과 비트는 다음과 같다. 00000000 00000000 00000000 00001011  따라서 연산결과는 11이다
		System.out.println("x^y"+result);
		bResult =true^false;
		System.out.println("true^false"+bResult);
				
	}
}
