import java.util.StringTokenizer;


public class StringTokenizerTest2 {
/**
 * StringTokenizer 생성자 비교
 */
	public static void main(String[] args) {
		String source1="한국 미국 태국 영국 독일";
		StringTokenizer st2= new StringTokenizer(source1);
		
		while(st2.hasMoreTokens()){
			System.out.println("st1 token :"+ st2.nextToken());
		}
		System.out.println();
		System.out.println();
		
	}
}
