package com.fatihbatman.realestatesaleslease.entities;


public class HousingType {
	
	private int id;

	private String name;
	
	public HousingType(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public HousingType() {
		super();
	}
	public HousingType(String name) {
		super();
		this.name = name;
	}
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
}
