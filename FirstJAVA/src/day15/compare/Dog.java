package day15.compare;
// 미리 조건틀 만들기
public class Dog implements Comparable<Dog>{
	String dogId;
	String dogName;
	int weight;
	
	// Comparable 인터페이스의 추상 메서드 정의
	@Override
	public int compareTo(Dog o) {
		// 크기를 몸무게로 비교하겠다.
		return this.weight - o.weight;	
	}
	
	public Dog(String dogId, String dogName, int weight) {
		super();
		this.dogId = dogId;
		this.dogName = dogName;
		this.weight = weight;
	}
	
	// 여기서 getter setter하는 이유?
	@Override
	public String toString() {
		return "Dog [dogId = "+dogId+", dogName =" +dogName+"]"+this.hashCode();
	}

	public String getDogId() {
		return dogId;
	}

	public void setDogId(String dogId) {
		this.dogId = dogId;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// 비교할 때는 비교에 대한 기준이 필요하다.
	
	// 객체간의 비교를 하기 위해서는 반드시 hashCode()와 equals()를 둘 다 재정의 해야 함.
	
	// equals 재정의
	@Override
	public boolean equals(Object obj) { // 다른 경우 정의해서 나머지 출력 // 부정에 대한 정의가 처리 속도가 빨라서 
		if(this == obj) return true;   // 주소까지 같은 자신일 경우 == 이콜쓴다 // 생성된 객체 그 자체를 비교하는 상황
		if(obj == null) return false; // obj의 객체가 생성되지 않은 상황
		if(getClass() != obj.getClass()) return false;  // getClass 지금 생성된 객체의 클래스가 뭐냐? - 생성 클래스 비교
		
		//만들어진 내부 멤버에 대한 비교를 위해 오브젝트 객체 캐스팅 해서 아더 비교
		Dog other = (Dog)obj;
		// dogId
		if(dogId == null) {
			if(other.dogId != null) { // dogId가 null이 아니라면
				return false;
			}
		}else if(!dogId.equals(other.dogId)) { // dogId가 같다면 
			return false;
		}
			
		// dogName
		if(dogName == null) {
			if(other.dogName != null)
			return false;
		}else if(!dogName.equals(other.dogName)) { // dogId가 같다면 
			return false;
		}
			
		//weight
		if(weight != other.weight) return false;
			
		return true;  // 위에 false인 경우들에 해당되지 않으면 true
	}
	
	
	// hashCode 재정의
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( (dogId == null) ? 0:dogId.hashCode() ); // 만약에 oo아니면 도그아이디 해시코드 받아와라
		result = prime * result + ( (dogName == null) ? 0:dogName.hashCode() ); // 만약에 oo아니면 도그네임 해시코드 받아와라
		result = prime * result + weight; 
		return result;
	}
	
	// 해시코드가 우연치 않게 겹치는 경우가 생길 수도 있기 때문에 해시코드 하나만 비교하지 않고 equals도 함께 확인하는 것이다.

	
	// Comparable implements하고 비교할 것 가져와서 비교 Comparable 인터페이스의 추상 메서드 정의
	
	
	
}
