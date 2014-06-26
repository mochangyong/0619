public class StringTest1 {
/**
 * 문자열 객체 비교
 */
	public static void main(String[] args) {
		String string1="testString";//리터럴을 이용해서 String 객체를 생성하는 부분이다.
		String string2 ="testString";//리터럴을 이용해서 String 객체를 생성하는 부분이다.
		
		System.out.println("string1 == string2: " +(string1==string2));//"=="연산자를 이용해서 string1과string2의 레퍼런스 값을 비교하는 부분이다.
		//리터럴을 이용해서 String객체를 생성하게 되면, 같은 문자열을 가진 상수가 이미 존재하면 객체를 새로 생성하지 않고 기존에 존재하는 문자열 객체를 
		//참조하므로 결과는 true를 반환한다.
		System.out.println("String1.equals(string2): " +(string1.equals(string2)));//equals를 이용하여 String 객체에 실제로 존재하는 문자열
		//값을 비교하는 부분이다. equals메소드느 원래 자바에서 모든 클래스들의 최상위 클래스인Object 클래스에 정의되어 있다 Object클래스에 정의되어 있는
		//equals메소드는 원래"=="과 같은 역할을 하지만 String 클래스에서 실제 값을 비교하도록 재정의 되어 있다 따라서 string1관string2는 같은 문자열을 
		//이용해서 생성하였으므로 결과는 true이다.
		
		String string3 = new String("testString");//String 클래스의 생성자를 이용해서 String 객체를 생성하는 부분이다.
		String string4 = new String("testString");//String 클래스의 생성자를 이용해서 String 객체를 생성하는 부분이다.
		
		System.out.println("string3== string4: "+(string3 == string4));//생성자를 이용해서 문자열 객체를 생성하면 생성할 때마다 heap영역에 새로운 객체를 생성한다.
		//따라서"=="으로 두 참조 변수의 참조값을 비교하게 되면 false를 반환한다.
		System.out.println("String3.equals(string4): " +(string3.equals(string4)));//equals메소드는 String 클래스에서 두 String 객체를 실제
		//문자열 값을 비교하게 재정의 되어 있으므로 결과는 true이다.
	}
}
