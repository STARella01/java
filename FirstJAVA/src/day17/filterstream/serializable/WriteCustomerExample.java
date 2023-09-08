package day17.filterstream.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import util.Closer;

public class WriteCustomerExample {

	public static void main(String[] args) {

		Customer cust1 = new Customer("차은우",'M',"hb@gmail.com",10);
		Customer cust2 = new Customer("차은우2",'F',"hb2@gmail.com",20);
		
		File file= new File("D:\\Develop\\java\\FirstJAVA\\file\\"+"customer.ser");  // serial 약자로 사용
		
		// 사용할 객체 선언
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			// 객체 생성
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(cust1);
			oos.writeObject(cust2);
			
			ArrayList<Customer> list = new ArrayList<>();
			list.add(cust1);
			list.add(cust2);
			oos.writeObject(list);
			
			System.out.println("Customer 데이터가 저장되었습니다.");
			
			// 엔티티 객체를 직접 파일 시스템에 저장할 수 있다. 컬렉션 객체에 저장되어 있는 경우
			// 컬렉션객체를 직렬화 할 수 있다.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if( oos != null ) Closer.close(oos);
			if( fos != null ) Closer.close(fos);
		}
						
		// --- >파일 저장씩 하나하나 내용을 빼서 저장하지 말고 컬렉션에 저장해라라는 얘기!!!!
	}

}
