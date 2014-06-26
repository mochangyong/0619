import java.util.StringTokenizer;


public class StringTokenizerTest1 {
/**
 *StringTokenizer 구분자 테스트
 */
	public static void main(String[] args) {
		String source1 = "111-111|강원도|춘천시|퇴계동"; // 소스String 객체를 생성하는 부분이다. 문자열을 "|"로 구분지어 놓고 있다.
		StringTokenizer st1 = new StringTokenizer(source1,"|");//소스 문자열을 "|"로 분리하여 토큰을 생성하는 부분이다.
		String zip = st1.nextToken();//우편번호//nextToken()메소드를 사용하여 토큰중 계속 다음 토큰을 얻어와서 각 변수에 할당하는 부분이다.
		String dou = st1.nextToken();//도
		String si = st1.nextToken();//시
		String dong = st1.nextToken();//동
		
		
		System.out.println("우편번호 : "+zip);//문자열에서 얻어온 정보를 출력하는 부분이다.
		System.out.println("도 :"+dou);
		System.out.println("시: "+si);
		System.out.println("동: "+dong);
	}
}
