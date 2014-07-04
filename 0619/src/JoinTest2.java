import java.util.ArrayList;

class BeforeThread1 extends Thread{
	public BeforeThread1(String name){
		super(name);
	}
	private void addCar(){
		System.out.println("addCar");
		JoinTest1.carList.add("그랜저");
		JoinTest1.carList.add("소나타");
		JoinTest1.carList.add("K9");
		JoinTest1.carList.add("SM7");
	}
	@Override
	public void run() {
		System.out.println(currentThread().getName()+"실행");
		try{
			sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		addCar();
	}
}
class AfterThread1 extends Thread{
	public AfterThread1(String name){
		super(name);
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName()+"실행");
		ArrayList<String> carList = JoinTest1.carList;
		for(int i =0; i<carList.size(); i++){
			System.out.println(carList.get(i));
		}
	}
}
public class JoinTest2 {
public static ArrayList<String> carList = new ArrayList<String>();
/**
 * Join 기능을 적용한 멀티 스레드
 */
	public static void main(String[] args) {
		BeforeThread1 beforeThread = new BeforeThread1("beforeThread");
		AfterThread1 afterThread = new AfterThread1("afterThread");
		
		beforeThread.start();
		try{//afterThread가 실행되기 전에 beforeThread 기능이 전부 실행되도록 join()메소드를 호출하는 부분이다.
			beforeThread.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		afterThread.start();
		
	}
}
