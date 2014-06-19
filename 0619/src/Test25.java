
public class Test25 {
/**
 * 다차원 배열 테스트
 * @param args
 */
	public static void main(String[] args) {
		int[][] recArray = new int[5][5];
				
		for(int i=0;i<recArray.length;i++){
			for(int j=0;j<recArray[i].length;j++){                     
				if(i==0||i==recArray.length-1||j==0||j==recArray[i].length-1){//1차원 배열의 인덱스가 0(결과 화면상 제일 상단행)이나 마지막 (결과 화면상 제
					recArray[i][j]=1;		//일 하단 행)인 경우, 그리고 2차원배열 객체의 인덱스가 0(결과 화면상 제일 왼쪽행)이나 마지막(결과 화면상 제일 오른쪽 행)
				}						//인 경우의 영역에 1값을 설정 값을 설정하지 않는 ㅂ분은 배열 객체를 생성할때 0으로 초기화
				//System.out.print(recArray[i][j]+"");
			}
		}
		for(int i=0;i<recArray.length; i++){
			for(int j=0;j<recArray[i].length; j++){
				System.out.print(recArray[i][j]+"");
			}
			System.out.println();
		}
	}

}
