package day20.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// paths.get() 메서드 이용
			Path path = Paths.get("src/day20/stream/StringStream.java");
			Stream<String> stream = 
					Files.lines(path, Charset.defaultCharset());  	// lines 파일에 있는 모든 line의 내용을 읽어들인다.  // 이미 이전에 지정해 놓은 default값인 utf-8로 사용하겠다는 의미
//					Files.lines(path, Charset.forName("UTF - 8"));	// Charset 캐릭터 셋(A 추상메서드) - 인코딩 타입 지정 의미
//					Files.lines(path, Charset.forName("ms949"));	// 깨짐..
			stream.forEach(s -> System.out.println(s));
			stream.close();
			System.out.println();
			
			// BufferedReader의 lines() 메서드 이용 (반환타입 : Stream<String>) 이용
			File file = path.toFile(); // path객체를 파일 객체로 변환
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.lines().forEach(s -> System.out.println(s)); // br.lines 반환타입 Stream<String> 
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

// stream.close(); 와 br.close();는 굳이 적지 않아도 오류는 나지 않지만, 사용 완료 후 사용 철회를 선언하면
// 메모리가 덜 잡아먹히니까 사용해줘서 끝맺음을 하는 것이 좋다. - 정리
// 만약 닫지 않으면 프로그램 종료 후 닫힘
