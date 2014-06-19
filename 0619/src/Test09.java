
public class Test09 {
/**
 * switch문 테스드
 */
	
	public static void main(String[] args) {
		String job=args[0];
		int salary=0;
		switch(job){
		case "사원":
			salary=2000000;
			break;
		case "대리":
			salary=3500000;
			break;
		case "과장":
			salary=5000000;
			break;
		case "부장":
			salary=8000000;
			break;
		}
		System.out.println("당신의 연봉은 "+salary+"원입니다.");
	}
}
