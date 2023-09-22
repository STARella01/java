package day27.dbconnect;

public class PersonsVO  { // 객체 값 저장위해 생성
	
	// 생성자 초기화
	private int Id;
	private String FirstName;
	private String LastName;
	private int Age;
	private String City;
	
	// 
	public PersonsVO(int id, String firstName, String lastName, int age, String city) {
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		this.Age = age;
		City = city;
	}

	// getter setter
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}
	
	@Override
	public String toString() {
		return "PersonsVO [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age
				+ ", City=" + City + "]";
	}

}

