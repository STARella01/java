package day16.file;

import java.io.File;

public class FileExample {
	
	static String env_path = "C:\\Program Files\\Common Files\\Oracle\\Java\\javapath;C:\\Windows\\system32;C:\\Windows;C:\\Windows\\System32\\Wbem;C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\;C:\\Windows\\System32\\OpenSSH\\;%JAVA_HOME%\\bin;C:\\Program Files\\Bandizip\\;C:\\Users\\tjoeun\\AppData\\Local\\Microsoft\\WindowsApps";
	// \ 는 윈도우즈 기반 , / 는 리눅스 기반
	
	public static void main(String[] args) {
		File f = new File("D:/filetest/a.txt"); // 절대 경로
		File dir = new File("./"); // 현재 디렉터리   .은 현재 , /은 디렉터리 - // 상대 경로 
		
		// 1. exists : 파일 혹은 디렉터리의 존재 여부 확인
		System.out.println("exist? "+f.exists());
		System.out.println("exist? "+dir.exists());
		
		// 2. isDirectory : 디렉터리인지 여부를 확인 (파일이라면 false)
		System.out.println("isDirectory? "+f.isDirectory());
		System.out.println("isDirectory? "+dir.isDirectory());
		
		// 3. isAbsolute : 해당 경로가 절대 경로인지 확인
		// 파일이나 디렉터리를 지정할 때, 루트(최상위 경로)부터 모든 경로 정보를 다 기술하는 경우 "절대 경로"
		// -> 어디서든 같은 값을 가지고 있다.
		// -> 단, 절대 경로는 경로의 길이 값이 길어질 수 있음.
		// 파일이나 디렉터리를 지정할 때, 현재 작업 위치를 기준으로 경로 정보를 기술하는 경우 "상대 경로"
		// -> 작업 위치에 따라서 변경됨.
		// -> 위치가 변하지만 절대 경로와 달리 상대적인 경로이기 때문에 간단하게 기술 가능
		// - > 나의 작업위치에서 부터 경로 설정
		System.out.println("isAsolute? "+f.isAbsolute()); // true
		System.out.println("isAsolute? "+dir.isAbsolute()); // false
		
		// 4. canExecute, canRead , canWrite : 권한 확인
		System.out.println("canExecute? "+f.canExecute());  // 실행 권한
		System.out.println("canExecute? "+f.canRead()); // 읽기 권한
		System.out.println("canExecute? "+f.canWrite()); // 쓰기 권한 - 수정 불가한가 아닌가
		
		System.out.println("canExecute? "+dir.canExecute());
		System.out.println("canExecute? "+dir.canRead());
		System.out.println("canExecute? "+dir.canWrite());
		
		// 5. getAbsolutePath : 절대 경로 반환 (상대경로에 절대경로를 찾아줌)
		//System.out.println("./ 의 실제 위치: "+f.getAbsolutePath());
		System.out.println("./ 의 실제 위치(절대 경로): "+dir.getAbsolutePath());
		
		// 6. getParent : 부모 폴더를 문자열로 반환
		System.out.println(f.getParent()); 
		
		// 7. getParentFile 부모 폴더를 파일 객체로 반환
		File f_parent = f.getParentFile();
		System.out.println(f_parent);
		
		// 8. static한 것들 (File 객체의 상수)
		System.out.println(File.separator);						// "\"		- 경로 분리
		System.out.println(File.separatorChar);					// "\"		- 경로 분리 
		System.out.println(File.pathSeparator);					// ";"		- 경로 자체를 구분
		System.out.println(File.pathSeparatorChar);			// ";"		- 경로 자체를 구분

		//  환경 변수
		System.out.println("--- 환경 변수 위치 확인 출력 ---");
		String [] path = env_path.split(File.pathSeparator);
		for(String p:path) {
			System.out.println(p);
		}
		
		// 파일 생성 / 수정 / 삭제 메서드
		System.out.println("--- 파일 생성 / 수정 / 삭제 메서드 위치 확인 출력 ---");
		File test = new File("D:\\fileset3\\temp\\abc");
		// mkdir() : 해당 경로의 폴더를 생성 (디렉터리 생성)
		// mkdirs() : 존재하지 않은 부모 폴더까지 모두 포함하여 폴더를 생성
		if(!test.exists()) { // test가 존재하지 않으면
			// test.mkdir();			// D:\\fileset3\\temp디렉터리에  \\abc 만들거다.라는 뜻
			test.mkdirs();				
		}
		
		// createNewFile : 파일이 없으면 새로 생성
		test = new File("D:\\fileset3\\a.txt");
		try {
			test.createNewFile();
		} catch (Exception e) {
				e.printStackTrace();
				System.out.println("파일 생성 중 에러가 발생하면 나오는 곳!!");
		}
		
		// delete : 파일이나 폴더를 삭제한다. 폴더는 비어 있지 않으면 삭제할 수 없다.
		test = new File("D:\\fileset3\\temp\\abc");
		test.delete();
		
		// renameTo : 파일이나 폴더의 이름 및 경로를 변경합니다.
		test = new File("D:\\fileset3\\temp");
		File dst = new File("D:\\fileset3\\temp2");
		test.renameTo(dst);
		
	}

}
