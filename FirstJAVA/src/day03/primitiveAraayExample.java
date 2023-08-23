package day03;

public class primitiveAraayExample {

	public static void main(String[] args) {
		char[] s; // primitive형 배열 선언
		//char[5] s2;  오류 - 선언 시 크기 명시 못함
		
		s = new char[5]; //  primitive형 배열 생성 - 생성하면 초기값은 "\u0000"
		
		s[0] = 'A'; // [숫자] -> 여기서 숫자는 인덱스라고 부름 즉, 순서 0부터 시작함 
		s[1] = 'B';
		s[2] = 'C';
		s[3] = 'D';
		s[4] = 'E';
		
		for (int i=0; i < s.length; i++) { // s.length의 길이
			System.out.println(s[i] + "\t");
		}
			
		System.out.printf("\n%s",s);
		
	}

}
