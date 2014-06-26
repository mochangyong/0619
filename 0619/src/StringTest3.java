public class StringTest3 {
/**
 * StringBuffer 테스트
 */
	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer("java");
		System.out.println(sb1);
		StringBuffer sb2 = sb1.append("Fighting");//StringBuffer는 불변성이 없기 때문에 sb에 저장되어 있는 문자열이 "java Fighting" 문자열로 변경
		System.out.println("sb1 == sb2 :" +(sb1 ==sb2));//두 StringBuffer레퍼런스 변수는 동일한 객체를 가리키기 때문에 결과는 true를 반환한다.
		System.out.println(sb1);
		System.out.println(sb2);
	}
}
