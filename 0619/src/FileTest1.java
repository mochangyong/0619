import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;


public class FileTest1 {
public static class ImageNameFilter implements FilenameFilter{//특정 디렉토리 안에 존재하는 파일의 이름을 가져오는 list메소드를 호출할 때 이름으로
	@Override//필터링을  하기 위해서 정의한 FileNameFiler 클래스이다. 이 클래스에서는 확장자가 .jpg로 끝나는 파일 이름을 필터링 해주고 있다.
	public boolean accept(File dir, String name) {
		return name.endsWith(".jpg");
	}
}
/**
 * File 클래스의 메소드 사용하기
 */
	public static void main(String[] args) {
		System.out.println("c: 드라이브의 전체 파일 출력");
		File file = new File("C:\\");//C:드라이브 경로를 이용해서 파일 객체를 생성하는 부분이다.
		String[] files = file.list();//C:드라이브 안에 존재하는 모든 디렉토리와 파일 이름을 String[]타입으로 얻어오는 부분이다.
		for(String fileName : files){
			File subFile = new File(file,fileName);//파일 이름을 이용해서 새로운 파일 객체를 생성하는 부분이다.
			if(file.isDirectory()){//생성한 파일 객체가 디렉토일 경우 정보를 출력하는 부분이다.
				System.out.println("디렉토리 이름: "+fileName);
			}else{//생성한 파일 객체가 파일일 경우 정보를 출력하는 부분이다.
				System.out.println("파일 이름:" +fileName+",파일크기" +subFile.length()+"byte");
			}
		}
		System.out.println("c:드라이브의 이미지 파일만 출력");
		String[] imageFiles = file.list(new ImageNameFilter());//확장자가 .jpg로 끝나는 파일 이름들만 String[] 타입으로 얻어오는 부분이다.
		for(String fileName:imageFiles){
			File subFile = new File(file,fileName);
			System.out.println("파일 이름: "+fileName +",파일크기: "// 파일의 정보를 출력하는 부분이다.
					+subFile.length()+"byte"+",파일 경로 :" +subFile.getAbsolutePath());
		}
		File makeFile = new File("c:\\data\\testFile.txt");//생성할 파일 객체를 추상적으로 만드는 부분이다. File 객체를 생성할 때는 실제로 디렉토리에 
		//파일이 생성되는 것이 아니고 추상적인 객체가 생성되는 것이다.
		try{
			makeFile.createNewFile();//물리적으로 파일을 생성하는 부분이다.
		}catch(IOException e){
			e.printStackTrace();
		}
		if (makeFile.exists()){//파일이 정상적으로 생성되었으면 메시지를 출력해 주는 부분이다.
			System.out.println("makeFile이 생성됨");
		}
		
		File renameFile = new File("c:\\data\\testFile2.txt");//추상적인 파일 객체를 하나 더 생성한다.
		makeFile.renameTo(renameFile);//파일의  이름을 파라미터로 지정된 파일의 이름으로 변경하는 부분이다.
		if(renameFile.exists()){//파일 이름이 정상적으로 변경되었으면 메시지를 출력해 주는 부분이다.
			System.out.println("makeFile 의 이름이 변경됨");
		}
		
		if(renameFile.delete()){//해당파일을 제거하는 작업을 하고 해당 파일이 제대로 제거되었으면 메시지를 출력해주는 부분이다.
			System.out.println("renameFile이 제거됨");
		}
			
	}
}
