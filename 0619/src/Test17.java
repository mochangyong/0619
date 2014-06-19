
public class Test17 {
/**
 * break문 테스트
 * @param args
 */
	public static void main(String[] args) {
		int num=0;//while 문 안에서 실행문 실행 횟수를 저장할 변수를 선언한 부분이다.
		char c='A';//while문 안에서 출력할 문자를 변수에 초기화시킨 부분이다.
		aaa:while(true){//바깥쪽while문 시작부분을 정의 하였고 바깥쪽 while문 영역에 aaa레이블을 지정하였다.
			while(true){//안쪽 whileans 영역의 시작 부분을 정의하였다.
				num++;
				System.out.println(c++ +"");
				if(num%5 ==0){
					break;
				}
				if(num == 26){
					break aaa;
				}
			}
			System.out.println();
		}
	}

}
