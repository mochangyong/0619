import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamTest {
/**
 * FileOutputStreamTest
 */
	public static void main(String[] args) {
		FileOutputStream fo = null;//FileOutputStream 클래스의 레퍼런스 변수를 null 로 초기화 시킨 부분이다.
		String msg="FileOutputStream Test";//파일에 출력할 값을 문자열로 초기화 시킨 부분이다.
		byte[] byteArray = msg.getBytes();//String 타입의 데이터를 byte[]타입으로 변환하였다. write 메소드에 파라미터로 지정할 수 있는 타입으로 
		// 변경한 것이다.
		
		try{
			fo= new FileOutputStream("fileoutput.txt",true);//FileOutputStream 객체를 생성한 부분이다.
			fo.write(byteArray);//파일에 데이터를 출력하는 부분이다.
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				fo.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
