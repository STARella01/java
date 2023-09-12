package day17.quiz2;

import java.util.Scanner;

public class PbConsole {
	
	// 폰북을 위한 객체
	static Scanner sc = new Scanner(System.in);
	private static Object book;


	public static void main(String[] args) {
		while (true) {
			System.out.println("==== What to do ====");			
			System.out.println("1. New Group");
			System.out.println("2. Print");
			System.out.println("3. New Address");
			System.out.println("4. Find Phone");
			System.out.println("5. Find Name");
			System.out.println("6. Exit");
			System.out.print("> ");
			int behavior = sc.nextInt();
			sc.nextLine();

			switch (behavior) {
			case 1:
				doNewGroup();
				break;
			case 2:
				book.printAll();
				break;
			case 3:
				doNewAddress();
			case 4:				
			case 5:
			case 6:
			default:
				break;
			}
		}		

	}


	private static void doNewGroup() {
		// TODO Auto-generated method stub
		System.out.println("Enter New Group Name :");
		book.addGroup(sc.nextLine());
		book.save();
		System.out.println();
	}
	
	private static void doNewAddress() {
		System.out.println("Enter Group Name :");
		String groupName = sc.nextLine();
		System.out.println("Enter Phone Num :");
		String number = sc.nextLine();
		System.out.println();
		String name = sc.nextLine();
		
		AddPhoneMessage addmsg = book.addPhoneNo(groupName, number, name);
		// addMsg를 통해 적절한 처리
		
		if(addMsg.type == AddPhoneMessage.ADD_SUCCESS) {
			book.save();
		}else if((addMsg.type == AddPhoneMessage.NOT){
			
		}else if() {
			
		}
	
	}

}