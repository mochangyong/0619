public class StringTest2 {
/**
 *String 클래스의 불변성 테스트
 */
	public static void main(String[] args) {
		String originalString = new String("java");
		String lastString = originalString.concat("Fighting");
		
		System.out.println("originalString==lastStirng: " +(originalString==lastString));
		//String 클래스 객체에 특정 메소드를 사용하여 문자열을 변경하면 문자열 객체는 불변성이 있으므로 새로운 문자열객체가 생성된다.
		//따라서 9라인의 결과 값은 false가 반환된다
		System.out.println(originalString);
		System.out.println(lastString);
	}
}
