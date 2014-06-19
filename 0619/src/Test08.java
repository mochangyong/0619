
public class Test08 {
/**
 * 중첩 if문 테스트
 */
	public static void main(String[] args) {
		int ko=Integer.parseInt(args[0]);
		int ma=Integer.parseInt(args[1]);
		int en=Integer.parseInt(args[2]);
		int total=0;
		
		total=ko+ma+en;
		
		if(total>=180){
			if(ko>40&&ma>40&&en>40){
				System.out.println("합격");
			}else{
				System.out.println("과락");
			}
		}else{
			System.out.println("불합격");
		}
	}
}
