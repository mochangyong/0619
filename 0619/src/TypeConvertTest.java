public class TypeConvertTest {
/**
 * 타입 변환 메소드 테스트 
 */
  public static void main(String[] args) {
	int num1 = 3;
	String num2="4";
	System.out.println("타입변환");
	System.out.println("3+4 ="+(num1+num2));//num2가 문자열로 지정되어 있기 때문에num1+num2를 연산하면 num1도 문자열 
	//타입으로 변경되어 두문자열 값이 연결된다.
	
	int intNum = Integer.parseInt(num2);//num2 값을 parseInt 메소드를 이용해서  int 타입으로 변경해 주는 부분이다.
	System.out.println("타입 변환 후");
	System.out.println("3+4 =" +(num1+intNum));//intNum이 정수 타입으므로 num1+intNum을 연산하면 숫자 연산이 제대로 수행 된다.
	
	String numStr = "3.11";
	System.out.println("타입 변환전");
	System.out.println("3+3.11 = "+(num1+numStr));//numStr이 문자열 타입이므로 num1+numStr을 연산하면 num1값도 문자열 타입으로 변경되어 두개
	//의 문자열이 연결된다.
	
	double numDouble = Double.parseDouble(numStr);//parseDouble 메소드를 이용해서 문자열 타입을 double 타입으로 변경해 주는 부분이다.
	System.out.println("타입 변환 후");
	System.out.println("3+3.11 = " +(num1+numDouble));//numDouble수가 double타입이므로 num1+numDouble을 연산하면 숫자 연산이 제대로 수행된다.
}
}
