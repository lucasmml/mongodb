package com.wp.mb.simplemongodb.entity;

import java.io.Serializable;

/**
 * http://www.mballem.com/
 */
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String firstName;
	private String lastName;
	private int age;
	private Phone phone;

	public Person() {
		super();
	}

	public Person(String firstName, String lastName, int age, Phone phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Person{" + "id='" + id + '\'' + ", firstName='" + firstName
				+ '\'' + ", lastName='" + lastName + '\'' + ", age=" + age
				+ ", phone=" + phone + '}';
	}
}