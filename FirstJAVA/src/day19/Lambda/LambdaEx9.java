package day19.Lambda;


import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class LambdaEx9 {

	static Student[] list = {
		new Student("차은우",90,80,"컴공"),
		new Student("차은우2",95,85,"경제"),
		new Student("차은우3",100,75,"빅데이터")
	};
	
	public static void main(String[] args) {
		// Operator 인터페이스
		
		// 최대 수학 점수 
		System.out.println("최대 수학 점수 :");
		int max = maxOrMinMath ((a , b) ->{
			if(a >= b) {
				return a;
			}else {
				return b;
			}
		});
		System.out.println(max);
		
		// 최소 수학 점수
		System.out.println("최소 수학 점수 :");
		// 삼항 연산식 
		int min = maxOrMinMath ( (a , b) -> (a <= b) ? a : b );
		
//		int min = maxOrMinMath ((a , b) ->{
//			if(a <= b) {
//				return a;
//			}else {
//				return b;
//			}
//		});
		System.out.println(min);		
		
		
		// ==========================================
		
		// 최대 영어 점수 
				System.out.println("최대 수학 점수 :");
				int max1 = maxOrMinEng ((a , b) ->{
					if(a >= b) {
						return a;
					}else {
						return b;
					}
				});
				System.out.println(max1);
				
			// 최소 영어 점수
			System.out.println("최소 수학 점수 :");
			// 삼항 연산식 
			int min1 = maxOrMinEng ( (a , b) -> (a <= b) ? a : b );
			
//				int min = maxOrMinMath ((a , b) ->{
//					if(a <= b) {
//						return a;
//					}else {
//						return b;
//					}
//				});
			System.out.println(min1);		
		
				
				
		// ==========================================
				
		
		// 최대 평균 점수
		System.out.println("최대 평균 점수 :");
		System.out.println(maxOrMinAvg( (a , b) -> (a >= b ? a : b) ));  // a가 b보다 크거나 같다면
		
		// 최소 평균 점수
		System.out.println("최소 평균 점수 :");
		System.out.println(maxOrMinAvg( (a , b) -> (a <= b ? a : b) )); // a가 b보다 작거나 같다면
		
		
		
	} // 메인 메서드 end
	
	
	// 평균값
	static double maxOrMinAvg(DoubleBinaryOperator op) {
		double result = (list[0].getMath() + list[0].getEng()) / 2.0;
		for(Student s : list) {
			result = op.applyAsDouble(result, (s.getMath()+s.getEng()) / 2.0);
		}
		return result;
	}
	
	// 수학 점수 최대값 최소갑 구하기
	static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for(Student s :list) {
			result = op.applyAsInt(result,s.getMath());
		}
		return result;
	}
	
	
	// 영어 점수 최대값 최소갑 구하기
	static int maxOrMinEng(IntBinaryOperator op) {
		int result = list[0].getEng();
		for(Student s :list) {
			result = op.applyAsInt(result,s.getEng());
		}
		return result;
	}
	
}
