package com.tom.VO;

public class VOUser {
  private String name;
  private int minAge;
  private int maxAge;
public VOUser(String name, int minAge, int maxAge) {
	super();
	this.name = name;
	this.minAge = minAge;
	this.maxAge = maxAge;
}
public VOUser() {
	super();
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
 * @return the minAge
 */
public int getMinAge() {
	return minAge;
}
/**
 * @param minAge the minAge to set
 */
public void setMinAge(int minAge) {
	this.minAge = minAge;
}
/**
 * @return the maxAge
 */
public int getMaxAge() {
	return maxAge;
}
/**
 * @param maxAge the maxAge to set
 */
public void setMaxAge(int maxAge) {
	this.maxAge = maxAge;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "VOUser [name=" + name + ", minAge=" + minAge + ", maxAge=" + maxAge
			+ "]";
}
  
}
