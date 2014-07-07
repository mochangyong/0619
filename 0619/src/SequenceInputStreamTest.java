import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;


public class SequenceInputStreamTest {
/**
 * SequenceInputStream 테스트
 */
	public static void main(String[] args) {
		FileInputStream fin1 = null;
		FileInputStream fin2 = null;
		FileInputStream fin3 = null;
		SequenceInputStream si1 = null;
		SequenceInputStream si2= null;
		
		try{
			fin1= new FileInputStream("test1.txt");//FileInputStream 객체 세개를 생성한 부분이다.
			fin2 = new FileInputStream("test2.txt");
			fin3 = new FileInputStream("test3.txt");
			
			Vector v = new Vector();//Vector 객체를 생성한 부분이다.
			v.add(fin1);//Vector에  FileInputStream 객체 세 개를  추가한 부분이다.
			v.add(fin2);
			v.add(fin3);
			
			Enumeration fins = v.elements();//Vector에 저장되어 있는 요소들을 Enumeration 타입으로  참조하는 부분이다.
			si1 = new SequenceInputStream(fins);//Enumeration 객체를 사용하여 SequenceInputStream 객체를 생성하는 부분이다.
			
			int var_readbyte = -1;
			while((var_readbyte = si1.read())!=-1){//SequenceInputStream을 이용해서 데이터를 읽어 들여 출력하는 부분이다.
				System.out.print((char)var_readbyte);
			}
			System.out.println();
			
			fin1 = new FileInputStream("test1.txt");//FileInputStream 객체 두 개를 사용하여 SequenceInputStream 객체를 생성하는 부분이다.
			fin2 = new FileInputStream("test2.txt");
			si2= new SequenceInputStream(fin1,fin2);
			var_readbyte = -1;
			while((var_readbyte = si2.read())!=-1){//SequenceInputStream 객체를 사용하여 데이터를 읽어 들이고 출력하는 부분이다.
				System.out.print((char)var_readbyte);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				si1.close();//사용한 스트림을 닫아 주는 부분이다.
				si2.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
