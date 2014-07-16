import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriterTest02 {
/**
 * BufferedWriter 테스트
 */
	public static void main(String[] args) {
		FileWriter filew = null;
		BufferedWriter buw = null;
		try{
			filew = new FileWriter("bufferWriter.txt");
			buw = new BufferedWriter(filew,4);
			buw.write('A');
			buw.write('B');
			buw.write('C');
			buw.write('D');
//			buw.flush();//버퍼안에 있는 데이터들을 대상으로 플러시 해주는 부분이다. 이예제에서는 buw.close() 부분에서 BufferedWriter
			//스트림을 close() 해 주는 부분이 있기 때문에 이 부분을 생략해도 자동으로 플러시된다  
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
