import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataStreamTest {
/**
 * DataInputStream , DataOutputStream 테스트
 */
	public static void main(String[] args) {
		FileOutputStream fo = null;//각 스트림 타입의 레퍼런스 변수를 선언하는 부분이다.
		FileInputStream fi = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try{
			fo = new FileOutputStream("dataFile.txt");
			fi = new FileInputStream("dataFile.txt");
			dos = new DataOutputStream(fo);//FileOutputStream 객체를 파라미터로 지정하면서 DataOutputStream 객체를 생성하는 부분이다.
			dis = new DataInputStream(fi);//FileInputStream 객체를 파라미터로 지정하면서 DataInputStream 객체를 생성하는 부분이다.
			
			dos.writeShort(-1);//각 데이터 타입으로 파일에 갑을 출력하는 부분이다.
			dos.writeByte(2);
			dos.writeDouble(3.14);
			dos.writeLong(30);
			dos.writeUTF("datastream test");
			
			System.out.println(dis.readUnsignedShort());//short 타입으로 저장되어 있는 값을 비부호 short 값으로 가져와서 출력하는 부분이다.
			//-1값을 short 타입으로 저장했으나, 비 부호 short타입으로 데이터를 가져오기 때문에 부호 비트를 0으로 변경하여 65535가 출력된다.
			dis.skip(1);//데이터가 저장되어 있는 파일에서 값을 읽어 들일 위치를 1바이트 skip한다  따라서 25라인에서 출력한 값을 스킵한다.
//			System.out.println(dis.readByte());
			
			System.out.println(dis.readDouble());/// 파일에 저장되어 있는 각 값을 가져와서 출력한다.
			System.out.println(dis.readLong());
			System.out.println(dis.readUTF());
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				fi.close();
				fo.close();
				dis.close();
				dos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
