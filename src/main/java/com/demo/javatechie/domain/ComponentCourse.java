package com.demo.javatechie.domain;

import jakarta.persistence.Id;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
public class ComponentCourse {

	@GeneratedValue
	@Id
	private Long id;
	private String componentCourseId;
	private String componentCourseName;
	private int durationInDays; 
	private int durationInHours;
	
	
	@ManyToOne
	@JoinColumn(name="groupCourseId",referencedColumnName="id")
	@JsonBackReference
	private GroupCourse groupCourse;
	
	
	public GroupCourse getGroupCourse() {
		return groupCourse;
	}
	public void setGroupCourse(GroupCourse groupCourse) {
		this.groupCourse = groupCourse;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getComponentCourseId() {
		return componentCourseId;
	}
	public void setComponentCourseId(String componentCourseId) {
		this.componentCourseId = componentCourseId;
	}
	public String getComponentCourseName() {
		return componentCourseName;
	}
	public void setComponentCourseName(String componentCourseName) {
		this.componentCourseName = componentCourseName;
	}
	public int getDurationInDays() {
		return durationInDays;
	}
	public void setDurationInDays(int durationInDays) {
		this.durationInDays = durationInDays;
	}
	public int getDurationInHours() {
		return durationInHours;
	}
	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}	
	
}
