package day14.collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Stack<Integer> st = new Stack<>();
			st.add(1);
			st.add(2);
			st.add(3);
			st.push(4);
			
			System.out.println(st.toString());
			System.out.println(st.get(0));   // 1번 호출됨
			System.out.println(st.search(1)); // 4번 호출됨  - 이거는 실 stack 저장 순서로 봐야함
			System.out.println();
			
			while(!st.isEmpty()) {
				System.out.println(st.pop());
			}
	}		

}
