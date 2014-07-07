import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class FileInputStreamTest {
/**
 * FileInputStream 테스트
 */
	public static void main(String[] args) {
		
//		File makefile = new File("c:\\test.txt");
//		try{
//			makefile.createNewFile();
//		}catch(IOException e){
//			e.printStackTrace();
//		}
		FileInputStream fIn = null;//FileInputStream 변수 값을 null 로 초기화 시키는 부분이다.
		try{
			fIn= new FileInputStream("c:\\test.txt");//FileInputStream 객체를 생성하는 부분이다. 자바에서 경로를  지정할 때 \로
			//경로 구분을 하면 안된다. 자바에서는 \ 는 이스케이프 문자로 인식되기 때문에 자바에서 경로 구분을 할때는 \\ 나 /을  사용해야 한다.
		}catch(IOException e){
			e.printStackTrace();
		}
		int var_read=-1;//파일에서 읽은 1바이트 데이터를 저장할 변수를 정의한 부분이다.
		try{
			while((var_read = fIn.read())!=-1){//읽어들인 값이 -1이 아닐때 , 즉 읽은 값이 없지 않을때 실행되는 영역을 정의하였다.
				System.out.print((char)var_read);//읽어들인 문자 코드값을 char 타입으로 병경하여 문자를 출력하는 부분이다.
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				fIn.close();//스트림을 이용해서 작업을 모두 처리한 후에 스트림을 닫아 주는 부분이다. 스트림을 닫아줄 때 도 스트림의 
				//상태에 따라서 예외가 발생할 수 있으므로 예외 처리를 해주 고 있다.
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
