class OverridingParent{
	void parentMethod(){
		System.out.println("parent method");
	}
}
class OverridingChild extends OverridingParent{
	void ParentMethod(){
		System.out.println("overriding method");
	}
}
public class Overriding {
/**
 * Overriding 테스트
 */
	public static void main(String[] args) {
		OverridingChild oc = new OverridingChild();
		oc.ParentMethod();
	}
}
