package com.lisz.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {
	private Integer id;
	private String name;
	private String password;
	private Integer age;
	private String gender;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birth;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				", age=" + age +
				", gender='" + gender + '\'' +
				", birth=" + birth +
				'}';
	}
}
