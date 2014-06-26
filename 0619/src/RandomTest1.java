import java.util.Random;


public class RandomTest1 {
/**
 * Random 테스트
 */
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("1부터 100까지의 난수 발생: "+random.nextInt(101));//Random 클래스의 nextInt(int intVar)메서드는 파라미터로 지정한
		System.out.println("1부터 50까지의 난수 발생: "+random.nextInt(51));//값보다  하나 작은 값을 리턴해 주므로 파라미터 값으로 반환받고자 하는 
		System.out.println("1부터 20까지의 난수 발생: "+random.nextInt(21));//가장 큰 값 보다 하나 더 큰 값을 지정해야 한다.
		System.out.println("int 형 전체 범위의 난수 발생: "+random.nextInt());
		
		System.out.println("float 타입의 난수 발생 : "+random.nextFloat());
		System.out.println("double 타입의 난수 발생 : "+random.nextDouble());
		System.out.println("long 타입의 난수 발생: "+random.nextLong());
		System.out.println("boolean 타입의 난수 발생 : " +random.nextBoolean());
		
	}
}
