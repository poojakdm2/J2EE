package com.jspider.hibernatejpa7.dto;

import javax.persistence.Entity;

import javax.persistence.Id;


import lombok.Data;

@Data
@Entity
public class StudentDTO {
	@Id 
	private int id;
	private String name;
	private int age;
	private String email;
	private long mobile;

}
