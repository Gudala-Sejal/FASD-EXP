package com.klu.SpringConstructorID.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private int id;
	private String name;
	
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
	
	//constructor Injection
	private Address address;
	@Autowired
	public Student(Address address) {
		super();
		this.address = address;
		
	}
	
	public void dispaly() {
		System.out.println(id + " " +name+ " "+address.getCity());
	}
}
