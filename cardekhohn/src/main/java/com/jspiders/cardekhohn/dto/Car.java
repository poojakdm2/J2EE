package com.jspiders.cardekhohn.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Cars")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String model;
	@Column(nullable = false)
	private String fuel_Type;
	@Column(nullable = false)
	private String color;
	@Column(nullable = false)
	private double price;
	
	

}
