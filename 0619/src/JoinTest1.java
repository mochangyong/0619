import java.util.ArrayList;

class BeforeThread extends Thread {
	public BeforeThread(String name) {
		super(name);
	}

	private void addCar() {//자동차 데이터를 저장할 carList 컬렉션에 자동차 정보를 저장하는 부분이다.
		System.out.println("addCar");
		JoinTest1.carList.add("그랜저");
		JoinTest1.carList.add("소나타");
		JoinTest1.carList.add("K9");
		JoinTest1.carList.add("SM7");
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName() + "실행");
		try {
			sleep(1000);//beforeThread가 실행 중에 afterThread가 끼어들어 올 수 있도록 약간의 시간을 delay시켰다
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		addCar();//carList에 저장되어 있는 자동차 종류를 출력하는 부분이다.
	}
}

class AfterThread extends Thread {
	public AfterThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName() + "실행");
		ArrayList<String> carList = JoinTest1.carList;
		for (int i = 0; i < carList.size(); i++) {
			System.out.println(carList.get(i));
		}
	}
}

public class JoinTest1 {
	public static ArrayList<String> carList = new ArrayList<String>();
	/**
	 * Join 적용하지 않은 멀티스레드
	 */
	public static void main(String[] args) {
		BeforeThread beforeThread = new BeforeThread("beforeThread");//beforeThread 객체와 afterThread 객체 두개를 생성하는 부분이다.
		AfterThread afterThread = new AfterThread("afterThread");
		beforeThread.start();//두개의 스레드를 차례대로 시작시키는 부분이다. 두 개의 스레드를 스타트 시키면 어떤 스레드가 cpu를 점유할지는 
		afterThread.start();//스레드 스케줄러만 안다. 즉, 어떤 스레드가 실행될지 모른다. 실행 중에 다른 스레드가 끼어들 수도 있다.
		//본예제에서는 carList에 자동차 정보를 먼저 저장한 후에 즉, beforeThread가 실행 중에 afterThread가 먼저 실행 될수 있는 것이다.
	}
}
