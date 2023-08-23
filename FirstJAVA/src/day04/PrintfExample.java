package day04;

public class PrintfExample {

	public static void main(String[] args) {
		// print(), printf(), println() 
		
		// print()   -> System.out.print() : 전달받은 데이터를 콘솔에 출력한다.
		// println() -> System.out.println() : 전달받은 데이터를 콘솔에 출력, 마지막에 줄바꿈 문자인 '\n'이 추가됨.
		// printf()  -> System.out.printf() : 출력 형식(format)을 먼저 지정한 뒤 형식에 포함된 서식 문자에 값을 대입하여 원하는 문자열을 편리하게 출력할 수 있게 함.

		/*
		 *	서식문자 종류
		 *	%d : 10진수 정수
		 *	%o : 8진수 정수
		 *	%x : 16진수 정수
		 *	%s : 문자열
		 *	%f : 실수
		 *	%c : 문자
		 * 
		 * */
		
		// 정수 출력 		
		// 음수 왼쪽 / 양수 오른쪽 정렬
		int a = 5, b = 7;
		System.out.printf("%d + %d = %d\n", a,b,a+b);
		
		System.out.printf("%10d\n" , a); // %와 d사이의 숫자는 출력공간 확보
		System.out.printf("%20d\n" , a); // %와 d사이의 숫자는 출력공간 확보 -> 20퍼센트 정로의 \n 공간을 생성해라
		System.out.printf("%020d\n" , a); // %와 d사이의 숫자는 출력공간 확보, 숫자 0은 빈곳을 0으로 채움
		
		System.out.printf("%-10d??\n" , a); // 10칸확보 후 풀력, 왼쪽 출력
		
		System.out.printf("%+10d\n" , -7); // 숫자 앞 "+"는 부호 출력
		System.out.printf("%+-10d\n" , -7); // 숫자 앞 "+"는 부호 출력
		
		
		//실수 출력
		double d = 1234.5678;
		
		System.out.printf("%f\n",d);
		
		System.out.printf("%.3f\n",d); // .숫자는 소수점 숫자 만큼 출력  여기서는 .3이기때문에 3자리 수 까지만 출력
		
		System.out.printf("%20.3f\n",d); // .숫자는 소수점 숫자 만큼 출력  여기서는 .3이기때문에 3자리 수 까지만 출력
		System.out.printf("%020.3f\n",d); // 20칸 확보, 앞 여백에 0으로 채움, 소숫점 3자리 까지
		System.out.printf("%-20.3f\n",d); //  20칸 확보, 오른쪽 정렬, 소숫점 3자리 까지
		
		// 문자열 출력
		String str = "hello world!";
		
		System.out.printf("%s\n" , str); 
		System.out.printf("%30s\n" , str);  // 30칸 확보 후 출력
		System.out.printf("%-30ㄴ%s\n" , str , str);  // 30칸 확보 후 출력 , 왼쪽 정렬 -> 이거 제대로 노출 안됨 확인 필요
	}
	
	

}
