import java.util.Random;


public class RandomTest2 {
/**
 * seed 값 사용 테스트
 */
	public static void main(String[] args) {
		Random random1 =new Random(5);//seed 값을 동일하게 지정하여  Random 객체 두개를 생성한 부분이다.
		Random random2 = new Random(5);
		//각 Random 객체를 사용해 반복하여 난수 값을 9개씩 출력하는 부분이다. seed 값이 동일하기 때문에 반환되는 값이 동일하다.
		for(int i=0 ; i<9; i ++){
			System.out.println("random1의 난수값 ="+random1.nextInt());
		}
		System.out.println();
		System.out.println();
		
		for(int i = 0; i<9; i++){
			System.out.println("random2의 난수값 =" +random2.nextInt());
		}
	}
}
