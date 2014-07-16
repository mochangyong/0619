import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriterTest3 {
/**
 * BufferedWriter 테스트
 */
	public static void main(String[] args) {
		FileWriter filew = null;
		BufferedWriter buw = null;
		try{
			filew= new FileWriter("bufferWriter3.txt");
			buw = new BufferedWriter(filew,4);
			
			buw.write("여러라인 출력 예제 1라인");//문자열 하나 출력하면서 계속해서 줄 바꿈을 처리하는 부분이다.
			buw.newLine();
			buw.write("여러라인 출력 예제 2라인");
			buw.newLine();
			buw.write("여러라인 출력 예제 3라인");
			buw.newLine();
			buw.write("여러라인 출력 예제 3라인");
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				buw.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
