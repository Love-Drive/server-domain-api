package org.coiol.platform.core.model;

import java.io.Serializable;


public class Company implements Serializable{
	private static final long serialVersionUID = 3930840900766829128L;
	private double id;
	private String name;
	private String code;
	private int age;
	
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", code=" + code + ", age=" + age + "]";
	}
	
}
