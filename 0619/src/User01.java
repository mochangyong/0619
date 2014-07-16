import java.io.Serializable;


public class User01 implements Serializable {//User01클래스가 직렬화 대상이 될 수 있도록 Serializable 인터페이스를 구현하도록 정의하는 부분이다.
	private String id;
	private String passwd;
	private String dong;
	private transient int age;//age 변수 값은 직렬화 대상에서 제외되도록 transient 예약어를 지정한 부분이다. age 변수에 transient 예약어를 
	//지정했기 때문에 객체를 대상으로 출력 될 때 age 변수 값은 출력되지 않는다.
	private String name;
	public User01(String id, String passwd, String dong , int age, String name){
		super();
		this.id = id;
		this.passwd = passwd;
		this.dong = dong;
		this.age = age;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "아이디 = " +id + ",이름=" +name+ ",나이="+age
				+", 비밀번호 = "+passwd+",동="+dong;
	}
	
	
}
