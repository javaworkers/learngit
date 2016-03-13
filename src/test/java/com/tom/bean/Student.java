package com.tom.bean;

public class Student {
  private int id;
  private String name;
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Student() {
	super();
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
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}
  
}
