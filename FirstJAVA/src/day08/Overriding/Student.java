package day08.Overriding;

public class Student extends Person {
	protected String studentId;
	protected String major;
	
	// @Override - > 부모로부터 상속받은 것 변경해서 사용할 거다
	public String getDetails() {
		// return super.getDetails();
		return "이름"+name+"나이"+age+"studentId"+name+"학과"+major;
	}
	// Overriding이란?
	// 부모 클래스로부터 상속받은 메서드를 자식클래스에서 행위를 바꾸거나 보완하기 위해서 '다시 정의'해서
	// 사용하는 것
	// [재정의 규칙]
	// - 상속을 전제로 함.
	// - 리턴타입, 메서드이름,파라미터 변수 선언이 일치해야 함. -> 이것이 다르면 그냥 메서드를 정의한 것이 된다.
	// - 접근제한자는 같거나, more public해야 함.   ex) default->public이나 protected에 가까워야 함.
	
	
	
	
	
}
