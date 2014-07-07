import java.io.ByteArrayInputStream;


public class ByteArrayInputStreamTest {
/**
 * ByteArrayInputStream 테스트
 */
	public static void main(String[] args) {
		byte[] datas = new byte[]{10,20,30,40};//ByteArrayInputStream에서 읽어 들일 데이터를 저장할 바이트 배열 객체를 생성하는 부분이다.
		ByteArrayInputStream bai = new ByteArrayInputStream(datas);//바이트 배열 객체를 이용해서 ByteArrayInputStream 객체를 생성하는 부분이다.
		int var_readbyte=-1;//ByteArrayInputStream에서 읽어 들인 문자  코드를 저장할 변수를 정의한 부분이다.
		
		while((var_readbyte = bai.read())!=-1){//바이트 배열에서 1바이트씩 데이터를 읽어서 출력하는 부분이다.
			System.out.println(var_readbyte+"");
		}
//	byte[] bu = new byte[]{10,20,30,40,50};
//	ByteArrayInputStream bi = new ByteArrayInputStream(bu);
//	int var_readbyte1= -1;
//	while((var_readbyte1=bi.read())!=-1){
//		System.out.println(var_readbyte1);
//	}
//	
//	
//	
	
	}
}
