import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ObjectStreamTest1 {
/**
 * ObjectInputStream , ObjectOutputStreamTest
 */
	public static void main(String[] args) {
		User01 beforUser01 = new User01("aaa","aaa","상계동",22,"오정원");//파일에 저장할 user1 객체를 생성하는 부분이다.
		User01 afterUser01 =  null;//파일에 저장되어 있는 User01클래스 객체를 읽어 와서 저장할 변수를 선언한 부분이다.
		FileOutputStream fileos = null;//각 스트림 클래스들을 선언한 부분이다.
		ObjectOutputStream objectos = null;
		FileInputStream fileis = null;
		ObjectInputStream objectis = null;
		
		try{
			fileos = new FileOutputStream("userInfo.ser");//객체를 저장하는 파일의 확장자 이름은 반드시 ser이 아니어도 상관없다.
			objectos = new ObjectOutputStream(fileos);//ObjectOutputStream 객체를 생성한 부분이다.
			objectos.writeObject(beforUser01);//beforeUser01  객체를 파일로 출력하는 부분이다 이부분에서 직렬화가 이루어 진다.
			
			fileis =new FileInputStream("userInfo.ser");
			objectis = new ObjectInputStream(fileis);//ObjectInputStream 객체를 생성하는 부분이다.
			afterUser01 = (User01)objectis.readObject();//파일에 저장되어 있는 User01클래스 객체를 얻오오는 부분이다.
			
			System.out.println(afterUser01);//파일에서 얻어온 User01 클래스 객체의 정보를 출력하는 부분이다.
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				fileos.close();
				fileis.close();
				objectos.close();
				objectis.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
