package day12.exception;

import java.io.IOException;
import java.sql.SQLException;

public class Super {
	
	public void doIt() throws IOException, SQLException{ 
		System.out.println("IO_Exception을 throws 합니다.");
	}
}


