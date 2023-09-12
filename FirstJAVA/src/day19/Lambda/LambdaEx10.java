package day19.Lambda;

import java.util.function.Predicate;

public class LambdaEx10 {

	static Student[] list = {
		new Student("차은우",90,80,"컴공"),
		new Student("차은우2",95,85,"경제"),
		new Student("차은우3",100,75,"컴공")
	};
	
	public static void main(String[] args) {
		// Predicate : 매개변수 O , 반환타입 : boolean 인 경우
		// 조건이 참이나 거짓이에 따라 선정한다.
		
		// 과가 컴공인 학생들의 영어 점수 평균
		double avg = avgEng(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공과 평균 영어점수 :"+avg);
		
		// 과가 컴공인 학생들의 수학 점수 평균
		double avg2 = avgMath(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공과 평균 수학점수 :"+avg2);
	
	}

	private static double avgEng(Predicate<Student> predicate) {
		
		// 과목 확인용
		int count = 0; // count 사용 이유 : 몇개 더한 후 평균을 구해햐 하기 때문에 사용
		int sum = 0;
		for(Student student : list) {
			// equals 배교
			if(predicate.test(student)) { // 내가 비교하려는 대상에 대한 확인용으로 쓰임
				count++;
				sum += student.getEng();
			}
		}
		return (double) sum/count;
	}
	
	
	private static double avgMath(Predicate<Student> predicate) {
		
		// 과목 확인용
		int count = 0; // count 사용 이유 : 몇개 더한 후 평균을 구해햐 하기 때문에 사용
		int sum = 0;
		for(Student student : list) {
			// equals 배교
			if(predicate.test(student)) { // 내가 비교하려는 대상에 대한 확인용으로 쓰임
				count++;
				sum += student.getMath();
			}
		}
		return (double) sum/count;
	}
	
}