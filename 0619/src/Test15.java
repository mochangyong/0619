import java.util.Scanner;


public class Test15 {
/**
 * do_while 문 테스트
 * @param args
 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int number =(int)(Math.random()*100)+1;
		int inNumber =0;
		
		do{
			System.out.println("숫자를 입력하세요");
			inNumber=sc.nextInt();
			
			if(inNumber == number){
				System.out.println("맞혔습니다.");
				break;
			}else if(inNumber<number){
				System.out.println("숫자가 너무 작아요");
			}else{
				System.out.println("숫자가 너무 커요");
			}
		}while(true);
		
	}

}
