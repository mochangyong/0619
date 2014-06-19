
public class Test10 {
	/**
	 * 단순 for문 테스트
	 */
	public static void main(String[] args) {
		int sum=0;
		String ex="";
		for(int i=1; i<=50;i++){
			sum+=i;
			ex+=(i==1)?""+i:"+"+i;
		}
		System.out.println(ex+"="+sum);
	}
	
}
