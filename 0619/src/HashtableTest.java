import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;


public class HashtableTest {
/**
 * Hashtable 테스트 
 */
	public static void main(String[] args) {//Key의 데이터 타입을 String으로 , value의 데이터 타입을 String으로 지정하면서 Hashtable 객체를 
		Hashtable<String, String> hashtable =//생성하는 부분이다.
				new Hashtable<String, String>();
		
		hashtable.put("driver", "oracle.jdbc.driver.OracleDriver");//Hashtable 객체에 키와 값을 쌍으로 요소를 저장하는 부분이다.
		hashtable.put("url", "jdbc:oracle:thin:@localhost:1521:xe"); 
		hashtable.put("username", "java");
		hashtable.put("password", "java");
		
		Set<String> keySet = hashtable.keySet();//Hashtable 객체에 저장되어 있는 키 값들을 Set 타입으로 얻어온다.
		Iterator<String> it = keySet.iterator();//Set 타입의 객체를 이용해서 Iterator 객체를 얻오 오는 부분이다.
		
		while(it.hasNext()){//Hashtable에 저장 되어 있는 요소들의 키와 값을  출력해 주는 부분이다.
			String key = it.next();
			System.out.println("key =" +key +",value =" +hashtable.get(key));
			
		}
				
	}
}
