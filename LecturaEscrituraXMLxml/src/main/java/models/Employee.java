package models;

public class Employee {
	
	protected String firstName;
	protected String lastName;
	protected String nickname;
	protected String salary;
	protected String currency;
	
	public Employee(String firstName, String lastName, String nickname, String salary, String currency) {
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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
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
		return "Employee First Name:" + firstName + "\nLastName: " + lastName + "\nNickname: " + nickname + "\nSalary: "
				+ salary + "\nCurrency: " + currency;
	}
	
	
	
}
