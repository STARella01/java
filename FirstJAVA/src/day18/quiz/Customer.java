package day18.quiz;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 716712537454368915L;
	
	// 멤버 변수
	private String name;
	private String gender;
	private String email;
	private int birthYear;
	
	
	public Customer() {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getBirthYear() {
		return birthYear;
	}


	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", email=" + email + ", birthYear=" + birthYear + "]";
	}
	
	// 동등 비교를 위해 HashCode와 equals  -> 비교를 위해 수정 필요
	
	
	
	
}
