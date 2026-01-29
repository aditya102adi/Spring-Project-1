package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class OperatingSystem {
	String name;
	String version;
	
	public OperatingSystem() {
		// TODO Auto-generated constructor stub
	}

	public OperatingSystem(String name, String version) {
		super();
		this.name = name;
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "OperatingSystem [name=" + name + ", version=" + version + "]";
	}

}
