package com.demo.javatechie.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity 
public class GroupCourse {

	@GeneratedValue
	@Id
	private int id;
	
	private String groupCourseId;
	private String groupCourseName;
	
	@OneToMany(mappedBy = "groupCourse", cascade = CascadeType.ALL)  // id is mapped to many componentcourse
	@JsonManagedReference
	private List<ComponentCourse> componentCourse;
	
	
	
	public List<ComponentCourse> getComponentCourse() {
		return componentCourse;
	}
	public void setComponentCourse(List<ComponentCourse> componentCourse) {
		this.componentCourse = componentCourse;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroupCourseId() {
		return groupCourseId;
	}
	public void setGroupCourseId(String groupCourseId) {
		this.groupCourseId = groupCourseId;
	}
	public String getGroupCourseName() {
		return groupCourseName;
	}
	public void setGroupCourseName(String groupCourseName) {
		this.groupCourseName = groupCourseName;
	}
	
	
}
