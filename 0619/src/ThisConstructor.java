class House{
	int price;
	String dong;
	int size;
	String kind;
	public House(){
		//System.out.println("this보다 앞에서 실행");
		this(100,32,"왕십리","단독주택");//필요한 멤버 변수 값들을 초기화 시키기 위해서 this()를 사용해 다른 생성자를 호출 해서 초기화 시키는 부분이다.
	}//파라미터로 전송되어 오지 않는 값들은 임의적인 초기값으로 설정 this()는 무조건 생성자의 첫라이에서 호출되어야 하기 때문에 8라인의 주석을 제거하면 컴파일 에러가 발생
	public House(int price){//초기화 시키는 멤버 변수들을 다르게 해서 여러개의 생성자를 정의한 부분이다. 실질적인 초기화 작업은 마지막 
		this(price,32,"왕십리","단독주택");//생성자에서 실행하고 있으며,다른 생성자들은 this()생성자를 호출해서 초기화 작업을 하고 있다.
	}
	public House(int price,int size){
		this(price,size,"왕십리","단독주택");
	}
	public House(int price , int size, String dong){
	this(price,size,dong,"단독주택");
	}
	public House(int price, int size, String dong , String kind){
			this.price=price;
			this.size=size;
			this.dong=dong;
			this.kind=kind;
	}
}
public class ThisConstructor {
/**
 * this()테스트
 */
	public static void main(String[] args) {//각 다른 생성자를 호출해서 객체를 생성한 후 초기화된 멤버 변수 값을 확인하는 부분이다. 코드와
		House house1 = new House();//실행 결과를 비교해 보면 어렵지 않게 이해가 갈 것이다.
		System.out.println("house1.price =" +house1.price+",house1.size =" +
		house1.size+ ",house1.dong =" +house1.dong + ",house1.kind =" +house1.kind);

	
		House house2 = new House(300);
		System.out.println("house2.price =" +house2.price+",house2.size =" +
		house2.size+ ",house2.dong =" +house2.dong + ",house2.kind =" +house2.kind);
	
		
		House house3 = new House(300,40);
		System.out.println("house3.price =" +house3.price+",house3.size =" +
		house3.size+ ",house3.dong =" +house3.dong + ",house3.kind =" +house3.kind);
		
		
		House house4 = new House(300,40,"서초동");
		System.out.println("house4.price =" +house4.price+",house4.size =" +
		house4.size+ ",house4.dong =" +house4.dong + ",house4.kind =" +house4.kind);
		
		
		House house5 = new House(300,40,"서초동","빌라");
		System.out.println("house5.price =" +house5.price+",house5.size =" +
		house5.size+ ",house5.dong =" +house5.dong + ",house5.kind =" +house5.kind);

}
}