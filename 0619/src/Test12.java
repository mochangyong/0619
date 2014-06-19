 
public class Test12 {
/**
 * 다중for문 테스트
 * @param args
 */
	public static void main(String[] args) {
		int num=0;
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++ ){
				System.out.println(++num+"\t");
				
			}
		}
	}

}
