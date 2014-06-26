import java.util.StringTokenizer;


public class StringTokenizerTest2 {
/**
 * StringTokenizer 생성자 비교
 */
	public static void main(String[] args) {
		String source1="한국 미국 태국 영국 독일";//소스 String 객체를 생성하는 부분이다. 문자열을 ""로 구분지어 놓고 있다.
		StringTokenizer st2= new StringTokenizer(source1);//StringTokenizer 객체를 생성할 때 구분자를 지정하지 않으면 기본적으로 white space를
		//기준으로 문자열을 분리한다.
		
		while(st2.hasMoreTokens()){//반환된 토큰들을 출력해 주는 부분이다. <Space Bar> 문자를 기준으로 분리되어 출력되는 것을 확인할 수 있다.
			System.out.println("st1 token :"+ st2.nextToken());
		}
		System.out.println();
		System.out.println();
		
		
		String source2 = "푸들,시츄,허스키,풍산개,진돗개";//두번째 소스 문자열 객체를 생성하는 부분이다. 두번째 문자열 객체는 , 문자로 구분 지었다.
		StringTokenizer st1= new StringTokenizer(source2,",");//구분자를 ,로 지정하여 StringTokenizer 객체를 생성하는 부분이다.
		
		while(st1.hasMoreTokens()){
			System.out.println("st1 token : " +st1.nextToken());
		}
		System.out.println();
		System.out.println();
		
		StringTokenizer st3 = new StringTokenizer(source2, ",", true);//StringTokenizer 객체를 생성할 때 마지막 파라미터 값을 true로 지정하였다
		//마지막 파라미터 값을 true로 지정하면 구분 문자열도 토큰으로 반환된다.
		while(st3.hasMoreTokens()){//각 토큰 값들을 출력해 주는 부분이다. 구분 문자열도 토큰으로 출력되는 것을 확인할 수 있다.
			System.out.println("st3 token :"+st3.nextToken());
		}
	}
}
