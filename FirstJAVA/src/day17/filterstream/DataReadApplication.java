package day17.filterstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import util.Closer;

public class DataReadApplication {

	public static void main(String[] args) {
		File file= new File("D:\\Develop\\java\\FirstJAVA\\file\\"+"customer.data");	
		
		// null값 주는 이유
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		// 예외처리
		try {
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			String name = null;
			while((name=dis.readUTF()) != null){
				System.out.println(name);
				System.out.println(dis.readChar());
				System.out.println(dis.readUTF());
				System.out.println(dis.readInt());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(dis != null) Closer.close(dis);
			if(fis != null) Closer.close(fis);
		}
		// 예외처리 end
		
	} // main method end --

}
