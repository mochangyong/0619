import java.io.IOException;


public class InputStreamTest {
/**
 * InputStream 테스트
 */
	public static void main(String[] args) {
		int var_byte=-1;//InputStream 으로 읽어들인 문자 코드를 저장할 변수를 정의하였다.
		
		do{
			try{
				var_byte = System.in.read();//표준 콘솔에서 1바이트를 읽어 들이는 부분이다. System클래스의 in 필드는 InputStream을 구현해
				//놓은 객체이다.
			}catch(IOException e){
				e.printStackTrace();
			}
			if(var_byte == 10 ||var_byte == 13 )continue;//<Enter>문자에 대해서는 문자를 출력하지 않고 continue; 예약어를 이용해서 
			//do~while문장의 첫번째 위치로 이동시키는 부분이다.
			if(var_byte == -1)break;//읽은 값이 없으면 break문장으로 반복문을 빠져나가게 처리한 부분이다.
			System.out.println("읽은 값: "+(char)var_byte);//바이트로 읽어 들인 문자 코드 값을 char 타입으로 변경하여 입력한 문자를 출력하는 부분이다
		}while(true);//
		
	}
}
