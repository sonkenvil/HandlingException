package com.fpt.exception.entities;

public class User {
	private long id;
	private String userName;
	private String passWord;
	private int age;
	private long salary;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", age=" + age + ", salary="
				+ salary + "]";
	}
	public User(long id, String userName, String passWord, int age, long salary) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.age = age;
		this.salary = salary;
	}
	public User() {
		super();
	}
	
	
}
