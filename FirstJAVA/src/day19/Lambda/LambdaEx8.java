package day19.Lambda;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class LambdaEx8 {
	
	static Student[] list = {
			new Student("차은우",90,80,"컴공"),
			new Student("차은우2",95,85,"경제")
	};
	
	public static void main(String[] args) {
		// Function<T , R>  
		System.out.println("학생명 :");
		printString(t -> t.getName());
		
		System.out.println("전공 : ");
		printString(t -> t.getMajor());
		
		System.out.println("영어 점수 :");
		printInt(t -> t.getEng());
		
		System.out.println("수학 점수 :");
		printInt(t -> t.getMath());
		
		System.out.println("영어 점수 합계 :");
		printTot(t -> t.getEng());

		System.out.println("수학 점수 합계 :");
		printTot(t -> t.getMath());
		
		System.out.println("영어 점수 평균 :");
		printAvg( t -> t.getEng());
	}
	
	static void printAvg(ToDoubleFunction<Student> f ) {
		double sum = 0;
		for(Student s :list ) {
			sum += f.applyAsDouble(s);
		}
		System.out.println(sum / list.length);
	}
	
//	static void printTot( Function<Student, Integer> f ) {
//		int sum = 0;
//		for(Student s :list ) {
//			sum += f.apply(s);
//		}
//		System.out.println(sum);
//	}
	
	static void printTot( ToIntFunction<Student> f ) {  // ToIntFunction 사용하면 메서드 명이 달라져 버림
		int sum = 0;
		for(Student s :list ) {
			// sum += f.apply(s);
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}
	

	// 오버로드
	static void printInt(Function<Student, Integer> f) {
		for(Student s : list) { // 향상된 for문
			System.out.println( f.apply(s)+" " ); // apply - function의 추상 메서드
		}
		System.out.println();
	}
	
	static void printString( Function<Student, String> f ) { // Student - 타입 , String - 반환타입
		for(Student s : list) { // 향상된 for문
			System.out.println( f.apply(s)+" " ); // apply - function의 추상 메서드
		}
		System.out.println();
	} // 	Function<Student, String> f 
	 //		= t값을 받아서 getName을 반환값으로 받아쓰겠다는 얘기
	//		= t - > t.getName()
	
}

class Student {
	private String name;
	private int eng;
	private int math;
	private String major;
	
	public Student(String name, int eng, int math, String major) {
		super();
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
}