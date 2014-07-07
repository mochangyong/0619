import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class ByteArrayOutputStreamTest {
/**
 * byteArrayOutputStream 테스트
 */
	public static void main(String[] args) {
		String msg = "ByteArrayOutputStream test";//메모리에 출력할 문자열을 초기화 시킨 부분이다.
		ByteArrayOutputStream bao = null;//ByteArrayOutputStream 타입의 레퍼런스 변수를 정의한 부분이다.
		
		try{
			bao = new ByteArrayOutputStream();//ByteArrayOutputStream 객체를 생성한 부분이다.
			bao.write(msg.getBytes());//문자열을 바이트 배열 객체로 변경하여 메모리에 출력하는 부분이다.
			System.out.println("bao = "+bao);//메모리에 저장되어 있는 값을 출력하는 부분이다.
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				bao.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
