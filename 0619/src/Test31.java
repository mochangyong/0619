	class Boiler{
		String maker;
		int temp;
		String color;
		
		void tempUp(){
			temp++;
		}
		void tempUp(int amount){
			temp = temp + amount;
		}
	}
public class Test31 {
	/**
	 * Overloading 테스트
	 */
	public static void main(String[] args) {
		Boiler bo = new Boiler();
		System.out.println("현재 온도 ="+bo.temp);
		bo.tempUp();
		System.out.println("bo.tempUp()메소드 호출 후 현재 온도 =" +bo.temp);
		bo.tempUp(20);
		System.out.println("bo.tempUp(20)메소드 호출 후 현재 온도 =" +bo.temp);
	}
}
