package com.tom.bean;

public class User {
  private int id;
  private String name;
  private String sex;
  private int age;
public User(int id, String name, String sex, int age) {
	super();
	this.id = id;
	this.name = name;
	this.sex = sex;
	this.age = age;
}
public User() {
	super();
}

public User(String name, String sex, int age) {
	super();
	this.name = name;
	this.sex = sex;
	this.age = age;
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the sex
 */
public String getSex() {
	return sex;
}
/**
 * @param sex the sex to set
 */
public void setSex(String sex) {
	this.sex = sex;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", age="
			+ age + "]";
}
  
}
