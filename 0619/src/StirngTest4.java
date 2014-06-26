public class StirngTest4 {
/**
 * String 클래스의 메소드 사용
 */
	public static void main(String[] args) {
		String source1 = "aaabbbcccdddfffaaadddfffddd";//String 클래스의 메소드를 사용할 문자열 객체를 생성한 부분
		String source2 = "AAAbbbcccdddfffaaadddfffddd";
		
		System.out.println("원본문자열 :" +source1);//작업할 대상인 source1문자열 출력
		
		System.out.println("첫번째 문자:source1.charAt(0): " +source1.charAt(0));//source1문자열의 0번 인덱스 문자, 즉첫번째 문자 a를 출력한다.
		
		System.out.println("네번째 문자:source1.charAt(3): "+source1.charAt(3));
		//source1 문자열의 3번 인덱스 문자 , 즉 네번째 문자 b를 출력한다.
		System.out.println("aaa 문자열의 인덱스: source1.indexOf(\"aaa\"):" + source1.indexOf("aaa"));
		//"aaa"문자열이 처음시작하는 인덱스번호를 0을 출력한다.
		System.out.println("aaa문자열의 뒤에서부터 검색한 위치: source1.lastIndexOf(\"aaa\"):"+source1.lastIndexOf("aaa"));
		//source1 문자열의 맨 뒤에서부터 검색하여 "aaa" 문자열이 존재하는 인덱스 번호 15을 반환한다.
		System.out.println("3번 인덱스 문자무터 마지막 문자까지 출려: source1.substring(3):" +source1.substring(3));
		//3번 인덱스 위치부터 마지막 문자까지의 문자열을 반환한다. 즉 "bbbcccdddfffaaadddfffddd"문자열이 반환된다.
		System.out.println("3번 인덱스부터 5번 인덱스 문자까지 출력:source1.substring(3,6) : "+source1.substring(3,6));
		//3번 인덱스 위치부터 6-1번 인덱스 위치까지의 문자열을 반환한다. 즉 "bbb"를 반환한다
		System.out.println("aaa문자열을 ggg로 변경 : source1.replace(\"aaa\",\"ggg\"): "+source1.replace("aaa","ggg"));
		//"aaa"문자열을 "ggg"문자열로 치환시키는 부분이다."gggbbbcccdddfffgggdddfffddd"가 반환된다.
		System.out.println("sourec1문자열이 ddd문자열로 끝나는지 확인: source1.endsWith(\"ddd\") : "+source1.endsWith("ddd"));
		//문자열"ddd"문자열로 끝나는지를 판단하는 부분이다. true가 반환 된다.
		System.out.println("source1문자열이 aaa로 시작되는지 확인: source1.startsWith(\"aaa\"): "+source1.startsWith("aaa"));
		//문자열이 "aaa"문자열로 시작되는지를 판단하는 부분이다. true가 리턴된다.
		System.out.println("source1 문자열에 aaa문자열이 포함되어있는지를 판단:source1.contains(\"aaa\"): "+source1.contains("aaa"));
		//"aaa"문자열을 포함하고 있는지를 판단하는 부분이다. true가 리턴된다.
		System.out.println("source1문자열의 길이:source1.length():"+source1.length());
		//문자열의 길이를 구하는 부분이다. 27 이 반환된다.
		System.out.println("source1과 source2의 비교: source1.equals(source2):"+source1.equals(source2));
		//대소문자를 구분하여 source1 문자열과 source2문자열을 비교하는 부분이다. false가 반환된다.
		System.out.println("source1과source2의 대소문자 무시한 비교:source1.equalsIgnoreCase(source2):"+source1.equalsIgnoreCase(source2));
		//대소문자를 구분하지 않고 source1과source2문자열을 비교하는 부분이다. true가 반환된다.
		System.out.println("sourec2 전체를 대문자로 변경: source2.toUpperCase() :"+source2.toUpperCase());
		//Source2문자열 천체를 대문자로 변경하는 부분이다."AAABBBCCCDDDFFFAAADDDFFFDDD"가 반환된다.
		System.out.println("source2를 소문자로 변경: source2.toLowerCase() :"+source2.toLowerCase());
		//source2문자열 전체를 소문자로 변경하는 부분이다. "aaabbbcccdddfffaaadddfffddd"가 반환 된다.
		String source3 = "aaa,bbb,ccc";//source3 문자열 객체를 생성하는 부분이다.
		System.out.println("원본문자열:"+source3);
		String[]splitStr =source3.split(",");//","문자를 구분자로 source3문자열을 분리하는 부분이다.
		
		System.out.println("source3.split(\"|\")로 반환된 배열요소");
		for(String str:splitStr){//""구분자를 이용해서 분리된 값 "aaa,bbb,ccc"문자열을 출력하는 부분이다.
			System.out.println(str);
		}
		System.out.println();
		
		String source4 ="java";//문자열 공백 제거 기능를 실행하는 부분이다.
		System.out.println("원본 문자열:"+ source4+"");
		System.out.println("공백 제거후 source4 문자열: source4.trum():" +source4.trim()+"");
		
		
	}
}

