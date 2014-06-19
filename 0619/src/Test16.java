import java.util.Scanner;


public class Test16 {
/**
 * break 문 테스트
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);//콘솔로부터 데이터를 읽어 들이는 역할을 하는 Scanner객체를 생성하는 부분이다.
		String answer="서울";//맞혀야 할 수도 이름을 초기화시키는 변수를 정의한 부분이다.
		String  inanswer ="";
		
		do{
			System.out.println("대한민국의 수도는 어디입니까?");
			 inanswer=sc.next();
			 
			 if(inanswer.equals(answer)){
				 System.out.println("정답입니다.");
				 break;
			 }else{
				System.out.println("다시 입력하세요");
			 }
			 }while(true);
	}

}

