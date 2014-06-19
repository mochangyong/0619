import java.util.Scanner;


public class Test22 {
/**
 * 이름찾기테스트
 * @param args
 */
	public static void main(String[] args) {
		String names[]= new String[]{"홍길동","이리라", "이은영", "박예실", "임꺽정","최보라","이혜미","김혜지"};
		Scanner sc= new Scanner(System.in);
		int index=-1;
		
		
		do{
			System.out.println("검색할 이름을 임력하세요");
			System.out.println("이름");
			String name = sc.next();
			for(int i=0; i<names.length; i++){
				if(name.equals(names[i])){
					index=i;
				}
			}
			if(index!=-1){
				System.out.println(name+"은 배열의 "+index+"인덱스방에서 찾았습니다.");
				break;
			}else{
				System.out.println("해당하는 이름이 존재하지 않습니다.");
			}
			
		}while(true);
		
		
	}

}
