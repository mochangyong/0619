import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;


public class User2 implements Externalizable{
	private String id;
	private String passwd;
	private String dong;
	private transient int age;
	private String name;
	
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
	public User2(){
		
	}
public User2(String id, String passwd, String dong , int age,  String name){
	
}

@Override
public void writeExternal(ObjectOutput out) throws IOException {
	
}
@Override
public void readExternal(ObjectInput in) throws IOException,
		ClassNotFoundException {
	
}}
