
public class Test23 {
/**
 * System.arraycopy 테스트
 */
	public static void main(String[] args) {

		String city[]={"서울","대전","부산","춘천","광주","울산"};
		String nation[] = new String[]{"미국","영국","인도","태국","독일","호주"};
		String newArray[] = new String[city.length+nation.length];//원본 배열 객체 두개의 요소들을 하나로 합쳐서 저장할 배열 객체를 생성하는 부분이다. 크기를 지정할 때 
		//city배열의 크기와 nation배열의 크기를 더해서 지정했다.
		
		System.arraycopy(city, 0, newArray, 0, city.length);//city배열 객체의 요소를 0번 인덱스부터 city배열의 크기만큼 newArray 배열의 0번
															//인덱스부터 newArray배열 객체로 복사하는 부분이다.
		System.arraycopy(nation, 0, newArray, city.length, nation.length);//nation 배열 객체의 요소를 cities 배열 객체를 복사한 다음 위치부터
																		  //newArray 배열에 복사하는 부분이다.
		
		for(String str:newArray){
			System.out.println(str);
		}
		
	}

}
