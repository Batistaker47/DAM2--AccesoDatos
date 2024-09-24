package utils;

public class Staff {
	
	protected String firstName;
	protected String lastName;
	protected String nickname;
	protected int salary;
	protected String currency;
	
	public Staff(String firstName, String lastName, String nickname, int salary, String currency) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickname = nickname;
		this.salary = salary;
		this.currency = currency;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Staff\nFirst Name:" + firstName + "\nLastName: " + lastName + "Nickname: " + nickname + "\nSalary: "
				+ salary + currency;
	}
	
	
	
}
