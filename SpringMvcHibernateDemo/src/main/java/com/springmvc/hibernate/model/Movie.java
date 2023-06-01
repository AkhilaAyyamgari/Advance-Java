package com.springmvc.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Movie {
@Id	
@GeneratedValue	
@Column
private int id;
@Column
private String name;
@Column
private long budget;
@Column
private String releaseDate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getBudget() {
	return budget;
}
public void setBudget(long budget) {
	this.budget = budget;
}
public String getReleaseDate() {
	return releaseDate;
}
public void setReleaseDate(String releaseDate) {
	this.releaseDate = releaseDate;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.getId() +"/t"+ this.getName() +"/t"+ this.getReleaseDate() +"/t"+ this.getBudget();
}

}
