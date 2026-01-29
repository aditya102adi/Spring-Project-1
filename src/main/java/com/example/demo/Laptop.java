package com.example.demo;


import org.springframework.stereotype.Component;

@Component
public class Laptop {
	String brand;
	int prince;
	String processor;
	int ramSize;
	
	OperatingSystem os;
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(String brand, int prince, String processor, int ramSize, OperatingSystem os) {
		super();
		this.brand = brand;
		this.prince = prince;
		this.processor = processor;
		this.ramSize = ramSize;
		this.os = os;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrince() {
		return prince;
	}

	public void setPrince(int prince) {
		this.prince = prince;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", prince=" + prince + ", processor=" + processor + ", ramSize=" + ramSize
				+ ", os=" + os + "]";
	}

	public OperatingSystem getOs() {
		return os;
	}

	public void setOs(OperatingSystem os) {
		this.os = os;
	}
}
