
public class MathTest {
/**
 * Math.random()메소드 테스트
 */
	public static void main(String[] args) {
		System.out.println("1부터 100사이의 난수 발생");
		int num = (int)(Math.random()*100)+1;//Math.random()메소드가 반환하는 값이 0.0보다 크거나 같고 1.0보다 작은값을 반환하기 때문에 Math.random()
		//*100값을  int형으로 변환하면 반환될 수 있는 값의 범위는 0부터 99까지이다. 이값에 1을 더하면 반환 할 수있는 
		//값의 범위가 1부터100사이의 값이 되는 것이다. 나머지도 유사한 부분이므로 설명은 생략하겠다
		System.out.println("1부터 100사이의 숫자: " +num);
		
		System.out.println("1부터 50까지의 난수 발생");
		num = (int)(Math.random()*50)+1;
		System.out.println("1qnxj 50사이의 숫자: "+num);
		
		System.out.println("1부터 20까지의 난수 발생");
		num = (int)(Math.random()*20)+1;
		System.out.println("1qnxj 20사이의 숫자: "+num);
		
	}
}
