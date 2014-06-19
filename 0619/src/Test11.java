
public class Test11 {
/**
 *다중 for문 테스트 
 * @param args
 */
	public static void main(String[] args) {
		for(int outer=1; outer<=3;outer++){
			for(int inner=1;inner<=3;inner++){
				System.out.println("outer=" +outer+ ",inner =" +inner);
			}
		}
	}

}
