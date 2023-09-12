package day18;

public class Customer {

		String name;
		char gender;
		String email;
		int birth_date;
		
		// 
		public Customer() {
			// TODO Auto-generated constructor stub
		}
		

		// 필드값 생성
		public Customer(String name, char gender, String email, int birth_date) {
			super();
			this.name = name;
			this.gender = gender;
			this.email = email;
			this.birth_date = birth_date;
		}
		

		// getter setter
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getBirth_date() {
			return birth_date;
		}

		public void setBirth_date(int birth_date) {
			this.birth_date = birth_date;
		}
		

		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
		}
		
		
		
		
}


