class MyThread2 implements Runnable{//Runnable 인터페이스를 구현하면서 클래스를 정의하는 부분이다.
	public void run(){
		for(int i =1; i<=20; i++){
			try{
				System.out.print(Thread.currentThread().getName());//currentThread()메소드는 Thread 클래스에서 제공되는 메소드인데 MyThread2
				//클래스는 Runnable 인터페이스를 구현한 것이지 Thread 클래스가 아니기 때문에 currentThread() 메소드를 직접 호출할 수없다
				//따라서 앞에 Thread클래스를 지정해 주었다.
				Thread.sleep(10);;//같은 이유에서 7라인에서도 Thread 클래스를 지정해 주었다.
				for(int j=1; j<=i; j++){
					System.out.print("$");
				}
				System.out.println();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
public class ThreadTest2 {
/**
 * Runnable을 구현해서 스레드 정의
 */
	public static void main(String[] args) {
		MyThread2 myThread2 = new MyThread2();//MyThread 클래스 자체가 Thread 클래스가 아니므로 특정한 Thread 클래스의 생성자를 이용해서 
		Thread thread = new Thread(myThread2, "myThread2");//스레드 객체를 생성하는 부분이다.
		thread.start();
	}
}
