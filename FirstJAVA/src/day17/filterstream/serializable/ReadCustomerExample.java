package day17.filterstream.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import util.Closer;

public class ReadCustomerExample {

	public static void main(String[] args) {
		// 역직렬화 사용으로 데이터 빼내기
		
		File file= new File("D:\\Develop\\java\\FirstJAVA\\file\\"+"customer.ser");  // serial 약자로 사용
		
		// 바이트 단위의 데이터 불러오기
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			Customer cus1 = (Customer)ois.readObject();
			Customer cus2 = (Customer)ois.readObject();
			@SuppressWarnings("unchecked")
			ArrayList<Customer> list = (ArrayList<Customer>)ois.readObject();
			System.out.println(cus1);
			System.out.println(cus2);
			System.out.println(list);
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) { // 자바 인셉션에 있는 예외 - 왜 쓸까? : 해당 객체를 찾지 못한 경우
			System.out.println(e.getMessage());
		}
		// java.lang 기본적으로 제공되는 것들의 경로
		finally {
			if(ois != null) Closer.close(ois);
			if(fis != null) Closer.close(fis);
		}
	}

}
