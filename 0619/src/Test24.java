
public class Test24 {
/**
 * 다차원 배열 테스트
 * @param args
 */
	public static void main(String[] args) {
		
		int[][] multiArray =new int[2][2];
		char c='A';
		
		for(int i=0;i<multiArray.length;i++){
			for(int j=0;j<multiArray[i].length;j++){
			multiArray[i][j]=c++;
			
			}
		}
		for(int i=0;i<multiArray.length;i++){
			for(int j=0; j<multiArray[i].length;j++){
				System.out.println("multiArray["+i+"]["+j+"]="+(char)multiArray[i][j]);
			}
		}
	}


}