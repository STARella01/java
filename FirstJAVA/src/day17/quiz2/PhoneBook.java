package day17.quiz2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import util.Closer;

public class PhoneBook {

	// HashMap을 이용해 전화번호부를 구현해 보세요

	// 1. "그룹/전화번호/이름'을 저장해야 합니다.
	// 2. 그룹을 키값으로 넣으면 그 그룹에 해당하는 HashMap이 선택됩니다. 
	// 3. 그룹의 HashMap에 전화번호를 키값으로 넣으면 이름이 나온다
	HashMap<String, HashMap<String, String>> phoneBook;
	File saveFile = null;
	String savePath = "savefile/phoneBook.sav";
	
	// 기본 생성자
	public PhoneBook() {
		phoneBook = new HashMap<>( );
		saveFile = new File(savePath); // 파일 객체 생성 - 저장 파일에 대한
		if (!saveFile.exists()) {
			File dir = new File(saveFile.getParent());
			dir.mkdirs();
		}
		load(); // 객체 실행 시 파일의 정보를 읽어와서 정보를 완성!
	}
	 
	
	// ####메서드####
	// 1. phoneBook에 새로운 그룹을 추가하는 메서드
	public void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap<String, String>( ));
		}
	}
	// 2. phoneBook의 모든 목록을 한번에 출력해주는 메서드
	public void printAll() {
		Set<String> groupNames = phoneBook.keySet();
		
		for(String groupName: groupNames) {
			System.out.println("* * * * *"+groupName+"* * * * *");
			
			// 전화번호 이름
			HashMap<String, String> numberAndNames = phoneBook.get(groupName);
			if(numberAndNames.size() == 0) {
				System.out.println("비어 있음");
			}else {
				for(String number: numberAndNames.keySet()) {
					// 키 값은 넘버에 들어가면 이 값 가지고 해당 내용 출력하면 됨.
					System.out.printf("%s : %s\n", numberAndNames.get(number),number);  
				}
			}
		}
	}
	// 3. 이미 존재하는 그룹에 전화번호를 추가하는 메서드(그룹이 없으면 추가 못함)
	//    (> 모든 전화번호를 HashSet형태로 반환 및 중복 체크 기능도 있어야 함)

	public AddPhoneMessage addPhoneNo(String groupName, String number, String name) {
		if(!phoneBook.containsKey(groupName)) { // 폰북에 그룹이 없는 경우
			return new AddPhoneMessage("없는 그룹입니다." , AddPhoneMessage.NOT_EXISITING_GROUP);
		}else {
			HashMap<String, String> numberAndNames = phoneBook.get(groupName);
		
			if(getAllNumber().contains(number) ) {
				return new AddPhoneMessage("이미 등록된 번호입니다.", AddPhoneMessage.EXISITING_NUMBER);
			}
		numberAndNames.put(number, name);
		return new AddPhoneMessage("정상 등록됨", AddPhoneMessage.ADD_SUCCESS);
			
			
		}
		
	}
	
	// 모든 전화번호를 HashSet 형대로 반환하는 메서드
	private Set<String> getAllNumber(){
		HashSet<String> allNumbers = new HashSet<>( );
		
		for( HashMap<String, String> group : phoneBook.values( ) ) { // 다른 코드에 있을 수도 있어서 전체에서 확인하기 위해서 전체 다 불러서 
			allNumbers.addAll(group.keySet());
		}
		return allNumbers;
	}
	
	// 전화번호 중복 체크 메서드
	private boolean checkDupleNumber(String number) {
		return getAllNumber().contains(number);
	}
	
	// 4. 전화번호의 일부를 입력하}면 입력한 부분과 일치하는 모든 사람의 목록을 출력하는 메서드
	public void searchByNumber(String number) {
		System.out.println("전화번호 출력"+number+"***");
		for(HashMap<String, String> group: phoneBook.values()) {
			for (String key: group.keySet()) {
				if (key.contains(number)) {
					System.out.printf("%s : %s\n",group.get(key),key);
				}
				
			}
		}
	}
	
	
	// 5. 이름을 입력하면 해당하는 사람의 전화번호를 모두 출력하는 메서드(동명이인이 있는 경우 여러개 출력)
	public void searchByName(String InputName) {
		System.out.println("전화번호 출력"+InputName+"***");
		for(HashMap<String, String> group: phoneBook.values()) {
			for (Entry<String, String> entry: group.entrySet()) {
				String number = entry.getKey();
				String name = entry.getValue();
				if (name.contains(InputName)) {
					System.out.printf("%s : %s\n",group.get(name),number);
				}
				
			}
		}
	}
	// *** 변경된 내용이 파일에 저장되어 프로그램을 다시 실행할 때도 유지되도록 만들어 주세요.!!!
	// save & load
	public void save() {
		FileWriter out = null;
		
		try {
			out = new FileWriter(saveFile);
			// 전화번호부의 내용을 나름대로의 문자열로 구성하여 파일에 저장
			for (String groupName : phoneBook.keySet()) {
				out.write(groupName + ":");
				for(Entry<String, String> e : phoneBook.get(groupName).entrySet()) {
					out.write(String.format("%s=%s ", e.getKey(),e.getValue())); // %s=%s 이 부분에 띄어쓰기 해줘서 구분값 사용해줘야 함,
				}
				out.write('\n');
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(out != null) Closer.close(out);
		}
	} 
	
	
	public void load() {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(saveFile));
			String line = null;
			while((line=in.readLine()) != null) {
				String [] groupAndEntry = line.split(" : ");
				// 함수를 심플하게 만들면 재사용성이 올라감.
				if(groupAndEntry.length == 1) {
					addGroup(groupAndEntry[0]);
				}else {
					addGroup(groupAndEntry[0]);
					String [ ] entry = groupAndEntry[1].split( " " ); // 각 그룹의 전화번호, 이름
					
					for(String e:entry) {
						String[ ] phoneAndName = e.split(" = "); 
						addPhoneNo (groupAndEntry[0], phoneAndName[0], phoneAndName[1]);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(in != null) Closer.close(in);
		}
	}
	
	
}
	

// 상태 정보를 넘기는 애 만들기
class AddPhoneMessage{
	String msg;
	int type;
	
	final static int NOT_EXISITING_GROUP = 0;
	final static int EXISITING_NUMBER = 1;
	final static int ADD_SUCCESS = 2;
	
	public AddPhoneMessage(String msg, int type) {
		this.msg = msg;
		this.type = type;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return msg;
	}
	
}
