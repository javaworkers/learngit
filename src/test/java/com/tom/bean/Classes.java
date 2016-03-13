package com.tom.bean;

import java.util.Set;

public class Classes {
   private int id;
   private String name;
   private Teacher teacher;
   private Set<Student> students;
   public Classes(int id, String name, Teacher teacher) {
	super();
	this.id = id;
	this.name = name;
	this.teacher = teacher;
   }
   public Classes() {
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
/**
 * @return the teacher
 */
public Teacher getTeacher() {
	return teacher;
}
/**
 * @param teacher the teacher to set
 */
public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}
/**
 * @return the students
 */
public Set<Student> getStudents() {
	return students;
}
/**
 * @param students the students to set
 */
public void setStudents(Set<Student> students) {
	this.students = students;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Classes [id=" + id + ", name=" + name + ", teacher=" + teacher
			+ ", students=" + students + "]";
}

    
}
