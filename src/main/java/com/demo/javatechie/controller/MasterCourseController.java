package com.demo.javatechie.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.javatechie.domain.*;

import com.demo.javatechie.repository.GroupCourseRepository;
import com.demo.javatechie.repository.ComponentCourseRepository;

@RestController
public class MasterCourseController {
	
	//Logger  logger = LoggerFactory.getLogger(MasterCourseController.class);

	@Autowired
	public ComponentCourseRepository ms;
	
	@Autowired
	public GroupCourseRepository gs;
	
	@GetMapping("/get")
	public String fetchData() {
		
		return "Hi";
		
	}
	

	@PostMapping("/saveGroup/m")
	public void createMasterCourse(@RequestBody ComponentCourse componentCourse){
		
		ms.save(componentCourse);
	}
	
	
	@PostMapping("/saveGroup")
	public void createGroupCourse(@RequestBody GroupCourse groupCourse){
		
		gs.save(groupCourse);
	}
	
	
	@GetMapping("/get/{id}")
	public Optional<ComponentCourse> findByComponentCourseId(@PathVariable Long id ) {
		
		return ms.findById(id);
		
		
	}
	
	//findByGroupCourseId
	@GetMapping("/get/group/{id}")
	public Optional<GroupCourse> findByGroupCourseId(@PathVariable Long id) {
		
		return gs.findById(id);
		
	}
	
}
