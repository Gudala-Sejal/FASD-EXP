package com.klu.SpringSetterID.model;

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

		private Address adress;
		
		
		public Address getAdress() {
			return adress;
		}
		@Autowired
		public void setAdress(Address adress) {
			this.adress = adress;
		}

		private Department department;
		
		public Department getDepartment() {
			return department;
		}
		@Autowired
		public void setDepartment(Department department) {
			this.department = department;
		}
		
		public void display() {
			System.out.println(id + " " + name);
			System.out.println("Student lives in " + adress.getCity());
			System.out.println("My Department is "+department.getDepartment());
		}
		
		
}