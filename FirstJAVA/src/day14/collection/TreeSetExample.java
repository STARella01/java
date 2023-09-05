package day14.collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// 위치 계속 변경되기 때문에 인덱스 값 순서로 찾을 수 없다. 
		TreeSet<String>ts = new TreeSet<>();
			
			ts.add("computer");
			ts.add("monitor");
			ts.add("hello");
			ts.add("Java");
			ts.add("aaa");
			ts.add("get");
		
			for(String str : ts)	{
				System.out.print(str+'\t');
			}
			
	}

}
