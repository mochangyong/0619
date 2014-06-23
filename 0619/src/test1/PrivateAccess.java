package test1;

public class PrivateAccess {
/**
 * Private접근 제한자 테스트
 */
	public static void main(String[] args) {
		PrivateData pd =new PrivateData();
		System.out.println(pd.privateVar);
	}
}
