class Sawon3{
	String name ="홍길동";
	
}
class Sales3 extends Sawon3{
	String name ="오정원";
	String dispayInfoLocal(){
		String name ="최민수";
		return name;
	}
	String displayInfoThis(){
		String name="최민수";
		return this.name;
		
	}
	String displayInfoSuper(){
		String name ="최민수";
		return super.name;
		
	}
}
public class SuperVariableTest {
/**
 * super를 이용한 변수 호출
 */
	public static void main(String[] args) {
		Sales3 sales3 = new Sales3();
		System.out.println("local.name = "+sales3.dispayInfoLocal());
		System.out.println("this.name = "+sales3.displayInfoThis());
		System.out.println("super.name= "+sales3.displayInfoSuper());
	}
}
