import java.util.Enumeration;
import java.util.Properties;


public class PropertiesTest {
/**
 * Properties 테스트 
 */
	public static void main(String[] args) {
		Properties p = new Properties();//Properties 객체를 생성하는 부분이다.
		p.put("name", "오정원");// 각 속성 값을 요소로 추가하는 부분이다.
		p.put("addr", "상계동");
		p.put("age", "10");
		p.put("nation", "대한민국");
		
		Enumeration propName = p.propertyNames();//Properties 객체에 저장되어 있는 요소의 이름을 Enumeration 타입으로 얻어오는 부분이다.
		while(propName.hasMoreElements()){
			String name = (String)propName.nextElement();//각 요소의 이름을 하나씩 얻어오는 부분이다.
			System.out.println("name ="+name+",value = " +p.getProperty(name));//각 요소의 이름과 값을 출력하는 부분이다.
			//getProperty 메소드는 해당 이름에 대한 속성 값을 반환해 준다.
		}
	}
}
