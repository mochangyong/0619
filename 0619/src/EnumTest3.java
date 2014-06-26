class Student3{
	SchoolType1 school;
	public Student3(SchoolType1 school){
		this.school=school;
	}
}
enum SchoolType1{
	ELEMENTARY,MIDDLE,HIGH,UNIVERSITY
}
public class EnumTest3 {
	public static void main(String[] args) {
		SchoolType1[]schools = SchoolType1.values();//enum 클래스의 values()메소드를 호출해서 enum의 값들을 배열로 얻어오는 부분이다.
		for(SchoolType1 school:schools){//SchoolType 배열의 값만큼 반복하면서 값들을 출력하는 부분이다. ordinal()메소드를 사용하여 인덱스 값도 
			System.out.println(school+"."+school.ordinal());//같이 출력하고 있다.
		}
	}
}
